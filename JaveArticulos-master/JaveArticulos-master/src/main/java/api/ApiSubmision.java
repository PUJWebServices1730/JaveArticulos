/**
 * 
 */
package api;

import java.math.BigDecimal;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import componentes.SubmisionComponente;
import entities.Articulo;
import entities.Revision;
import entities.Submision;
import entities.Evento;

/**
 * @author HP
 *
 */
@WebService
public class ApiSubmision {
	

	private SubmisionComponente subComponent = new SubmisionComponente();
	
	@WebMethod
	public Articulo crearArticulo(Articulo ar,BigDecimal idusuario){
		return subComponent.crearArticulo(ar, idusuario);
	}
	
	@WebMethod
	public Submision crearSubmision(BigDecimal articuloId,BigDecimal eventoId){
		return subComponent.crearSubmision(articuloId, eventoId);
	}
	
	@WebMethod
	public Revision agregarRevisor(BigDecimal idSubmision,BigDecimal idRevisor){
		return subComponent.agregarRevisor(idSubmision, idRevisor);
	}
	
	@WebMethod
	public Evento crearEvento(Evento ev){
		return subComponent.crearEvento(ev);
	}
	
	@WebMethod
	public Revision calificarSubmision(BigDecimal idRevision,Integer calificacion,String comentarios){
		return subComponent.calificarSubmision(idRevision, calificacion, comentarios);
	}
	
	@WebMethod
	public Integer calcularCalificacion(BigDecimal idSubmision){
		return subComponent.calcularCalificacion(idSubmision);
	}
	
	@WebMethod
	public void calificacionFinal(BigDecimal idSubmision, String calificacion){
		subComponent.calificacionFinal(idSubmision, calificacion);
	}
	
	@WebMethod
	public List<Articulo> articuloUsuario(BigDecimal idUsuario){
		return subComponent.articuloUsuario(idUsuario);
	}
	
	@WebMethod
	public List<Submision> submisionUsuario(BigDecimal idUsuario){
		return subComponent.submisionUsuario(idUsuario);
	}
	
	@WebMethod
	public List<Revision> revisionesSubmision(BigDecimal idSub){
		return subComponent.revisionesSubmision(idSub);
	}
	
	@WebMethod
	public List<Revision> revisionesRevisor(BigDecimal idRev){
		return subComponent.revisionesRevisor(idRev);
	}
	
	@WebMethod
	public List<Submision> submisiones(){
		return subComponent.submisiones();
	}
	
	@WebMethod
	public List<Evento> eventos(){
		return subComponent.eventos();
	}
	
	@WebMethod
    public void upload(String fileName, byte[] imageBytes, String correo){
		subComponent.upload(fileName, imageBytes, correo);
	}
     
    @WebMethod
    public byte[] download(String fileName){
    	return subComponent.download(fileName);
    }

}
