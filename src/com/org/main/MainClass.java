package com.org.main;

import com.org.GeopoliticaRD.managers.ManagerProvincia;
import com.org.GeopoliticaRD.models.Provincia;

public class MainClass {

	public static void main(String[] args)

	{
		ManagerProvincia m = new ManagerProvincia();
	
		for( Provincia d : m.find())
		{
			System.out.println(d.getNombre());
		}
			
			
			
			
	}
}