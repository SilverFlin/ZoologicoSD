package com.POJOS;

import com.POJOS.Relespeciehabitat;
import com.POJOS.Relhabitatcontinente;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-12-07T20:49:11")
@StaticMetamodel(Habitat.class)
public class Habitat_ { 

    public static volatile SingularAttribute<Habitat, String> clima;
    public static volatile ListAttribute<Habitat, Relhabitatcontinente> relhabitatcontinenteList;
    public static volatile ListAttribute<Habitat, Relespeciehabitat> relespeciehabitatList;
    public static volatile SingularAttribute<Habitat, Long> id;
    public static volatile SingularAttribute<Habitat, String> nombre;
    public static volatile SingularAttribute<Habitat, String> vegetacion;

}