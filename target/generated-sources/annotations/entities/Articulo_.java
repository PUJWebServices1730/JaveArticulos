package entities;

import entities.Usuario;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-10T23:15:16")
@StaticMetamodel(Articulo.class)
public class Articulo_ { 

    public static volatile SingularAttribute<Articulo, String> palabrasclave;
    public static volatile SingularAttribute<Articulo, String> titulo;
    public static volatile SingularAttribute<Articulo, Usuario> usuarioIdusuario;
    public static volatile SingularAttribute<Articulo, String> resumen;
    public static volatile SingularAttribute<Articulo, BigDecimal> idarticulo;

}