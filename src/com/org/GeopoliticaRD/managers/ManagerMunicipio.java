package com.org.GeopoliticaRD.managers;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.service.ServiceRegistry;

import com.org.GeopoliticaRD.models.Municipio;
import com.org.GeopoliticaRD.models.Provincia;

public class ManagerMunicipio {
	private Session hibernteSession;

	public ManagerMunicipio() {
		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(Provincia.class);
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();

		// builds a session factory from the service registry
		hibernteSession = configuration.buildSessionFactory(serviceRegistry).openSession();

	}

	public Municipio findMunicipio(long id) {
		Criteria criteria = this.hibernteSession.createCriteria(Municipio.class);

		criteria.add(Restrictions.eq("id", id));

		return (Municipio) criteria.uniqueResult();
	}
}
