package com.cmc.evaluacion.fase2.entidades;

import java.util.ArrayList;

public class Cartera {
	
	private ArrayList<Cliente> clientes;

	public Cartera() {
		super();
		this.clientes = new ArrayList<Cliente>();
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	
	
	public Cliente buscarCliente(String cedula){
		for(Cliente c:clientes){
			if(c.getCedula().equals(cedula)){
				return c;
			}
		}
		return null;
	}
	
	
	public boolean agregarCliente(Cliente cliente){
		if(buscarCliente(cliente.getCedula())==null){
			clientes.add(cliente);
			return true;
		}else{
			return false;
		}
		
	}
	
	public void colocarPrestamo(Prestamo prestamo){
		Cliente cliente = buscarCliente(prestamo.getCedulaCliente());
		if(cliente!=null){
			cliente.agregarPrestamo(prestamo);
		}
	
	}
	

}
