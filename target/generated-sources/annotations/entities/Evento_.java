package entities;

import entities.Submision;
import entities.Usuario;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-10T23:15:16")
@StaticMetamodel(Evento.class)
public class Evento_ { 

    public static volatile SingularAttribute<Evento, Date> fechainicio;
    public static volatile SingularAttribute<Evento, BigDecimal> idevento;
    public static volatile SingularAttribute<Evento, String> tema;
    public static volatile ListAttribute<Evento, Usuario> usuarioList;
    public static volatile SingularAttribute<Evento, Date> fechafin;
    public static volatile ListAttribute<Evento, Submision> submisionList;

}