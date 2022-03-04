package com.bolsadeideas.springboot.form.app.models.domain;

//import javax.validation.constraints.NotEmpty;

public class Pais {

	private Integer id;
	//@NotEmpty
	private String codigo;
	private String nombre;

	public Pais() {
	}

	public Pais(Integer id, String codigo, String nombre) {
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return this.id.toString();
	}

}
