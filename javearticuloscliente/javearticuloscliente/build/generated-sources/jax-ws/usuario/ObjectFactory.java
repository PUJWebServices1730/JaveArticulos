
package usuario;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the usuario package. 
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

    private final static QName _CrearAutorResponse_QNAME = new QName("http://api/", "crearAutorResponse");
    private final static QName _UsuarioTipo_QNAME = new QName("http://api/", "usuarioTipo");
    private final static QName _UsuarioTipoResponse_QNAME = new QName("http://api/", "usuarioTipoResponse");
    private final static QName _Evento_QNAME = new QName("http://api/", "evento");
    private final static QName _CrearEditorResponse_QNAME = new QName("http://api/", "crearEditorResponse");
    private final static QName _CrearRevisorResponse_QNAME = new QName("http://api/", "crearRevisorResponse");
    private final static QName _GetTipoResponse_QNAME = new QName("http://api/", "getTipoResponse");
    private final static QName _CrearRevisor_QNAME = new QName("http://api/", "crearRevisor");
    private final static QName _CrearAutor_QNAME = new QName("http://api/", "crearAutor");
    private final static QName _CrearEditor_QNAME = new QName("http://api/", "crearEditor");
    private final static QName _Usuario_QNAME = new QName("http://api/", "usuario");
    private final static QName _GetTipo_QNAME = new QName("http://api/", "getTipo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: usuario
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearAutorResponse }
     * 
     */
    public CrearAutorResponse createCrearAutorResponse() {
        return new CrearAutorResponse();
    }

    /**
     * Create an instance of {@link UsuarioTipo }
     * 
     */
    public UsuarioTipo createUsuarioTipo() {
        return new UsuarioTipo();
    }

    /**
     * Create an instance of {@link UsuarioTipoResponse }
     * 
     */
    public UsuarioTipoResponse createUsuarioTipoResponse() {
        return new UsuarioTipoResponse();
    }

    /**
     * Create an instance of {@link Evento }
     * 
     */
    public Evento createEvento() {
        return new Evento();
    }

    /**
     * Create an instance of {@link CrearEditorResponse }
     * 
     */
    public CrearEditorResponse createCrearEditorResponse() {
        return new CrearEditorResponse();
    }

    /**
     * Create an instance of {@link CrearRevisorResponse }
     * 
     */
    public CrearRevisorResponse createCrearRevisorResponse() {
        return new CrearRevisorResponse();
    }

    /**
     * Create an instance of {@link GetTipoResponse }
     * 
     */
    public GetTipoResponse createGetTipoResponse() {
        return new GetTipoResponse();
    }

    /**
     * Create an instance of {@link CrearRevisor }
     * 
     */
    public CrearRevisor createCrearRevisor() {
        return new CrearRevisor();
    }

    /**
     * Create an instance of {@link CrearAutor }
     * 
     */
    public CrearAutor createCrearAutor() {
        return new CrearAutor();
    }

    /**
     * Create an instance of {@link CrearEditor }
     * 
     */
    public CrearEditor createCrearEditor() {
        return new CrearEditor();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link GetTipo }
     * 
     */
    public GetTipo createGetTipo() {
        return new GetTipo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearAutorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "crearAutorResponse")
    public JAXBElement<CrearAutorResponse> createCrearAutorResponse(CrearAutorResponse value) {
        return new JAXBElement<CrearAutorResponse>(_CrearAutorResponse_QNAME, CrearAutorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsuarioTipo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "usuarioTipo")
    public JAXBElement<UsuarioTipo> createUsuarioTipo(UsuarioTipo value) {
        return new JAXBElement<UsuarioTipo>(_UsuarioTipo_QNAME, UsuarioTipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsuarioTipoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "usuarioTipoResponse")
    public JAXBElement<UsuarioTipoResponse> createUsuarioTipoResponse(UsuarioTipoResponse value) {
        return new JAXBElement<UsuarioTipoResponse>(_UsuarioTipoResponse_QNAME, UsuarioTipoResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearEditorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "crearEditorResponse")
    public JAXBElement<CrearEditorResponse> createCrearEditorResponse(CrearEditorResponse value) {
        return new JAXBElement<CrearEditorResponse>(_CrearEditorResponse_QNAME, CrearEditorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearRevisorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "crearRevisorResponse")
    public JAXBElement<CrearRevisorResponse> createCrearRevisorResponse(CrearRevisorResponse value) {
        return new JAXBElement<CrearRevisorResponse>(_CrearRevisorResponse_QNAME, CrearRevisorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTipoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "getTipoResponse")
    public JAXBElement<GetTipoResponse> createGetTipoResponse(GetTipoResponse value) {
        return new JAXBElement<GetTipoResponse>(_GetTipoResponse_QNAME, GetTipoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearRevisor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "crearRevisor")
    public JAXBElement<CrearRevisor> createCrearRevisor(CrearRevisor value) {
        return new JAXBElement<CrearRevisor>(_CrearRevisor_QNAME, CrearRevisor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearAutor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "crearAutor")
    public JAXBElement<CrearAutor> createCrearAutor(CrearAutor value) {
        return new JAXBElement<CrearAutor>(_CrearAutor_QNAME, CrearAutor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearEditor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "crearEditor")
    public JAXBElement<CrearEditor> createCrearEditor(CrearEditor value) {
        return new JAXBElement<CrearEditor>(_CrearEditor_QNAME, CrearEditor.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTipo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "getTipo")
    public JAXBElement<GetTipo> createGetTipo(GetTipo value) {
        return new JAXBElement<GetTipo>(_GetTipo_QNAME, GetTipo.class, null, value);
    }

}
