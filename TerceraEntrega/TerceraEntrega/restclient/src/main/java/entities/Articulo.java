package entities;

import java.util.List;



import com.fasterxml.jackson.annotation.JsonIgnore;


public class Articulo {

    private Integer idarticulo;
    private String titulo;
    private String resumen;
    private String palabrasclave;
    private Usuario usuario;
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
        
        public String toString(){
            return this.getTitulo();
        }
    
    
}
