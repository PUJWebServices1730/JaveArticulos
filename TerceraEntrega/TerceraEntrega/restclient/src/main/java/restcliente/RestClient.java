/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restcliente;

import GUI.MenuPrincipal;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import entities.Articulo;
import entities.Credenciales;
import entities.Evento;
import entities.Revision;
import entities.Submision;
import entities.Usuario;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import jersey.repackaged.com.google.common.collect.Multimap;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;
import org.glassfish.jersey.media.multipart.FormDataMultiPart;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.media.multipart.internal.MultiPartWriter;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 *
 * @author HP
 */
public class RestClient {
    public static final String MY_SERVER_URL="http://localhost:8080/javearticulos";
    
    private Client client = ClientBuilder.newClient();
    private WebTarget webTarget = client.target(MY_SERVER_URL);
    
    public boolean login(String usuario,String contra){
        Credenciales c = new Credenciales();
        c.setPass(contra);
        c.setUsername(usuario);
        WebTarget login = webTarget.path("/auth/login");
        Invocation.Builder inv = login.request();
        Response r = inv.post(Entity.entity(c, MediaType.APPLICATION_JSON));
        String token = r.readEntity(String.class);
        
        if(r.getStatus()==200){
            new MenuPrincipal(usuario, token).setVisible(true);
            return true;
                
            
        }else{
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
            return false;
        }
        //System.out.println(r.readEntity(String.class) + r.getStatus());
        
        
    }
    
    public Usuario roles(String usernaname,String token){
        Invocation.Builder inv =  webTarget.path("usuario/actual").request(MediaType.APPLICATION_JSON).header("Authorization", token);
        Response r = inv.accept(MediaType.APPLICATION_JSON).get();
        Usuario usu = r.readEntity(Usuario.class);
        return usu;
    }
    
    public Evento crearEvento(Evento ev,String token){
        Invocation.Builder inv =  webTarget.path("evento").request(MediaType.APPLICATION_JSON).header("Authorization", token);
        Response r = inv.post(Entity.entity(ev, MediaType.APPLICATION_JSON));
        Evento e =  r.readEntity(Evento.class);
        System.out.println(e.getIdevento());
        return e;
    }
    
    public List<Evento> eventos(){
        Invocation.Builder inv = webTarget.path("evento").request(MediaType.APPLICATION_JSON);
        Response r = inv.get();
        return r.readEntity(new GenericType<List<Evento>>(){});
    }
    
    public List<Articulo> articulosUsuario(String token){
        Invocation.Builder inv =  webTarget.path("articulo/articulosusu").request(MediaType.APPLICATION_JSON).header("Authorization", token);
        Response r = inv.get();
        return r.readEntity(new GenericType<List<Articulo>>(){});
    }
    
    public Submision crearSubmi(String token,Integer idArticulo,Integer idEvento){
        Submision sub = new Submision();
        sub.setEstado("pendiente");
        sub.setFechasubida(new Date());
        System.out.println(sub.getEstado());
        Invocation.Builder inv =  webTarget
                .path("articulo/submision")
                .path(idArticulo+"").path(idEvento+"")
                .request(MediaType.APPLICATION_JSON)
                .header("Authorization", token);
        Response r = inv.post(Entity.entity(sub, MediaType.APPLICATION_JSON));
         Submision s = r.readEntity(Submision.class);
         return s;
    }
    
    public Articulo crearArticulo(String token, Articulo arti){
        Invocation.Builder inv =  webTarget
                .path("articulo")
                .request(MediaType.APPLICATION_JSON)
                .header("Authorization", token);
        Response r = inv.post(Entity.entity(arti, MediaType.APPLICATION_JSON));
        return r.readEntity(Articulo.class);
        
    }
    
    public List<Usuario> revisores(String token){
        Invocation.Builder inv =  webTarget
                .path("usuario/revisores")
                .request(MediaType.APPLICATION_JSON)
                .header("Authorization", token);
        Response r = inv.get();
        return r.readEntity(new GenericType<List<Usuario>>(){});
    }
    
    public List<Submision> submisionesEvento(String token){
        Invocation.Builder inv =  webTarget
                .path("articulo/submisionesevento")
                .request(MediaType.APPLICATION_JSON)
                .header("Authorization", token);
        Response r = inv.get();
        return r.readEntity(new GenericType<List<Submision>>(){});
    }
    
    public List<Submision> submisionesEventoinfo(String token,String id){
        Invocation.Builder inv =  webTarget
                .path("articulo/submisionesev")
                .path(id)
                .request(MediaType.APPLICATION_JSON)
                .header("Authorization", token);
        Response r = inv.get();
        return r.readEntity(new GenericType<List<Submision>>(){});
    }
    
