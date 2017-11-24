package api;

import java.math.BigDecimal;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import componentes.UsuarioComponente;
import entities.Usuario;

@WebService
public class ApiUsuarios {
	
	private UsuarioComponente usuarioComponent = new UsuarioComponente();
	
	@WebMethod
	public Usuario crearAutor(Usuario u){
		return usuarioComponent.crearAutor(u);
	}
	
	@WebMethod
	public Usuario crearRevisor(Usuario u){
		return usuarioComponent.crearRevisor(u);
	}
	
	@WebMethod
	public Usuario crearEditor(Usuario u){
		return usuarioComponent.crearEditor(u);
	}
	
	@WebMethod
	public List<Usuario> usuarioTipo(String tipo){
		return usuarioComponent.usuarioTipo(tipo);
	}

	@WebMethod
	public String getTipo(String id){
		return usuarioComponent.getTipo(new BigDecimal(id));
	}
	
}
