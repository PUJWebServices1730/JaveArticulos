package com.javearticulos.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Revision {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idrevision;
    
    private Integer calificacion;
    
    private String comentarios;
    
    @JoinColumn
    @ManyToOne(optional = false)
    private Submision submision;
    
    @JoinColumn
    @ManyToOne(optional = false)
    private Usuario usuario;

	/**
	 * @return the idrevision
	 */
	public Integer getIdrevision() {
		return idrevision;
	}

	/**
	 * @param idrevision the idrevision to set
	 */
	public void setIdrevision(Integer idrevision) {
		this.idrevision = idrevision;
	}

	/**
	 * @return the calificacion
	 */
	public Integer getCalificacion() {
		return calificacion;
	}

	/**
	 * @param calificacion the calificacion to set
	 */
	public void setCalificacion(Integer calificacion) {
		this.calificacion = calificacion;
	}

	/**
	 * @return the comentarios
	 */
	public String getComentarios() {
		return comentarios;
	}

	/**
	 * @param comentarios the comentarios to set
	 */
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	/**
	 * @return the submision
	 */
	public Submision getSubmision() {
		return submision;
	}

	/**
	 * @param submision the submision to set
	 */
	public void setSubmision(Submision submision) {
		this.submision = submision;
	}

	/**
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
    
    
}