    public Revision asignarRevisor(String token,String rev,String submi){
        Invocation.Builder inv =  webTarget
                .path("articulo/revision")
                .path(rev).path(submi)
                .request(MediaType.APPLICATION_JSON)
                .header("Authorization", token);
        Response r = inv.post(null);
        return r.readEntity(Revision.class);
    }
    
    public List<Revision> revisiones(String token){
        Invocation.Builder inv = webTarget
                .path("articulo/revisionesusu")
                .request(MediaType.APPLICATION_JSON)
                .header("Authorization", token);
        Response r = inv.get();
        return r.readEntity(new GenericType<List<Revision>>(){});
    }
    
    public Revision calificar(String token,Revision revi){
        Invocation.Builder inv =  webTarget
                .path("articulo/calificar")
                .request(MediaType.APPLICATION_JSON)
                .header("Authorization", token);
        Response r = inv.put(Entity.entity(revi, MediaType.APPLICATION_JSON));
        return r.readEntity(Revision.class);
    }
        
    public Usuario registar(Usuario u,String idevento){
        Invocation.Builder inv =  webTarget
                .path("auth/registrar")
                .path(idevento+"")
                .request(MediaType.APPLICATION_JSON);
        Response r = inv.post(Entity.entity(u, MediaType.APPLICATION_JSON));
        return r.readEntity(Usuario.class);
    }
    
//    public Fibonacci fibonacci(Integer n){
//        WebTarget fib = webTarget.path("/fibo").queryParam("num",n);
//        Invocation.Builder invocation = fib.request(MediaType.APPLICATION_JSON);
//        Response r = invocation.get();
//        return r.readEntity(Fibonacci.class);
//    }
//    
//    public List<Articulo> articulos(){
//        WebTarget articulos = webTarget.path("/articulos");
//        System.out.println(articulos.getUri());
//        Invocation.Builder invocation = articulos.request(MediaType.APPLICATION_JSON );
//        Response r = invocation.get();
//        List<Articulo> a = r.readEntity(new GenericType<List<Articulo>>(){});
//        System.out.println(a.size());
//        return a;
//    }
//    
//    public void eliminarArticulo(int id){
//        WebTarget articulos = webTarget.path("/articulos/delete/"+id);
//        System.out.println(articulos.getUri());
//        Invocation.Builder invocation = articulos.request();
//        invocation.get();
//        articulos();
//    }
//    
//    public Articulo modificarTitulo(int id, String titulo){
//        WebTarget articulos = webTarget.path("/articulos/"+id).queryParam("titulo", titulo);
//        System.out.println(articulos.getUri());
//        Invocation.Builder invocation = articulos.request(MediaType.APPLICATION_JSON);
//        Response r = invocation.post(null);
//        return r.readEntity(Articulo.class);
//        
//    }
//    
//    public void crear(Articulo a){
//        WebTarget articulos = webTarget.path("/articulos/nuevo");
//        Invocation.Builder invocationBuilder = articulos.request(MediaType.APPLICATION_JSON);
//        Response response = invocationBuilder.post(Entity.entity(a, MediaType.APPLICATION_JSON));
//    }
//    
//    public void crear(List<String> autores,Integer id, String titulo, String fecha){
//        WebTarget articulos = webTarget.path("/articulos/newo").queryParam("id", id).queryParam("tit", titulo).queryParam("fecha", fecha);
//        System.out.println(articulos.getUri());
//        Invocation.Builder invocationBuilder = articulos.request(MediaType.APPLICATION_JSON);
//        Response response = invocationBuilder.post(Entity.entity(autores, MediaType.APPLICATION_JSON));
//    }

    public void pdf(String token, FormDataMultiPart multipartFile) {
      /*  ClientConfig c = new ClientConfig();
        c.register(MultiPartFeature.class);
        c.register(MultiPartWriter.class);*/
        System.out.println("xxx");
        client = ClientBuilder.newBuilder().register(MultiPartFeature.class).build();
        webTarget = client.target(MY_SERVER_URL);
         Invocation.Builder inv =  webTarget
                .path("articulo").path("upload").path("1").queryParam("pdfFile", multipartFile)
                .request()
                .header("Authorization", token);
         
        Response r;
      //  return r.readEntity(Articulo.class);
        r = inv.post(Entity.entity(multipartFile, MediaType.MULTIPART_FORM_DATA_TYPE));
        
    
    }
    
}
