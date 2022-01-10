package com.cmc.capacitacion.test;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cmc.capacitacion.archivos.ManejarArchivos;
import com.cmc.capacitacion.entidades.Persona;
import com.cmc.capacitacion.excepciones.ToxicaExcepcion;

public class TestManejador {

	private static Logger logger = LogManager.getLogger(TestManejador.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ManejarArchivos ma = new ManejarArchivos("C:\\Users\\usuario\\Downloads\\EclipseNeon\\eclipseNeon\\WorkSpace\\ejemplo.txt");
		try {
			ArrayList<Persona> personas=ma.leer();
			System.out.println(personas);
		} catch (ToxicaExcepcion e) {
			logger.error("No existe el archivo",e);
			System.out.println(e.getMessage());
		}

	}

}
