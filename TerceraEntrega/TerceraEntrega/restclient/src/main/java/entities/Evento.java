package entities;



import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.List;


public class Evento {
	
    private Integer idevento;
    private String tema;
    private Date fechainicio;
    private Date fechafin;
    private List<Submision> submisionList;
    private List<Usuario> usuarioList;
    
	/**
	 * @return the idevento
	 */
	public Integer getIdevento() {
		return idevento;
	}
	/**
	 * @param idevento the idevento to set
	 */
	public void setIdevento(Integer idevento) {
		this.idevento = idevento;
	}
	/**
	 * @return the tema
	 */
	public String getTema() {
		return tema;
	}
	/**
	 * @param tema the tema to set
	 */
	public void setTema(String tema) {
		this.tema = tema;
	}
	/**
	 * @return the fechainicio
	 */
	public Date getFechainicio() {
		return fechainicio;
	}
	/**
	 * @param fechainicio the fechainicio to set
	 */
	public void setFechainicio(Date fechainicio) {
		this.fechainicio = fechainicio;
	}
	/**
	 * @return the fechafin
	 */
	public Date getFechafin() {
		return fechafin;
	}
	/**
	 * @param fechafin the fechafin to set
	 */
	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}
	/**
	 * @return the submisionList
	 */
	public List<Submision> getSubmisionList() {
		return submisionList;
	}
	/**
	 * @param submisionList the submisionList to set
	 */
	public void setSubmisionList(List<Submision> submisionList) {
		this.submisionList = submisionList;
	}
	/**
	 * @return the usuarioList
	 */
	public List<Usuario> getUsuarioList() {
		return usuarioList;
	}
	/**
	 * @param usuarioList the usuarioList to set
	 */
	public void setUsuarioList(List<Usuario> usuarioList) {
		this.usuarioList = usuarioList;
	}
        
        public String toString(){
            return this.getTema();
        }
        
        
    

}
