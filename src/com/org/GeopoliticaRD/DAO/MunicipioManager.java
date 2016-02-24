package com.org.GeopoliticaRD.DAO;

import java.util.List;

import com.org.GeopoliticaRD.managers.MunicipioDAO;
import com.org.GeopoliticaRD.models.Municipio;

public class MunicipioManager {

	private MunicipioDAO managerMuni = new MunicipioDAO();
	private static final long serialVersionUID = 1L;

	public Municipio findOne(long id) {
		return this.managerMuni.findOne(id);
	}

	public List<Municipio> findAll() {
		return this.managerMuni.find();
	}
	
	public void delete(long id){
		this.managerMuni.delete(id);
	}
	
	public void update(Municipio municipio)
	{
		this.managerMuni.update(municipio);
	}
}
