/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelos;

import java.util.List;

/**
 *
 * @author angel
 */
public class ZonaParque extends EntidadBase{
    private String nombre;
    private double extensionMetrosCuadrados;
    private List<Especie> especies;

    public ZonaParque(String nombre, double extensionMetrosCuadrados, List<Especie> especies) {
        super();
        this.nombre = nombre;
        this.extensionMetrosCuadrados = extensionMetrosCuadrados;
        this.especies = especies;
    }

    public ZonaParque() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getExtensionMetrosCuadrados() {
        return extensionMetrosCuadrados;
    }

    public void setExtensionMetrosCuadrados(double extensionMetrosCuadrados) {
        this.extensionMetrosCuadrados = extensionMetrosCuadrados;
    }

    public List<Especie> getEspecies() {
        return especies;
    }

    public void setEspecies(List<Especie> especies) {
        this.especies = especies;
    }

    @Override
    public String toString() {
        return "ZonaParque{" + "nombre=" + nombre + ", extensionMetrosCuadrados=" + extensionMetrosCuadrados + ", especies=" + especies + '}';
    }
    
    
    
}
