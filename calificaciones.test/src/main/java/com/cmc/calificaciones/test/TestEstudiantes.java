package com.cmc.calificaciones.test;

import com.cmc.calificaciones.entidades.Estudiante;
import com.cmc.calificaciones.servicios.AdminEstudiante;

public class TestEstudiantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdminEstudiante ae = new AdminEstudiante();
		ae.agregar(new Estudiante("Xavier", "Yanza"));
		System.out.println("FIN");
		

	}

}
