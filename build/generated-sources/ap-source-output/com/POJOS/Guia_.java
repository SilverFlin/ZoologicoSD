package com.POJOS;

import com.POJOS.Itinerario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-12-07T20:49:10")
@StaticMetamodel(Guia.class)
public class Guia_ { 

    public static volatile SingularAttribute<Guia, Date> fechaIngreso;
    public static volatile ListAttribute<Guia, Itinerario> itinerarioList;
    public static volatile SingularAttribute<Guia, String> direccion;
    public static volatile SingularAttribute<Guia, Long> id;
    public static volatile SingularAttribute<Guia, String> telefono;
    public static volatile SingularAttribute<Guia, String> nombre;

}