package com.org.GeopoliticaRD.managers;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.org.GeopoliticaRD.interfaces.data.acces.DataOperation;
import com.org.GeopoliticaRD.models.Municipio;
import com.org.GeopoliticaRD.models.Provincia;
import com.org.GeopoliticaRD.utility.Utility;

public class ManagerMunicipio implements DataOperation<Municipio> {
	private Session hibernteSession;
	private Utility util;

	public ManagerMunicipio() {

		this.util = new Utility();
		this.hibernteSession = util.getHibernteSession();
	}

	public Municipio find(long id) {
		Criteria criteria = this.hibernteSession.createCriteria(Municipio.class);
		criteria.add(Restrictions.eq("id", id));
		return (Municipio) criteria.uniqueResult();
	}

	public void update(Municipio municipio) {
		this.hibernteSession.update(municipio);

	}

	public void delete(Municipio municipio) {
		Query query = this.hibernteSession.createQuery("Delete from Municipio where id=:id");
		query.setLong("id", municipio.getId());

	}

	@Override
	public Municipio [] find() {

		return (Municipio[]) this.hibernteSession.createCriteria(Municipio.class).list().toArray();
	}

	@Override
	public Municipio findOne(long id) {
		// TODO Auto-generated method stub
		return (Municipio) this.hibernteSession.createCriteria(Municipio.class).add(Restrictions.eq("id", id))
				.uniqueResult();
	}

	@Override
	public void delete(long id) {

		Query query = this.hibernteSession.createQuery("delete from Municipio where provincia_id=:id");
		query.setLong("id", id);
		query.executeUpdate();

	}
	
	
	public Municipio [] findMunicipios(Provincia provincia)
	{
		
		return null;
	}

}
