package com.pranical.tutorial.domain;

import java.io.Serializable;

public class Usuario implements Serializable{
	private static final long serialVersionUID = 8530163882440465610L;
	
	private String nombre;
	private String email;
	private Integer edad;
	
	public Usuario(){}
	
	public Usuario(String nombre, String email, Integer edad) {
		this.nombre = nombre;
		this.email = email;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", email=" + email + ", edad="
				+ edad + "]";
	}
	
}
