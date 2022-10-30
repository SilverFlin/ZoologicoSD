/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelos;

import java.util.List;

/**
 *
 * @author mig_2
 */
public class Especie extends EntidadBase{
    private String nombreEspanhol;
    private String nombreCientifico;
    private String descripcion;
    List<Habitat> habitats;
    List<ZonaParque> zonasParque;

    public Especie(String nombreEspanhol, String nombreCientifico, String descripcion, List<Habitat> habitats, List<ZonaParque> zonasParque) {
        this.nombreEspanhol = nombreEspanhol;
        this.nombreCientifico = nombreCientifico;
        this.descripcion = descripcion;
        this.habitats = habitats;
        this.zonasParque = zonasParque;
    }

    public Especie() {
    }
    

    public String getNombreEspanhol() {
        return nombreEspanhol;
    }

    public void setNombreEspanhol(String nombreEspanhol) {
        this.nombreEspanhol = nombreEspanhol;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Habitat> getHabitats() {
        return habitats;
    }

    public void setHabitats(List<Habitat> habitats) {
        this.habitats = habitats;
    }

    public List<ZonaParque> getZonasParque() {
        return zonasParque;
    }

    public void setZonasParque(List<ZonaParque> zonasParque) {
        this.zonasParque = zonasParque;
    }

    @Override
    public String toString() {
        return "Especie{" + "nombreEspanhol=" + nombreEspanhol + ", nombreCientifico=" + nombreCientifico + ", descripcion=" + descripcion + ", habitats=" + habitats + ", zonasParque=" + zonasParque.size() + '}';
    }
    
    
}
