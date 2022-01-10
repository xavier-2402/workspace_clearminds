package com.cmc.calificaciones.servicios;

import java.util.ArrayList;

import com.cmc.calificaciones.entidades.Estudiante;

public class AdminEstudiante {
	
	private ArrayList<Estudiante> estudiantes;
	
	public AdminEstudiante(){
		estudiantes=new ArrayList<Estudiante>();
	}
	public void agregar(Estudiante estudiante){
		estudiantes.add(estudiante);
		System.out.println(estudiantes);
	}
	
	

}
