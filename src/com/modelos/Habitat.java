package com.modelos;
import com.enums.*;
import java.util.List;

/**
 *
 * @author angel
 */
public class Habitat extends EntidadBase{
    private String nombre;
    private Clima clima;
    private Vegetacion vegetacion;
    private List<Continente> continentes;

    public Habitat(String nombre, Clima clima, Vegetacion vegetacion, List<Continente> continentes) {
        super();
        this.nombre = nombre;
        this.clima = clima;
        this.vegetacion = vegetacion;
        this.continentes = continentes;
    }

    public Habitat() {
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Continente> getContinentes() {
        return continentes;
    }

    public void setContinentes(List<Continente> continentes) {
        this.continentes = continentes;
    }

    public Clima getClima() {
        return clima;
    }

    public void setClima(Clima clima) {
        this.clima = clima;
    }

    public Vegetacion getVegetacion() {
        return vegetacion;
    }

    public void setVegetacion(Vegetacion vegetacion) {
        this.vegetacion = vegetacion;
    }

    @Override
    public String toString() {
        return "Habitat{" + "nombre=" + nombre + ", clima=" + clima + ", vegetacion=" + vegetacion + ", continentes=" + continentes + '}';
    }

    
    
    
}
