
package submision;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para usuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="usuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apellidos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carrera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contrasena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventoIdevento" type="{http://api/}evento" minOccurs="0"/>
 *         &lt;element name="fechanacimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idusuario" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="nombres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postgrados" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usuario", propOrder = {
    "apellidos",
    "carrera",
    "contrasena",
    "correo",
    "eventoIdevento",
    "fechanacimiento",
    "idusuario",
    "nombres",
    "postgrados",
    "tipo"
})
public class Usuario {

    protected String apellidos;
    protected String carrera;
    protected String contrasena;
    protected String correo;
    protected Evento eventoIdevento;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechanacimiento;
    protected BigDecimal idusuario;
    protected String nombres;
    protected String postgrados;
    protected String tipo;

    /**
     * Obtiene el valor de la propiedad apellidos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Define el valor de la propiedad apellidos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidos(String value) {
        this.apellidos = value;
    }

    /**
     * Obtiene el valor de la propiedad carrera.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * Define el valor de la propiedad carrera.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrera(String value) {
        this.carrera = value;
    }

    /**
     * Obtiene el valor de la propiedad contrasena.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Define el valor de la propiedad contrasena.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrasena(String value) {
        this.contrasena = value;
    }

    /**
     * Obtiene el valor de la propiedad correo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Define el valor de la propiedad correo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreo(String value) {
        this.correo = value;
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
     * Obtiene el valor de la propiedad fechanacimiento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechanacimiento() {
        return fechanacimiento;
    }

    /**
     * Define el valor de la propiedad fechanacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechanacimiento(XMLGregorianCalendar value) {
        this.fechanacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad idusuario.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIdusuario() {
        return idusuario;
    }

    /**
     * Define el valor de la propiedad idusuario.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIdusuario(BigDecimal value) {
        this.idusuario = value;
    }

    /**
     * Obtiene el valor de la propiedad nombres.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Define el valor de la propiedad nombres.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombres(String value) {
        this.nombres = value;
    }

    /**
     * Obtiene el valor de la propiedad postgrados.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostgrados() {
        return postgrados;
    }

    /**
     * Define el valor de la propiedad postgrados.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostgrados(String value) {
        this.postgrados = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

}
