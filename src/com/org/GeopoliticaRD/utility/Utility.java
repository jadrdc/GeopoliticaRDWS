package com.org.GeopoliticaRD.utility;

import org.hibernate.Session;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.org.GeopoliticaRD.models.Distrito;
import com.org.GeopoliticaRD.models.Municipio;
import com.org.GeopoliticaRD.models.Provincia;

public class Utility {
	private Session hibernteSession;

	public Utility() {

		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(Provincia.class);
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();

		configuration.addAnnotatedClass(Municipio.class);
		configuration.addAnnotatedClass(Distrito.class);
		hibernteSession = configuration.buildSessionFactory(serviceRegistry).openSession();

	}


	public Session getHibernteSession() {
		return hibernteSession;
	}

	public void setHibernteSession(Session hibernteSession) {
		this.hibernteSession = hibernteSession;
	}

}
