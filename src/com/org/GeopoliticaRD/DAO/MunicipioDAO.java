package com.org.GeopoliticaRD.DAO;

import java.util.List;

import com.org.GeopoliticaRD.managers.ManagerMunicipio;
import com.org.GeopoliticaRD.models.Municipio;
import com.org.GeopoliticaRD.models.Provincia;

public class MunicipioDAO {

	private ManagerMunicipio managerMuni = new ManagerMunicipio();
	private static final long serialVersionUID = 1L;

	public Municipio findOne(long id) {
		return this.managerMuni.findOne(id);
	}

	public Municipio [] findAll() {
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
