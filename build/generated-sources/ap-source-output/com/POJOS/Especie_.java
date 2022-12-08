package com.POJOS;

import com.POJOS.Cuidadorcargo;
import com.POJOS.Cuidadordominada;
import com.POJOS.Relespeciehabitat;
import com.POJOS.Relzonaespecie;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-12-07T20:49:11")
@StaticMetamodel(Especie.class)
public class Especie_ { 

    public static volatile SingularAttribute<Especie, String> descripcion;
    public static volatile ListAttribute<Especie, Cuidadorcargo> cuidadorcargoList;
    public static volatile SingularAttribute<Especie, String> nombreEspanhol;
    public static volatile ListAttribute<Especie, Relespeciehabitat> relespeciehabitatList;
    public static volatile SingularAttribute<Especie, String> nombreCientifico;
    public static volatile SingularAttribute<Especie, Long> id;
    public static volatile ListAttribute<Especie, Relzonaespecie> relzonaespecieList;
    public static volatile ListAttribute<Especie, Cuidadordominada> cuidadordominadaList;

}