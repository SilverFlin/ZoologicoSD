/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelos;

import java.util.Date;

/**
 *
 * @author angel
 */
public class Queja extends EntidadBase{
    private Date Fecha;
    private String descripcion;

    public Queja() {
        super();
    }

    public Queja(Date Fecha, String descripcion) {
        super();
        this.Fecha = Fecha;
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Queja{" + "Fecha=" + Fecha + ", descripcion=" + descripcion + '}';
    }
    
    
    
    
    
}
