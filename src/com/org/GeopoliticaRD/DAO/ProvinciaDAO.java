package com.org.GeopoliticaRD.DAO;

import java.io.Serializable;

import com.org.GeopoliticaRD.managers.ManagerProvincia;
import com.org.GeopoliticaRD.models.Provincia;

public class ProvinciaDAO implements Serializable {
	private ManagerProvincia managerProv = new ManagerProvincia();
	private static final long serialVersionUID = 1L;

	public Provincia findProvincia(long id) {
		return this.managerProv.findOne(id);
	}

}
