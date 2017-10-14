package entities;

import entities.Articulo;
import entities.Evento;
import entities.Revision;
import entities.Usuario;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-10T23:15:16")
@StaticMetamodel(Submision.class)
public class Submision_ { 

    public static volatile SingularAttribute<Submision, Date> fechasubida;
    public static volatile SingularAttribute<Submision, String> estado;
    public static volatile SingularAttribute<Submision, BigDecimal> idsubmision;
    public static volatile SingularAttribute<Submision, Articulo> articuloIdarticulo;
    public static volatile SingularAttribute<Submision, Evento> eventoIdevento;
    public static volatile SingularAttribute<Submision, Usuario> usuarioIdusuario;
    public static volatile ListAttribute<Submision, Revision> revisionList;

}