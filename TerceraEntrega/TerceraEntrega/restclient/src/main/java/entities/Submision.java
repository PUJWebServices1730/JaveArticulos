/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;
import java.util.List;

/**
 *
 * @author HP
 */
public class Submision {
    
    
	 private Integer idsubmision;
	 private String estado;
	 private Date fechasubida;
	 private List<Revision> revisionList;
	 private Articulo articulo;
	 private Evento evento;
	 private Usuario usuario;

    public Integer getIdsubmision() {
        return idsubmision;
    }

    public void setIdsubmision(Integer idsubmision) {
        this.idsubmision = idsubmision;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechasubida() {
        return fechasubida;
    }

    public void setFechasubida(Date fechasubida) {
        this.fechasubida = fechasubida;
    }

    public List<Revision> getRevisionList() {
        return revisionList;
    }

    public void setRevisionList(List<Revision> revisionList) {
        this.revisionList = revisionList;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
         
    public String toString(){
        return this.getArticulo().getTitulo();
    }
    
}
