package com.org.GeopoliticaRD.managers;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.service.ServiceRegistry;

import com.org.GeopoliticaRD.interfaces.data.acces.DataOperation;
import com.org.GeopoliticaRD.models.Distrito;
import com.org.GeopoliticaRD.models.Municipio;
import com.org.GeopoliticaRD.models.Provincia;
import com.org.GeopoliticaRD.utility.Utility;

public class ManagerDistrito implements DataOperation<Distrito> {

	private Session hibernteSession;
	private Utility util;

	public ManagerDistrito() {

		this.util = new Utility();
		this.hibernteSession = util.getHibernteSession();

	}

	@Override
	public List<Distrito> find() {

		return this.hibernteSession.createCriteria(Distrito.class).list();
	}

	@Override
	public Distrito findOne(long id) {
		// TODO Auto-generated method stub
		return (Distrito) this.hibernteSession.createCriteria(Distrito.class).add(Restrictions.eq("id", id));
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Distrito p) {
		// TODO Auto-generated method stub

	}

}
