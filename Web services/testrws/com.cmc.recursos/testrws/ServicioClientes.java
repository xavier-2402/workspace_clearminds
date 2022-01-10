package testrws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import com.cmc.entidades;

@Path("/clientes")
public class ServicioClientes {
	
	@Path("/consulta")
	@GET
	public String metodo1(){
		return "Hello world";
	}
	
	public Cliente consultar(){
		
	}
	


}
