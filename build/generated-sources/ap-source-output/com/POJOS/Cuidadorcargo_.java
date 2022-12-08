package com.POJOS;

import com.POJOS.Cuidador;
import com.POJOS.Especie;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-12-07T20:49:11")
@StaticMetamodel(Cuidadorcargo.class)
public class Cuidadorcargo_ { 

    public static volatile SingularAttribute<Cuidadorcargo, Especie> idespecie;
    public static volatile SingularAttribute<Cuidadorcargo, Date> fechacargo;
    public static volatile SingularAttribute<Cuidadorcargo, Long> id;
    public static volatile SingularAttribute<Cuidadorcargo, Cuidador> idcuidador;

}