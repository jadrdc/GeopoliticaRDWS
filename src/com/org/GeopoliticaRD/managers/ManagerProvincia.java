package com.org.GeopoliticaRD.managers;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.service.ServiceRegistry;

import com.org.GeopoliticaRD.models.Provincia;

public class ManagerProvincia {
	private Session hibernteSession;

	public ManagerProvincia() {
		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(Provincia.class);
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();

		// builds a session factory from the service registry
		hibernteSession = configuration.buildSessionFactory(serviceRegistry).openSession();

	}

	public List<Provincia> findPronvicias() {
		Criteria provinciaList = this.hibernteSession.createCriteria(Provincia.class);

		return (List<Provincia>) provinciaList.list();
	}

	public Provincia findProvincia(long id) {
		return (Provincia) this.hibernteSession.createCriteria(Provincia.class).add(Restrictions.eq("id", id))
				.uniqueResult();

	}

	public void delete(long id) {

		Query query = this.hibernteSession.createQuery("delete from Provincia where provincia_id=:id");
		query.setLong("id", id);
		query.executeUpdate();
	}

	public void update(Provincia p) {
		this.hibernteSession.update(p);

	}

}
