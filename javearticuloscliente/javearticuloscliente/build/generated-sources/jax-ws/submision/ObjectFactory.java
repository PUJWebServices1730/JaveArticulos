
package submision;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the submision package. 
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

    private final static QName _AgregarRevisor_QNAME = new QName("http://api/", "agregarRevisor");
    private final static QName _CalcularCalificacion_QNAME = new QName("http://api/", "calcularCalificacion");
    private final static QName _CrearEventoResponse_QNAME = new QName("http://api/", "crearEventoResponse");
    private final static QName _RevisionesSubmisionResponse_QNAME = new QName("http://api/", "revisionesSubmisionResponse");
    private final static QName _RevisionesRevisorResponse_QNAME = new QName("http://api/", "revisionesRevisorResponse");
    private final static QName _Submisiones_QNAME = new QName("http://api/", "submisiones");
    private final static QName _Usuario_QNAME = new QName("http://api/", "usuario");
    private final static QName _ArticuloUsuario_QNAME = new QName("http://api/", "articuloUsuario");
    private final static QName _CalificacionFinalResponse_QNAME = new QName("http://api/", "calificacionFinalResponse");
    private final static QName _CrearSubmisionResponse_QNAME = new QName("http://api/", "crearSubmisionResponse");
    private final static QName _RevisionesSubmision_QNAME = new QName("http://api/", "revisionesSubmision");
    private final static QName _CrearArticulo_QNAME = new QName("http://api/", "crearArticulo");
    private final static QName _CrearArticuloResponse_QNAME = new QName("http://api/", "crearArticuloResponse");
    private final static QName _SubmisionesResponse_QNAME = new QName("http://api/", "submisionesResponse");
    private final static QName _Revision_QNAME = new QName("http://api/", "revision");
    private final static QName _SubmisionUsuario_QNAME = new QName("http://api/", "submisionUsuario");
    private final static QName _CalificarSubmisionResponse_QNAME = new QName("http://api/", "calificarSubmisionResponse");
    private final static QName _Download_QNAME = new QName("http://api/", "download");
    private final static QName _Evento_QNAME = new QName("http://api/", "evento");
    private final static QName _CrearEvento_QNAME = new QName("http://api/", "crearEvento");
    private final static QName _DownloadResponse_QNAME = new QName("http://api/", "downloadResponse");
    private final static QName _Submision_QNAME = new QName("http://api/", "submision");
    private final static QName _ArticuloUsuarioResponse_QNAME = new QName("http://api/", "articuloUsuarioResponse");
    private final static QName _SubmisionUsuarioResponse_QNAME = new QName("http://api/", "submisionUsuarioResponse");
    private final static QName _Articulo_QNAME = new QName("http://api/", "articulo");
    private final static QName _AgregarRevisorResponse_QNAME = new QName("http://api/", "agregarRevisorResponse");
    private final static QName _CrearSubmision_QNAME = new QName("http://api/", "crearSubmision");
    private final static QName _EventosResponse_QNAME = new QName("http://api/", "eventosResponse");
    private final static QName _Upload_QNAME = new QName("http://api/", "upload");
    private final static QName _UploadResponse_QNAME = new QName("http://api/", "uploadResponse");
    private final static QName _Eventos_QNAME = new QName("http://api/", "eventos");
    private final static QName _RevisionesRevisor_QNAME = new QName("http://api/", "revisionesRevisor");
    private final static QName _CalificacionFinal_QNAME = new QName("http://api/", "calificacionFinal");
    private final static QName _CalcularCalificacionResponse_QNAME = new QName("http://api/", "calcularCalificacionResponse");
    private final static QName _CalificarSubmision_QNAME = new QName("http://api/", "calificarSubmision");
    private final static QName _DownloadResponseReturn_QNAME = new QName("", "return");
    private final static QName _UploadArg1_QNAME = new QName("", "arg1");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: submision
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearSubmision }
     * 
     */
    public CrearSubmision createCrearSubmision() {
        return new CrearSubmision();
    }

    /**
     * Create an instance of {@link EventosResponse }
     * 
     */
    public EventosResponse createEventosResponse() {
        return new EventosResponse();
    }

    /**
     * Create an instance of {@link Upload }
     * 
     */
    public Upload createUpload() {
        return new Upload();
    }

    /**
     * Create an instance of {@link UploadResponse }
     * 
     */
    public UploadResponse createUploadResponse() {
        return new UploadResponse();
    }

    /**
     * Create an instance of {@link Eventos }
     * 
     */
    public Eventos createEventos() {
        return new Eventos();
    }

    /**
     * Create an instance of {@link RevisionesRevisor }
     * 
     */
    public RevisionesRevisor createRevisionesRevisor() {
        return new RevisionesRevisor();
    }

    /**
     * Create an instance of {@link CalificacionFinal }
     * 
     */
    public CalificacionFinal createCalificacionFinal() {
        return new CalificacionFinal();
    }

    /**
     * Create an instance of {@link CalcularCalificacionResponse }
     * 
     */
    public CalcularCalificacionResponse createCalcularCalificacionResponse() {
        return new CalcularCalificacionResponse();
    }

    /**
     * Create an instance of {@link CalificarSubmision }
     * 
     */
    public CalificarSubmision createCalificarSubmision() {
        return new CalificarSubmision();
    }

    /**
     * Create an instance of {@link CalificarSubmisionResponse }
     * 
     */
    public CalificarSubmisionResponse createCalificarSubmisionResponse() {
        return new CalificarSubmisionResponse();
    }

    /**
     * Create an instance of {@link Download }
     * 
     */
    public Download createDownload() {
        return new Download();
    }

    /**
     * Create an instance of {@link Evento }
     * 
     */
    public Evento createEvento() {
        return new Evento();
    }

    /**
     * Create an instance of {@link CrearEvento }
     * 
     */
    public CrearEvento createCrearEvento() {
        return new CrearEvento();
    }

    /**
     * Create an instance of {@link DownloadResponse }
     * 
     */
    public DownloadResponse createDownloadResponse() {
        return new DownloadResponse();
    }

    /**
     * Create an instance of {@link Submision }
     * 
     */
    public Submision createSubmision() {
        return new Submision();
    }

    /**
     * Create an instance of {@link ArticuloUsuarioResponse }
     * 
     */
    public ArticuloUsuarioResponse createArticuloUsuarioResponse() {
        return new ArticuloUsuarioResponse();
    }

    /**
     * Create an instance of {@link SubmisionUsuarioResponse }
     * 
     */
    public SubmisionUsuarioResponse createSubmisionUsuarioResponse() {
        return new SubmisionUsuarioResponse();
    }

    /**
     * Create an instance of {@link Articulo }
     * 
     */
    public Articulo createArticulo() {
        return new Articulo();
    }

    /**
     * Create an instance of {@link AgregarRevisorResponse }
     * 
     */
    public AgregarRevisorResponse createAgregarRevisorResponse() {
        return new AgregarRevisorResponse();
    }

    /**
     * Create an instance of {@link ArticuloUsuario }
     * 
     */
    public ArticuloUsuario createArticuloUsuario() {
        return new ArticuloUsuario();
    }

    /**
     * Create an instance of {@link CalificacionFinalResponse }
     * 
     */
    public CalificacionFinalResponse createCalificacionFinalResponse() {
        return new CalificacionFinalResponse();
    }

    /**
     * Create an instance of {@link CrearSubmisionResponse }
     * 
     */
    public CrearSubmisionResponse createCrearSubmisionResponse() {
        return new CrearSubmisionResponse();
    }

    /**
     * Create an instance of {@link RevisionesSubmision }
     * 
     */
    public RevisionesSubmision createRevisionesSubmision() {
        return new RevisionesSubmision();
    }

    /**
     * Create an instance of {@link CrearArticulo }
     * 
     */
    public CrearArticulo createCrearArticulo() {
        return new CrearArticulo();
    }

    /**
     * Create an instance of {@link CrearArticuloResponse }
     * 
     */
    public CrearArticuloResponse createCrearArticuloResponse() {
        return new CrearArticuloResponse();
    }

    /**
     * Create an instance of {@link SubmisionesResponse }
     * 
     */
    public SubmisionesResponse createSubmisionesResponse() {
        return new SubmisionesResponse();
    }

    /**
     * Create an instance of {@link Revision }
     * 
     */
    public Revision createRevision() {
        return new Revision();
    }

    /**
     * Create an instance of {@link SubmisionUsuario }
     * 
     */
    public SubmisionUsuario createSubmisionUsuario() {
        return new SubmisionUsuario();
    }

    /**
     * Create an instance of {@link AgregarRevisor }
     * 
     */
    public AgregarRevisor createAgregarRevisor() {
        return new AgregarRevisor();
    }

    /**
     * Create an instance of {@link CalcularCalificacion }
     * 
     */
    public CalcularCalificacion createCalcularCalificacion() {
        return new CalcularCalificacion();
    }

    /**
     * Create an instance of {@link CrearEventoResponse }
     * 
     */
    public CrearEventoResponse createCrearEventoResponse() {
        return new CrearEventoResponse();
    }

    /**
     * Create an instance of {@link RevisionesSubmisionResponse }
     * 
     */
    public RevisionesSubmisionResponse createRevisionesSubmisionResponse() {
        return new RevisionesSubmisionResponse();
    }

    /**
     * Create an instance of {@link RevisionesRevisorResponse }
     * 
     */
    public RevisionesRevisorResponse createRevisionesRevisorResponse() {
        return new RevisionesRevisorResponse();
    }

    /**
     * Create an instance of {@link Submisiones }
     * 
     */
    public Submisiones createSubmisiones() {
        return new Submisiones();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarRevisor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "agregarRevisor")
    public JAXBElement<AgregarRevisor> createAgregarRevisor(AgregarRevisor value) {
        return new JAXBElement<AgregarRevisor>(_AgregarRevisor_QNAME, AgregarRevisor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularCalificacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "calcularCalificacion")
    public JAXBElement<CalcularCalificacion> createCalcularCalificacion(CalcularCalificacion value) {
        return new JAXBElement<CalcularCalificacion>(_CalcularCalificacion_QNAME, CalcularCalificacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearEventoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "crearEventoResponse")
    public JAXBElement<CrearEventoResponse> createCrearEventoResponse(CrearEventoResponse value) {
        return new JAXBElement<CrearEventoResponse>(_CrearEventoResponse_QNAME, CrearEventoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevisionesSubmisionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "revisionesSubmisionResponse")
    public JAXBElement<RevisionesSubmisionResponse> createRevisionesSubmisionResponse(RevisionesSubmisionResponse value) {
        return new JAXBElement<RevisionesSubmisionResponse>(_RevisionesSubmisionResponse_QNAME, RevisionesSubmisionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevisionesRevisorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "revisionesRevisorResponse")
    public JAXBElement<RevisionesRevisorResponse> createRevisionesRevisorResponse(RevisionesRevisorResponse value) {
        return new JAXBElement<RevisionesRevisorResponse>(_RevisionesRevisorResponse_QNAME, RevisionesRevisorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Submisiones }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "submisiones")
    public JAXBElement<Submisiones> createSubmisiones(Submisiones value) {
        return new JAXBElement<Submisiones>(_Submisiones_QNAME, Submisiones.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArticuloUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "articuloUsuario")
    public JAXBElement<ArticuloUsuario> createArticuloUsuario(ArticuloUsuario value) {
        return new JAXBElement<ArticuloUsuario>(_ArticuloUsuario_QNAME, ArticuloUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalificacionFinalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "calificacionFinalResponse")
    public JAXBElement<CalificacionFinalResponse> createCalificacionFinalResponse(CalificacionFinalResponse value) {
        return new JAXBElement<CalificacionFinalResponse>(_CalificacionFinalResponse_QNAME, CalificacionFinalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearSubmisionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "crearSubmisionResponse")
    public JAXBElement<CrearSubmisionResponse> createCrearSubmisionResponse(CrearSubmisionResponse value) {
        return new JAXBElement<CrearSubmisionResponse>(_CrearSubmisionResponse_QNAME, CrearSubmisionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevisionesSubmision }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "revisionesSubmision")
    public JAXBElement<RevisionesSubmision> createRevisionesSubmision(RevisionesSubmision value) {
        return new JAXBElement<RevisionesSubmision>(_RevisionesSubmision_QNAME, RevisionesSubmision.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearArticulo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "crearArticulo")
    public JAXBElement<CrearArticulo> createCrearArticulo(CrearArticulo value) {
        return new JAXBElement<CrearArticulo>(_CrearArticulo_QNAME, CrearArticulo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearArticuloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "crearArticuloResponse")
    public JAXBElement<CrearArticuloResponse> createCrearArticuloResponse(CrearArticuloResponse value) {
        return new JAXBElement<CrearArticuloResponse>(_CrearArticuloResponse_QNAME, CrearArticuloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmisionesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "submisionesResponse")
    public JAXBElement<SubmisionesResponse> createSubmisionesResponse(SubmisionesResponse value) {
        return new JAXBElement<SubmisionesResponse>(_SubmisionesResponse_QNAME, SubmisionesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Revision }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "revision")
    public JAXBElement<Revision> createRevision(Revision value) {
        return new JAXBElement<Revision>(_Revision_QNAME, Revision.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmisionUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "submisionUsuario")
    public JAXBElement<SubmisionUsuario> createSubmisionUsuario(SubmisionUsuario value) {
        return new JAXBElement<SubmisionUsuario>(_SubmisionUsuario_QNAME, SubmisionUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalificarSubmisionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "calificarSubmisionResponse")
    public JAXBElement<CalificarSubmisionResponse> createCalificarSubmisionResponse(CalificarSubmisionResponse value) {
        return new JAXBElement<CalificarSubmisionResponse>(_CalificarSubmisionResponse_QNAME, CalificarSubmisionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Download }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "download")
    public JAXBElement<Download> createDownload(Download value) {
        return new JAXBElement<Download>(_Download_QNAME, Download.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearEvento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "crearEvento")
    public JAXBElement<CrearEvento> createCrearEvento(CrearEvento value) {
        return new JAXBElement<CrearEvento>(_CrearEvento_QNAME, CrearEvento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "downloadResponse")
    public JAXBElement<DownloadResponse> createDownloadResponse(DownloadResponse value) {
        return new JAXBElement<DownloadResponse>(_DownloadResponse_QNAME, DownloadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Submision }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "submision")
    public JAXBElement<Submision> createSubmision(Submision value) {
        return new JAXBElement<Submision>(_Submision_QNAME, Submision.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArticuloUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "articuloUsuarioResponse")
    public JAXBElement<ArticuloUsuarioResponse> createArticuloUsuarioResponse(ArticuloUsuarioResponse value) {
        return new JAXBElement<ArticuloUsuarioResponse>(_ArticuloUsuarioResponse_QNAME, ArticuloUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmisionUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "submisionUsuarioResponse")
    public JAXBElement<SubmisionUsuarioResponse> createSubmisionUsuarioResponse(SubmisionUsuarioResponse value) {
        return new JAXBElement<SubmisionUsuarioResponse>(_SubmisionUsuarioResponse_QNAME, SubmisionUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Articulo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "articulo")
    public JAXBElement<Articulo> createArticulo(Articulo value) {
        return new JAXBElement<Articulo>(_Articulo_QNAME, Articulo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarRevisorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "agregarRevisorResponse")
    public JAXBElement<AgregarRevisorResponse> createAgregarRevisorResponse(AgregarRevisorResponse value) {
        return new JAXBElement<AgregarRevisorResponse>(_AgregarRevisorResponse_QNAME, AgregarRevisorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearSubmision }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "crearSubmision")
    public JAXBElement<CrearSubmision> createCrearSubmision(CrearSubmision value) {
        return new JAXBElement<CrearSubmision>(_CrearSubmision_QNAME, CrearSubmision.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "eventosResponse")
    public JAXBElement<EventosResponse> createEventosResponse(EventosResponse value) {
        return new JAXBElement<EventosResponse>(_EventosResponse_QNAME, EventosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Upload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "upload")
    public JAXBElement<Upload> createUpload(Upload value) {
        return new JAXBElement<Upload>(_Upload_QNAME, Upload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "uploadResponse")
    public JAXBElement<UploadResponse> createUploadResponse(UploadResponse value) {
        return new JAXBElement<UploadResponse>(_UploadResponse_QNAME, UploadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Eventos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "eventos")
    public JAXBElement<Eventos> createEventos(Eventos value) {
        return new JAXBElement<Eventos>(_Eventos_QNAME, Eventos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevisionesRevisor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "revisionesRevisor")
    public JAXBElement<RevisionesRevisor> createRevisionesRevisor(RevisionesRevisor value) {
        return new JAXBElement<RevisionesRevisor>(_RevisionesRevisor_QNAME, RevisionesRevisor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalificacionFinal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "calificacionFinal")
    public JAXBElement<CalificacionFinal> createCalificacionFinal(CalificacionFinal value) {
        return new JAXBElement<CalificacionFinal>(_CalificacionFinal_QNAME, CalificacionFinal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularCalificacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "calcularCalificacionResponse")
    public JAXBElement<CalcularCalificacionResponse> createCalcularCalificacionResponse(CalcularCalificacionResponse value) {
        return new JAXBElement<CalcularCalificacionResponse>(_CalcularCalificacionResponse_QNAME, CalcularCalificacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalificarSubmision }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api/", name = "calificarSubmision")
    public JAXBElement<CalificarSubmision> createCalificarSubmision(CalificarSubmision value) {
        return new JAXBElement<CalificarSubmision>(_CalificarSubmision_QNAME, CalificarSubmision.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = DownloadResponse.class)
    public JAXBElement<byte[]> createDownloadResponseReturn(byte[] value) {
        return new JAXBElement<byte[]>(_DownloadResponseReturn_QNAME, byte[].class, DownloadResponse.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "arg1", scope = Upload.class)
    public JAXBElement<byte[]> createUploadArg1(byte[] value) {
        return new JAXBElement<byte[]>(_UploadArg1_QNAME, byte[].class, Upload.class, ((byte[]) value));
    }

}
