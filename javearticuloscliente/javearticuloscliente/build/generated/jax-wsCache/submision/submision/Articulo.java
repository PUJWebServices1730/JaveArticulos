
package submision;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para articulo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="articulo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="archivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idarticulo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="palabrasclave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resumen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "articulo", propOrder = {
    "archivo",
    "idarticulo",
    "palabrasclave",
    "resumen",
    "titulo",
    "usuarioIdusuario"
})
public class Articulo {

    protected String archivo;
    protected BigDecimal idarticulo;
    protected String palabrasclave;
    protected String resumen;
    protected String titulo;
    protected Usuario usuarioIdusuario;

    /**
     * Obtiene el valor de la propiedad archivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchivo() {
        return archivo;
    }

    /**
     * Define el valor de la propiedad archivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchivo(String value) {
        this.archivo = value;
    }

    /**
     * Obtiene el valor de la propiedad idarticulo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIdarticulo() {
        return idarticulo;
    }

    /**
     * Define el valor de la propiedad idarticulo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIdarticulo(BigDecimal value) {
        this.idarticulo = value;
    }

    /**
     * Obtiene el valor de la propiedad palabrasclave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPalabrasclave() {
        return palabrasclave;
    }

    /**
     * Define el valor de la propiedad palabrasclave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPalabrasclave(String value) {
        this.palabrasclave = value;
    }

    /**
     * Obtiene el valor de la propiedad resumen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResumen() {
        return resumen;
    }

    /**
     * Define el valor de la propiedad resumen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResumen(String value) {
        this.resumen = value;
    }

    /**
     * Obtiene el valor de la propiedad titulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define el valor de la propiedad titulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulo(String value) {
        this.titulo = value;
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
