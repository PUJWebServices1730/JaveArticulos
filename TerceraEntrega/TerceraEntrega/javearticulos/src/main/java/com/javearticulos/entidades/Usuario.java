package com.javearticulos.entidades;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idUsuario;
	private String tipo;
	private String password;
	@Column(name="username",nullable=false)
	private String username;
	private Date fechaNac;
	private String nombre;
	private String apellido;
    @OneToMany
    @JsonIgnore
    private List<Revision> revisionList;
    
    @OneToMany
    private List<Articulo> articuloList;
    @OneToMany
    @JsonIgnore
    private List<Submision> submisionList;
    @JoinColumn
    @ManyToOne(optional = false)
    //@JsonIgnore
    private Evento evento;
	
    
    
    
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	
	/**
	 * @return the idUsuario
	 */
	public Integer getIdUsuario() {
		return idUsuario;
	}
	/**
	 * @param idUsuario the idUsuario to set
	 */
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	/**
	 * @return the usuariolog
	 */
//	public User getUsuariolog() {
//		return usuariolog;
//	}
//	/**
//	 * @param usuariolog the usuariolog to set
//	 */
//	public void setUsuariolog(User usuariolog) {
//		this.usuariolog = usuariolog;
//	}
	
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
	 * @return the articuloList
	 */
	public List<Articulo> getArticuloList() {
		return articuloList;
	}
	/**
	 * @param articuloList the articuloList to set
	 */
	public void setArticuloList(List<Articulo> articuloList) {
		this.articuloList = articuloList;
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
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the fechaNac
	 */
	public Date getFechaNac() {
		return fechaNac;
	}
	/**
	 * @param fechaNac the fechaNac to set
	 */
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
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
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	
	
	

}
