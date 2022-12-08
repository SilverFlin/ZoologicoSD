package com.POJOS;

import com.POJOS.Cuidadorcargo;
import com.POJOS.Cuidadordominada;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-12-07T20:49:10")
@StaticMetamodel(Cuidador.class)
public class Cuidador_ { 

    public static volatile ListAttribute<Cuidador, Cuidadorcargo> cuidadorcargoList;
    public static volatile SingularAttribute<Cuidador, Date> fechaIngreso;
    public static volatile SingularAttribute<Cuidador, String> direccion;
    public static volatile SingularAttribute<Cuidador, Long> id;
    public static volatile SingularAttribute<Cuidador, String> telefono;
    public static volatile SingularAttribute<Cuidador, String> nombre;
    public static volatile ListAttribute<Cuidador, Cuidadordominada> cuidadordominadaList;

}