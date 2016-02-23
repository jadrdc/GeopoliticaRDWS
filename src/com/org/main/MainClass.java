package com.org.main;

import com.org.GeopoliticaRD.managers.ManagerProvincia;
import com.org.GeopoliticaRD.managers.ManagerMunicipio;
import com.org.GeopoliticaRD.models.Provincia;

public class MainClass {

	public static void main(String[] args)

	{
		ManagerProvincia pro = new ManagerProvincia();
		Provincia provincia = pro.findProvincia(15);
		ManagerMunicipio municipio = new ManagerMunicipio();
		System.out.println(municipio.findMunicipio(69).getNombre());
	}
}