
package submision;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para submision complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="submision">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="articuloIdarticulo2" type="{http://api/}articulo" minOccurs="0"/>
 *         &lt;element name="calificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventoIdevento" type="{http://api/}evento" minOccurs="0"/>
 *         &lt;element name="fechasubida" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idsubmision" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
@XmlType(name = "submision", propOrder = {
    "articuloIdarticulo2",
    "calificacion",
    "estado",
    "eventoIdevento",
    "fechasubida",
    "idsubmision",
    "usuarioIdusuario"
})
public class Submision {

    protected Articulo articuloIdarticulo2;
    protected String calificacion;
    protected String estado;
    protected Evento eventoIdevento;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechasubida;
    protected BigDecimal idsubmision;
    protected Usuario usuarioIdusuario;

    /**
     * Obtiene el valor de la propiedad articuloIdarticulo2.
     * 
     * @return
     *     possible object is
     *     {@link Articulo }
     *     
     */
    public Articulo getArticuloIdarticulo2() {
        return articuloIdarticulo2;
    }

    /**
     * Define el valor de la propiedad articuloIdarticulo2.
     * 
     * @param value
     *     allowed object is
     *     {@link Articulo }
     *     
     */
    public void setArticuloIdarticulo2(Articulo value) {
        this.articuloIdarticulo2 = value;
    }

    /**
     * Obtiene el valor de la propiedad calificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalificacion() {
        return calificacion;
    }

    /**
     * Define el valor de la propiedad calificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalificacion(String value) {
        this.calificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad eventoIdevento.
     * 
     * @return
     *     possible object is
     *     {@link Evento }
     *     
     */
    public Evento getEventoIdevento() {
        return eventoIdevento;
    }

    /**
     * Define el valor de la propiedad eventoIdevento.
     * 
     * @param value
     *     allowed object is
     *     {@link Evento }
     *     
     */
    public void setEventoIdevento(Evento value) {
        this.eventoIdevento = value;
    }

    /**
     * Obtiene el valor de la propiedad fechasubida.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechasubida() {
        return fechasubida;
    }

    /**
     * Define el valor de la propiedad fechasubida.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechasubida(XMLGregorianCalendar value) {
        this.fechasubida = value;
    }

    /**
     * Obtiene el valor de la propiedad idsubmision.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIdsubmision() {
        return idsubmision;
    }

    /**
     * Define el valor de la propiedad idsubmision.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIdsubmision(BigDecimal value) {
        this.idsubmision = value;
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
