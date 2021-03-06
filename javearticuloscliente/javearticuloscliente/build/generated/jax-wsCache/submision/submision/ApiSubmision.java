
package submision;

import java.math.BigDecimal;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ApiSubmision", targetNamespace = "http://api/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ApiSubmision {


    /**
     * 
     * @return
     *     returns java.util.List<submision.Evento>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eventos", targetNamespace = "http://api/", className = "submision.Eventos")
    @ResponseWrapper(localName = "eventosResponse", targetNamespace = "http://api/", className = "submision.EventosResponse")
    @Action(input = "http://api/ApiSubmision/eventosRequest", output = "http://api/ApiSubmision/eventosResponse")
    public List<Evento> eventos();

    /**
     * 
     * @param arg0
     * @return
     *     returns byte[]
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "download", targetNamespace = "http://api/", className = "submision.Download")
    @ResponseWrapper(localName = "downloadResponse", targetNamespace = "http://api/", className = "submision.DownloadResponse")
    @Action(input = "http://api/ApiSubmision/downloadRequest", output = "http://api/ApiSubmision/downloadResponse")
    public byte[] download(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns submision.Evento
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "crearEvento", targetNamespace = "http://api/", className = "submision.CrearEvento")
    @ResponseWrapper(localName = "crearEventoResponse", targetNamespace = "http://api/", className = "submision.CrearEventoResponse")
    @Action(input = "http://api/ApiSubmision/crearEventoRequest", output = "http://api/ApiSubmision/crearEventoResponse")
    public Evento crearEvento(
        @WebParam(name = "arg0", targetNamespace = "")
        Evento arg0);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "upload", targetNamespace = "http://api/", className = "submision.Upload")
    @ResponseWrapper(localName = "uploadResponse", targetNamespace = "http://api/", className = "submision.UploadResponse")
    @Action(input = "http://api/ApiSubmision/uploadRequest", output = "http://api/ApiSubmision/uploadResponse")
    public void upload(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        byte[] arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<submision.Articulo>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "articuloUsuario", targetNamespace = "http://api/", className = "submision.ArticuloUsuario")
    @ResponseWrapper(localName = "articuloUsuarioResponse", targetNamespace = "http://api/", className = "submision.ArticuloUsuarioResponse")
    @Action(input = "http://api/ApiSubmision/articuloUsuarioRequest", output = "http://api/ApiSubmision/articuloUsuarioResponse")
    public List<Articulo> articuloUsuario(
        @WebParam(name = "arg0", targetNamespace = "")
        BigDecimal arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns submision.Submision
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "crearSubmision", targetNamespace = "http://api/", className = "submision.CrearSubmision")
    @ResponseWrapper(localName = "crearSubmisionResponse", targetNamespace = "http://api/", className = "submision.CrearSubmisionResponse")
    @Action(input = "http://api/ApiSubmision/crearSubmisionRequest", output = "http://api/ApiSubmision/crearSubmisionResponse")
    public Submision crearSubmision(
        @WebParam(name = "arg0", targetNamespace = "")
        BigDecimal arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        BigDecimal arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns submision.Articulo
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "crearArticulo", targetNamespace = "http://api/", className = "submision.CrearArticulo")
    @ResponseWrapper(localName = "crearArticuloResponse", targetNamespace = "http://api/", className = "submision.CrearArticuloResponse")
    @Action(input = "http://api/ApiSubmision/crearArticuloRequest", output = "http://api/ApiSubmision/crearArticuloResponse")
    public Articulo crearArticulo(
        @WebParam(name = "arg0", targetNamespace = "")
        Articulo arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        BigDecimal arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns submision.Revision
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "agregarRevisor", targetNamespace = "http://api/", className = "submision.AgregarRevisor")
    @ResponseWrapper(localName = "agregarRevisorResponse", targetNamespace = "http://api/", className = "submision.AgregarRevisorResponse")
    @Action(input = "http://api/ApiSubmision/agregarRevisorRequest", output = "http://api/ApiSubmision/agregarRevisorResponse")
    public Revision agregarRevisor(
        @WebParam(name = "arg0", targetNamespace = "")
        BigDecimal arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        BigDecimal arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<submision.Submision>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "submisionUsuario", targetNamespace = "http://api/", className = "submision.SubmisionUsuario")
    @ResponseWrapper(localName = "submisionUsuarioResponse", targetNamespace = "http://api/", className = "submision.SubmisionUsuarioResponse")
    @Action(input = "http://api/ApiSubmision/submisionUsuarioRequest", output = "http://api/ApiSubmision/submisionUsuarioResponse")
    public List<Submision> submisionUsuario(
        @WebParam(name = "arg0", targetNamespace = "")
        BigDecimal arg0);

    /**
     * 
     * @return
     *     returns java.util.List<submision.Submision>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "submisiones", targetNamespace = "http://api/", className = "submision.Submisiones")
    @ResponseWrapper(localName = "submisionesResponse", targetNamespace = "http://api/", className = "submision.SubmisionesResponse")
    @Action(input = "http://api/ApiSubmision/submisionesRequest", output = "http://api/ApiSubmision/submisionesResponse")
    public List<Submision> submisiones();

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns submision.Revision
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "calificarSubmision", targetNamespace = "http://api/", className = "submision.CalificarSubmision")
    @ResponseWrapper(localName = "calificarSubmisionResponse", targetNamespace = "http://api/", className = "submision.CalificarSubmisionResponse")
    @Action(input = "http://api/ApiSubmision/calificarSubmisionRequest", output = "http://api/ApiSubmision/calificarSubmisionResponse")
    public Revision calificarSubmision(
        @WebParam(name = "arg0", targetNamespace = "")
        BigDecimal arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Integer arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "calcularCalificacion", targetNamespace = "http://api/", className = "submision.CalcularCalificacion")
    @ResponseWrapper(localName = "calcularCalificacionResponse", targetNamespace = "http://api/", className = "submision.CalcularCalificacionResponse")
    @Action(input = "http://api/ApiSubmision/calcularCalificacionRequest", output = "http://api/ApiSubmision/calcularCalificacionResponse")
    public Integer calcularCalificacion(
        @WebParam(name = "arg0", targetNamespace = "")
        BigDecimal arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "calificacionFinal", targetNamespace = "http://api/", className = "submision.CalificacionFinal")
    @ResponseWrapper(localName = "calificacionFinalResponse", targetNamespace = "http://api/", className = "submision.CalificacionFinalResponse")
    @Action(input = "http://api/ApiSubmision/calificacionFinalRequest", output = "http://api/ApiSubmision/calificacionFinalResponse")
    public void calificacionFinal(
        @WebParam(name = "arg0", targetNamespace = "")
        BigDecimal arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<submision.Revision>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "revisionesSubmision", targetNamespace = "http://api/", className = "submision.RevisionesSubmision")
    @ResponseWrapper(localName = "revisionesSubmisionResponse", targetNamespace = "http://api/", className = "submision.RevisionesSubmisionResponse")
    @Action(input = "http://api/ApiSubmision/revisionesSubmisionRequest", output = "http://api/ApiSubmision/revisionesSubmisionResponse")
    public List<Revision> revisionesSubmision(
        @WebParam(name = "arg0", targetNamespace = "")
        BigDecimal arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<submision.Revision>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "revisionesRevisor", targetNamespace = "http://api/", className = "submision.RevisionesRevisor")
    @ResponseWrapper(localName = "revisionesRevisorResponse", targetNamespace = "http://api/", className = "submision.RevisionesRevisorResponse")
    @Action(input = "http://api/ApiSubmision/revisionesRevisorRequest", output = "http://api/ApiSubmision/revisionesRevisorResponse")
    public List<Revision> revisionesRevisor(
        @WebParam(name = "arg0", targetNamespace = "")
        BigDecimal arg0);

}
