package entities;

import entities.Submision;
import entities.Usuario;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-10T23:15:16")
@StaticMetamodel(Revision.class)
public class Revision_ { 

    public static volatile SingularAttribute<Revision, BigInteger> calificacion;
    public static volatile SingularAttribute<Revision, BigDecimal> idrevision;
    public static volatile SingularAttribute<Revision, Usuario> usuarioIdusuario;
    public static volatile SingularAttribute<Revision, Submision> submisionIdsubmision;
    public static volatile SingularAttribute<Revision, String> comentarios;

}