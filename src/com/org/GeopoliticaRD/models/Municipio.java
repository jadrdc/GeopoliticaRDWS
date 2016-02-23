package com.org.GeopoliticaRD.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "municipios")
public class Municipio implements Serializable {

	@Column(name = "nombre")
	private String nombre;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "municipio_id")
	private long id;

	private static final long serialVersionUID = 1L;

	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name="provincia_id") private Provincia provincia;
	 * 
	 * 
	 * 
	 * 
	 * 
	 * public Provincia getProvincia() { return provincia; } public void
	 * setProvincia(Provincia provincia) { this.provincia = provincia; }
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!this.getClass().equals(obj.getClass()))
			return false;

		Municipio obj2 = (Municipio) obj;
		if ((this.id == obj2.getId()) && (this.nombre.equals(obj2.getNombre()))) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		int tmp = 0;
		tmp = (id + this.getNombre()).hashCode();
		return tmp;
	}
}
