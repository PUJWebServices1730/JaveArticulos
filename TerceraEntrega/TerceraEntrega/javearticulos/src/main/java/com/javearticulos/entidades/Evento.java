package com.javearticulos.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="evento")
public class Evento {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idevento;
    @Basic(optional = false)
    @Column(name = "TEMA")
    private String tema;
    @Basic(optional = true)
    @Column(name = "FECHAINICIO")
    private Date fechainicio;
    @Basic(optional = true)
    @Column(name = "FECHAFIN")
    private Date fechafin;
    @OneToMany
    private List<Submision> submisionList;
    @JsonIgnore
    @OneToMany(cascade=CascadeType.ALL,mappedBy="evento")
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
//	public List<Submision> getSubmisionList() {
//		return submisionList;
//	}
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
    
    

}
