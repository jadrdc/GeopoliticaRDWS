package com.org.GeopoliticaRD.DAO;

import java.io.Serializable;
import java.util.List;

import com.org.GeopoliticaRD.managers.ManagerProvincia;
import com.org.GeopoliticaRD.models.Provincia;

public class ProvinciaDAO implements Serializable {
	private ManagerProvincia managerProv = new ManagerProvincia();
	private static final long serialVersionUID = 1L;

	public Provincia findOne(long id) {
		return this.managerProv.findOne(id);
	}

	public Provincia [] findAll() {
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
