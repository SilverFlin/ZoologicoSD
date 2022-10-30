package com.modelos;

import java.util.Date;
import java.util.List;

/**
 *
 * @author angel
 */
public class Guia extends Empleado{
    public List<Itinerario> itinerarios;

    
    public Guia(List<Itinerario> itinerarios) {
        this.itinerarios = itinerarios;
    }

    public Guia(List<Itinerario> itinerarios, String nombre, String direccion, String telefono, Date fechaIngreso) {
        super(nombre, direccion, telefono, fechaIngreso);
        this.itinerarios = itinerarios;
    }

    
    
    public Guia() {
        super();
    }

    public List<Itinerario> getItinerarios() {
        return itinerarios;
    }

    public void setItinerarios(List<Itinerario> itinerarios) {
        this.itinerarios = itinerarios;
    }

    @Override
    public String toString() {
        return "Guia{" + "itinerarios=" + itinerarios + '}';
    }
    
    
    
    
}
