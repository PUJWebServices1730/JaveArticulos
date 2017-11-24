package entities;

public class Revision {
	
    private Integer idrevision;
    
    private Integer calificacion;
    
    private String comentarios;
    
    private Submision submision;
    
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
        
    @Override
        public String toString(){
            return "hola";
        }
//        public String toString(){
//            System.out.println(this.submision);
//            return this.getSubmision().getArticulo().getTitulo();
//        }
    
    
}
