package entities;

import entities.Articulo;
import entities.Evento;
import entities.Revision;
import entities.Submision;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-10T23:15:16")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> apellidos;
    public static volatile ListAttribute<Usuario, Articulo> articuloList;
    public static volatile SingularAttribute<Usuario, String> tipo;
    public static volatile SingularAttribute<Usuario, Date> fechanacimiento;
    public static volatile SingularAttribute<Usuario, Evento> eventoIdevento;
    public static volatile SingularAttribute<Usuario, String> correo;
    public static volatile SingularAttribute<Usuario, String> contrasena;
    public static volatile ListAttribute<Usuario, Revision> revisionList;
    public static volatile ListAttribute<Usuario, Submision> submisionList;
    public static volatile SingularAttribute<Usuario, BigDecimal> idusuario;
    public static volatile SingularAttribute<Usuario, String> nombres;

}