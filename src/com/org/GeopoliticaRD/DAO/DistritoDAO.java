package com.org.GeopoliticaRD.DAO;

import java.util.List;

import com.org.GeopoliticaRD.managers.ManagerDistrito;
import com.org.GeopoliticaRD.models.Distrito;

public class DistritoDAO  {
	private ManagerDistrito managerDistr = new ManagerDistrito();
	private static final long serialVersionUID = 1L;

	public Distrito findOne(long id) {
		return this.managerDistr.findOne(id);
	}

	public Distrito[] findAll() {
		return (Distrito[]) this.managerDistr.find();
	}
	
	public void delete(long id){
		this.managerDistr.delete(id);
	}
	
	public void update(Distrito distrito)
	{
		this.managerDistr.update(distrito);
	}

}
