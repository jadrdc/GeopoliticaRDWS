package com.org.GeopoliticaRD.service;

import java.io.Serializable;
import java.util.List;

import com.org.GeopoliticaRD.DAO.DistritoManager;
import com.org.GeopoliticaRD.DAO.MunicipioManager;
import com.org.GeopoliticaRD.DAO.ProvinciaManager;
import com.org.GeopoliticaRD.models.Distrito;
import com.org.GeopoliticaRD.models.Municipio;
import com.org.GeopoliticaRD.models.Provincia;

public class GeoPoliticsServiceClass implements Serializable {
	ProvinciaManager provinciaDao = new ProvinciaManager();
	MunicipioManager municipioDao = new MunicipioManager();
	DistritoManager distritoDao = new DistritoManager();

	public List<Provincia> findAllProvincias() {
		return  this.provinciaDao.findAll();

	}

	public Provincia findOne(int id) {
		return this.provinciaDao.findOne(id);
	}

	public  Municipio []  findMunicipios(Provincia provincia) {

		return null;

	}

	public Distrito [] findDistritos (Municipio municipio) {

		return null;

	}

	
	public Municipio findMunicipio(int id) {
		return this.municipioDao.findOne(id);
	}

	public Distrito findDistrito(int id) {
		return this.distritoDao.findOne(id);
	}

	
		
	
	
	
}
