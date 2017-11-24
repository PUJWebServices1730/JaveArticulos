
package autenticacion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the autenticacion package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Evento_QNAME = new QName("http://api/", "evento");
    private final static QName _Autenticarse_QNAME = new QName("http://api/", "autenticarse");
    private final static QName _Usuario_QNAME = new QName("http://api/", "usuario");
    private final static QName _AutenticarseResponse_QNAME = new QName("http://api/", "autenticarseResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: autenticacion
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Evento }
     * 
     */
    public Evento createEvento() {
        return new Evento();
    }

    /**
     * Create an instance of {@link Autenticarse }
     * 
     */
    public Autenticarse createAutenticarse() {
        return new Autenticarse();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link AutenticarseResponse }
     * 
     */
    public AutenticarseResponse createAutenticarseResponse() {
        return new AutenticarseResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Evento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "evento")
    public JAXBElement<Evento> createEvento(Evento value) {
        return new JAXBElement<Evento>(_Evento_QNAME, Evento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Autenticarse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "autenticarse")
    public JAXBElement<Autenticarse> createAutenticarse(Autenticarse value) {
        return new JAXBElement<Autenticarse>(_Autenticarse_QNAME, Autenticarse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Usuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "usuario")
    public JAXBElement<Usuario> createUsuario(Usuario value) {
        return new JAXBElement<Usuario>(_Usuario_QNAME, Usuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutenticarseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "autenticarseResponse")
    public JAXBElement<AutenticarseResponse> createAutenticarseResponse(AutenticarseResponse value) {
        return new JAXBElement<AutenticarseResponse>(_AutenticarseResponse_QNAME, AutenticarseResponse.class, null, value);
    }

}
