package com.org.GeopoliticaRD.models;

import javax.persistence.*;


@Entity
@Table(name = "distritos_municipales")
public class Distrito {

	@Column(name="")
	private String Nombre;
	@Id @GeneratedValue
	   @Column(name = "distrito_id")
	private long id;

	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	
	
	
	
	
	
	
}
