package com.org.GeopoliticaRD.DAO;

import java.io.Serializable;
import java.util.List;

import com.org.GeopoliticaRD.managers.ProvinciaDAO;
import com.org.GeopoliticaRD.models.Provincia;

public class ProvinciaManager implements Serializable {
	private ProvinciaDAO managerProv = new ProvinciaDAO();
	private static final long serialVersionUID = 1L;

	public Provincia findOne(long id) {
		return this.managerProv.findOne(id);
	}

	public List<Provincia> findAll() {
		return this.managerProv.find();
	}
	
	public void delete(long id){
		this.managerProv.delete(id);
	}
	
	public void update(Provincia provincia)
	{
		this.managerProv.update(provincia);
	}

}
