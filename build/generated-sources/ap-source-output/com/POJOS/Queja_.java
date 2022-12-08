package com.POJOS;

import com.POJOS.Itinerario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-12-07T20:49:11")
@StaticMetamodel(Queja.class)
public class Queja_ { 

    public static volatile SingularAttribute<Queja, String> descripcion;
    public static volatile SingularAttribute<Queja, Date> fecha;
    public static volatile SingularAttribute<Queja, Itinerario> idItinerario;
    public static volatile SingularAttribute<Queja, Long> id;

}