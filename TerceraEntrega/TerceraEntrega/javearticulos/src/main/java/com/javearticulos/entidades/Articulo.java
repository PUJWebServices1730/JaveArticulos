package com.javearticulos.entidades;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="articulo")
public class Articulo {

    
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idarticulo;
    private String titulo;
    private String resumen;
    private String palabrasclave;
    private String autores;
    @JoinColumn
    @ManyToOne(optional = false)
    private Usuario usuario;
    @JsonIgnore
    @OneToMany
    private List<Submision> submisionList;
    private String archivo;
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the idarticulo
	 */
	public Integer getIdarticulo() {
		return idarticulo;
	}
	/**
	 * @param idarticulo the idarticulo to set
	 */
	public void setIdarticulo(Integer idarticulo) {
		this.idarticulo = idarticulo;
	}
	/**
	 * @return the resumen
	 */
	public String getResumen() {
		return resumen;
	}
	/**
	 * @param resumen the resumen to set
	 */
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}
	/**
	 * @return the palabrasclave
	 */
	public String getPalabrasclave() {
		return palabrasclave;
	}
	/**
	 * @param palabrasclave the palabrasclave to set
	 */
	public void setPalabrasclave(String palabrasclave) {
		this.palabrasclave = palabrasclave;
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
	 * @return the archivo
	 */
	public String getArchivo() {
		return archivo;
	}
	/**
	 * @param archivo the archivo to set
	 */
	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}
    
    
}
