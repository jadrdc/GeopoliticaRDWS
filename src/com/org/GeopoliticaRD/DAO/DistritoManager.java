package com.org.GeopoliticaRD.DAO;

import java.util.List;

import com.org.GeopoliticaRD.managers.DistritoDAO;
import com.org.GeopoliticaRD.models.Distrito;

public class DistritoManager  {
	private DistritoDAO managerDistr = new DistritoDAO();
	private static final long serialVersionUID = 1L;

	public Distrito findOne(long id) {
		return this.managerDistr.findOne(id);
	}

	public List<Distrito> findAll() {
		return this.managerDistr.find();
	}
	
	public void delete(long id){
		this.managerDistr.delete(id);
	}
	
	public void update(Distrito distrito)
	{
		this.managerDistr.update(distrito);
	}

}
