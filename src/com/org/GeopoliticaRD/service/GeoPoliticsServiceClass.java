package com.org.GeopoliticaRD.service;

import java.io.Serializable;

import com.org.GeopoliticaRD.DAO.DistritoDAO;
import com.org.GeopoliticaRD.DAO.MunicipioDAO;
import com.org.GeopoliticaRD.DAO.ProvinciaDAO;
import com.org.GeopoliticaRD.models.Distrito;
import com.org.GeopoliticaRD.models.Municipio;
import com.org.GeopoliticaRD.models.Provincia;

public class GeoPoliticsServiceClass implements Serializable {
	ProvinciaDAO provinciaDao = new ProvinciaDAO();
	MunicipioDAO municipioDao = new MunicipioDAO();
	DistritoDAO distritoDao = new DistritoDAO();

	public Provincia [] findAllProvincias() {
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
