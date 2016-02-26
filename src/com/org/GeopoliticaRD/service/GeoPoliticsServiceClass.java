package com.org.GeopoliticaRD.service;

import java.io.Serializable;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.org.GeopoliticaRD.DAO.DistritoManager;
import com.org.GeopoliticaRD.DAO.MunicipioManager;
import com.org.GeopoliticaRD.DAO.ProvinciaManager;
import com.org.GeopoliticaRD.models.Distrito;
import com.org.GeopoliticaRD.models.Municipio;
import com.org.GeopoliticaRD.models.Provincia;


@Path("geo")
public class GeoPoliticsServiceClass implements Serializable {

	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String helloWorld()
	{
	
		return "Hello World";
	}
	
	
	
	
	
}
