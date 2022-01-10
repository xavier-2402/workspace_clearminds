package com.cmc.rs.entidades;

public class Cliente {
	
	private String cedula;
	private String nombre;
	private int edad;
	private boolean estado;
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public Cliente(String cedula, String nombre, int edad, boolean estado) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.edad = edad;
		this.estado = estado;
	}
	public Cliente() {

	}
	
	
	

}
