package com.org.GeopoliticaRD.managers;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.org.GeopoliticaRD.interfaces.data.acces.DataOperation;
import com.org.GeopoliticaRD.models.Distrito;
import com.org.GeopoliticaRD.models.Municipio;
import com.org.GeopoliticaRD.utility.Utility;

public class DistritoDAO implements DataOperation<Distrito> {

	private Session hibernteSession;
	private Utility util;

	public DistritoDAO() {

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
		Query query = this.hibernteSession.createQuery("delete from Distrito where municipio_id=:id");
		query.setLong("id", id);
		query.executeUpdate();

	}

	@Override
	public void update(Distrito p) {
		this.hibernteSession.update(p);
	}
	
	
	public   List<Distrito>  findDistritos(Municipio municipio)
	{
		return null;
	}

}
