
package submision;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para revision complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="revision">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calificacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="comentarios" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idrevision" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="submisionIdsubmision" type="{http://api/}submision" minOccurs="0"/>
 *         &lt;element name="usuarioIdusuario" type="{http://api/}usuario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "revision", propOrder = {
    "calificacion",
    "comentarios",
    "idrevision",
    "submisionIdsubmision",
    "usuarioIdusuario"
})
public class Revision {

    protected Integer calificacion;
    protected String comentarios;
    protected BigDecimal idrevision;
    protected Submision submisionIdsubmision;
    protected Usuario usuarioIdusuario;

    /**
     * Obtiene el valor de la propiedad calificacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCalificacion() {
        return calificacion;
    }

    /**
     * Define el valor de la propiedad calificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCalificacion(Integer value) {
        this.calificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad comentarios.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComentarios() {
        return comentarios;
    }

    /**
     * Define el valor de la propiedad comentarios.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComentarios(String value) {
        this.comentarios = value;
    }

    /**
     * Obtiene el valor de la propiedad idrevision.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIdrevision() {
        return idrevision;
    }

    /**
     * Define el valor de la propiedad idrevision.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIdrevision(BigDecimal value) {
        this.idrevision = value;
    }

    /**
     * Obtiene el valor de la propiedad submisionIdsubmision.
     * 
     * @return
     *     possible object is
     *     {@link Submision }
     *     
     */
    public Submision getSubmisionIdsubmision() {
        return submisionIdsubmision;
    }

    /**
     * Define el valor de la propiedad submisionIdsubmision.
     * 
     * @param value
     *     allowed object is
     *     {@link Submision }
     *     
     */
    public void setSubmisionIdsubmision(Submision value) {
        this.submisionIdsubmision = value;
    }

    /**
     * Obtiene el valor de la propiedad usuarioIdusuario.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public Usuario getUsuarioIdusuario() {
        return usuarioIdusuario;
    }

    /**
     * Define el valor de la propiedad usuarioIdusuario.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setUsuarioIdusuario(Usuario value) {
        this.usuarioIdusuario = value;
    }

}
