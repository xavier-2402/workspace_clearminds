package com.cmc.capacitacion.archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cmc.capacitacion.entidades.Persona;
import com.cmc.capacitacion.excepciones.ToxicaExcepcion;

public class ManejarArchivos {

	private String rutaArchivo;
	private Logger logger = LogManager.getLogger(ManejarArchivos.class);

	public ManejarArchivos(String rutaArchivo) {
		this.rutaArchivo = rutaArchivo;

	}

	public ArrayList<Persona> leer() throws ToxicaExcepcion {
		File file = new File(rutaArchivo);
		BufferedReader br = null;
		FileReader fileReader = null;
		ArrayList<Persona> personas = new ArrayList<Persona>();
		String linea = "";
		String[] partes;
		Persona p;
		try {
			fileReader = new FileReader(file);
			br = new BufferedReader(fileReader);
			while ((linea = br.readLine()) != null) {
				if (!linea.isEmpty()) {
					partes = linea.split(",");
					p = new Persona(partes[0], partes[1], partes[2]);
					personas.add(p);
				}

			}
		} catch (FileNotFoundException e) {
			logger.error("No existe el archivo:", e);
			throw new ToxicaExcepcion("No existe el archivo: " + rutaArchivo);
		} catch (IOException e) {
			logger.error("Error al leer el archivo:", e);
			throw new ToxicaExcepcion("Error al leer el archivo: " + rutaArchivo);
		} finally {
			try {
				if (br != null) {
					br.close();
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				logger.error("Error al cerrar BufferReader br", e);
			}
			try {
				if (fileReader != null) {
					fileReader.close();
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				logger.error("Error al cerrar FilerReader fr", e);
			}
		}
		return personas;

	}

}
