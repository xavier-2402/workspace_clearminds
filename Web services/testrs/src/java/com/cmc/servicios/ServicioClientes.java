package com.cmc.servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cmc.rs.entidades.Cliente;

@Path("/clientes")
public class ServicioClientes {
	
	@Path("/m1")
	@GET
	public String metodo1(){
		return "Saludando desde rest web service";
	}
	@Path("/consultar")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Cliente consultar(){
		Cliente c = new Cliente("87328372","Xavier",21,false);
		
		return c;
	}
	
	@Path("/guardar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void guardar(Cliente c){
	System.out.println("nombre: "+c.getNombre());
	System.out.println("cedula: "+c.getCedula());
		
	}

}
