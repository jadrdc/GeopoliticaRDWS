package com.org.GeopoliticaRD.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name = "provincias")
public class Provincia implements Serializable {

	private String nombre;
	private static final long serialVersionUID = 1L;
	private long id;
	private Municipio[] municipios;

	@Column(name = "nombre")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "provincia_id")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@OrderColumn
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "provincia")
	public Municipio[] getMunicipios() {
		return municipios;
	}

	public void setMunicipios(Municipio [] municipios) {
		this.municipios = municipios;
	}

}
