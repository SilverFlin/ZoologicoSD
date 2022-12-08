package com.POJOS;

import com.POJOS.Relitinerariozona;
import com.POJOS.Relzonaespecie;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-12-07T20:49:11")
@StaticMetamodel(Zonaparque.class)
public class Zonaparque_ { 

    public static volatile SingularAttribute<Zonaparque, Double> extension;
    public static volatile ListAttribute<Zonaparque, Relitinerariozona> relitinerariozonaList;
    public static volatile SingularAttribute<Zonaparque, Long> id;
    public static volatile ListAttribute<Zonaparque, Relzonaespecie> relzonaespecieList;
    public static volatile SingularAttribute<Zonaparque, String> nombre;

}