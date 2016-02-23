package com.org.GeopoliticaRD.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "provincias")
public class Provincia implements Serializable {
	@Column(name = "nombre")
	private String Nombre;
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "provincia_id")
	private long id;

	/*
	 * @OneToMany(mappedBy="provincia_id") Set<Municipio> municipioList ;
	 * 
	 * public Set<Municipio> getMunicipioList() { return municipioList; } public
	 * void setMunicipioList(Set<Municipio> municipioList) { this.municipioList
	 * = municipioList; }
	 */
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
