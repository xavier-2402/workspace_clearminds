package com.cmc.evaluacion.fase2.servicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cmc.evaluacion.fase2.entidades.Cartera;
import com.cmc.evaluacion.fase2.entidades.Cliente;
import com.cmc.excepciones.EvaluacionExcepcion;

public class AdminClientes {
	private static Logger logger = LogManager.getLogger(AdminClientes.class);

	public static Cartera armarCartera(String rutaArchivo) {
		File file = new File(rutaArchivo);
		BufferedReader br = null;
		FileReader fileReader = null;
		String linea = "";
		Cartera cartera = new Cartera();
		try {
			fileReader = new FileReader(file);
			br = new BufferedReader(fileReader);
			while ((linea = br.readLine()) != null) {
				if (!linea.isEmpty()) {
					armarCliente(linea, cartera);
				}

			}
		} catch (FileNotFoundException e) {
			logger.error("No se pudo encontrar el archivo" + rutaArchivo, e);
			throw new EvaluacionExcepcion("No se pudo encontrar el archivo" + rutaArchivo);
		} catch (IOException e) {
			logger.error("Error al leer el archivo:", e);
			throw new EvaluacionExcepcion("Error al leer el archivo: " + rutaArchivo);
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

		return cartera;
	}
	
	private static void armarCliente(String linea,Cartera cartera){
		
		try {
			String[] partes;
			partes = linea.split(",");
			Cliente cliente = new Cliente(partes[0], partes[1], partes[2]);
			cartera.agregarCliente(cliente);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			logger.error("Error al armar el cliente en la linea: "+linea, e);
		}
		
	}

}
