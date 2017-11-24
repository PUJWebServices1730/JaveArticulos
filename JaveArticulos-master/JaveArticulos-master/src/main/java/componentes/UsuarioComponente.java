/**
 * 
 */
package componentes;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Usuario;

/**
 * @author HP
 *
 */
public class UsuarioComponente {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("webservice");
    EntityManager em = emf.createEntityManager();
    
//    private int cons = em.createQuery("SELECT u FROM Usuario u").getResultList().size();
    
    @SuppressWarnings("unchecked")
	public Usuario crearAutor(Usuario usuario){
    	List<Usuario> usuarios = em.createQuery("SELECT u FROM Usuario u").getResultList();
    	BigDecimal cons = new BigDecimal(usuarios.size());
    	em.getTransaction().begin();
    	usuario.setIdusuario(cons.add(new BigDecimal(1)));
    	usuario.setTipo("autor");
    	em.persist(usuario);
    	em.getTransaction().commit();
    	return usuario;
    }
    
    @SuppressWarnings("unchecked")
	public Usuario crearRevisor(Usuario usuario){
    	List<Usuario> usuarios = em.createQuery("SELECT u FROM Usuario u").getResultList();
    	BigDecimal cons = new BigDecimal(usuarios.size());
    	em.getTransaction().begin();
    	usuario.setIdusuario(cons.add(new BigDecimal(1)));
    	usuario.setTipo("revisor");
    	em.persist(usuario);
    	em.getTransaction().commit();
    	return usuario;
    }
    

    @SuppressWarnings("unchecked")
	public Usuario crearEditor(Usuario usuario){
    	List<Usuario> usuarios = em.createQuery("SELECT u FROM Usuario u").getResultList();
    	BigDecimal cons = new BigDecimal(usuarios.size());
    	em.getTransaction().begin();
    	usuario.setIdusuario(cons.add(new BigDecimal(1)));
    	usuario.setTipo("editor");
    	em.persist(usuario);
    	em.getTransaction().commit();
    	return usuario;
    }
    
    @SuppressWarnings("unchecked")
	public List<Usuario> usuarioTipo(String tipo){
    	return em.createNamedQuery("Usuario.findByTipo").setParameter("tipo", tipo).getResultList();
    }

    @SuppressWarnings("unchecked")
	public String getTipo(BigDecimal id){
    	List<Usuario> usuarios = em.createNamedQuery("Usuario.findByIdusuario").setParameter("idusuario", id).getResultList();
    	return usuarios.get(0).getTipo();
    }
    
}
