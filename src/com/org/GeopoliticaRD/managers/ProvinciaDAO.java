package com.org.GeopoliticaRD.managers;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.org.GeopoliticaRD.interfaces.data.acces.DataOperation;
import com.org.GeopoliticaRD.models.Provincia;
import com.org.GeopoliticaRD.utility.Utility;

public class ProvinciaDAO implements DataOperation<Provincia> {
	private Session hibernteSession;
	private Utility util;

	public ProvinciaDAO() {
		this.util = new Utility();
		this.hibernteSession = util.getHibernteSession();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.org.GeopoliticaRD.managers.DatabaseOperation#find()
	 */
	@Override
	public List<Provincia> find() {
		Criteria provinciaList = this.hibernteSession.createCriteria(Provincia.class);

		return provinciaList.list();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.org.GeopoliticaRD.managers.DatabaseOperation#findOne(long)
	 */
	@Override
	public Provincia findOne(long id) {
		return (Provincia) this.hibernteSession.createCriteria(Provincia.class).add(Restrictions.eq("id", id))
				.uniqueResult();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.org.GeopoliticaRD.managers.DatabaseOperation#delete(long)
	 */
	@Override
	public void delete(long id) {

		Query query = this.hibernteSession.createQuery("delete from Provincia where provincia_id=:id");
		query.setLong("id", id);
		query.executeUpdate();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.org.GeopoliticaRD.managers.DatabaseOperation#update(com.org.
	 * GeopoliticaRD.models.Provincia)
	 */
	@Override
	public void update(Provincia p) {
		this.hibernteSession.update(p);

	}

}
