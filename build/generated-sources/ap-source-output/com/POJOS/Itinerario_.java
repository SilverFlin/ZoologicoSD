package com.POJOS;

import com.POJOS.Guia;
import com.POJOS.Queja;
import com.POJOS.Relitinerariozona;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-12-07T20:49:10")
@StaticMetamodel(Itinerario.class)
public class Itinerario_ { 

    public static volatile ListAttribute<Itinerario, Relitinerariozona> relitinerariozonaList;
    public static volatile SingularAttribute<Itinerario, Integer> maxVisitantes;
    public static volatile ListAttribute<Itinerario, Queja> quejaList;
    public static volatile SingularAttribute<Itinerario, Double> duracionMinutos;
    public static volatile SingularAttribute<Itinerario, Long> id;
    public static volatile SingularAttribute<Itinerario, Double> longitudMetros;
    public static volatile SingularAttribute<Itinerario, Guia> idguia;

}