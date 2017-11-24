package com.javearticulos.entidades;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Submision {
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Integer idsubmision;
	 private String estado;
	 private Date fechasubida;
	 @JsonIgnore
	 @OneToMany
	 private List<Revision> revisionList;
	 @JoinColumn
	 @ManyToOne(optional = false)
	 private Articulo articulo;
	 @JoinColumn
	 @JsonIgnore
	 @ManyToOne(optional = false)
	 private Evento evento;
	 @JoinColumn
	 @JsonIgnore	
	 @ManyToOne(optional = false)
	 private Usuario usuario;
	/**
	 * @return the idsubmision
	 */
	public Integer getIdsubmision() {
		return idsubmision;
	}
	/**
	 * @param idsubmision the idsubmision to set
	 */
	public void setIdsubmision(Integer idsubmision) {
		this.idsubmision = idsubmision;
	}
	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
	/**
	 * @return the fechasubida
	 */
	public Date getFechasubida() {
		return fechasubida;
	}
	/**
	 * @param fechasubida the fechasubida to set
	 */
	public void setFechasubida(Date fechasubida) {
		this.fechasubida = fechasubida;
	}
	/**
	 * @return the revisionList
	 */
	public List<Revision> getRevisionList() {
		return revisionList;
	}
	/**
	 * @param revisionList the revisionList to set
	 */
	public void setRevisionList(List<Revision> revisionList) {
		this.revisionList = revisionList;
	}
	/**
	 * @return the articulo
	 */
	public Articulo getArticulo() {
		return articulo;
	}
	/**
	 * @param articulo the articulo to set
	 */
	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}
	/**
	 * @return the evento
	 */
	public Evento getEvento() {
		return evento;
	}
	/**
	 * @param evento the evento to set
	 */
	public void setEvento(Evento evento) {
		this.evento = evento;
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
