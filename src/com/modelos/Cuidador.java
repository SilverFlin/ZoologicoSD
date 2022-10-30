package com.modelos;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Cuidador extends Empleado{
    private List<Especie> especiesDominadas; 
    private List<Especie> especiesNovato;
    private List<Especie> especiesACargo;
    private Map<Especie, Date> fehcaInicioEspeciesACargo;

    public Cuidador(String nombre, String direccion, String telefono, Date fechaIngreso) {
        super(nombre, direccion, telefono, fechaIngreso);
    }

    public Cuidador() {
    }

    public Cuidador(List<Especie> especiesDominadas, List<Especie> especiesNovato, List<Especie> especiesACargo, Map<Especie, Date> fehcaInicioEspeciesACargo, String nombre, String direccion, String telefono, Date fechaIngreso) {
        super(nombre, direccion, telefono, fechaIngreso);
        this.especiesDominadas = especiesDominadas;
        this.especiesNovato = especiesNovato;
        this.especiesACargo = especiesACargo;
        this.fehcaInicioEspeciesACargo = fehcaInicioEspeciesACargo;
    }

    public Cuidador(List<Especie> especiesDominadas, List<Especie> especiesNovato, List<Especie> especiesACargo, Map<Especie, Date> fehcaInicioEspeciesACargo) {
        this.especiesDominadas = especiesDominadas;
        this.especiesNovato = especiesNovato;
        this.especiesACargo = especiesACargo;
        this.fehcaInicioEspeciesACargo = fehcaInicioEspeciesACargo;
    }

    public List<Especie> getEspeciesDominadas() {
        return especiesDominadas;
    }

    public void setEspeciesDominadas(List<Especie> especiesDominadas) {
        this.especiesDominadas = especiesDominadas;
    }

    public List<Especie> getEspeciesNovato() {
        return especiesNovato;
    }

    public void setEspeciesNovato(List<Especie> especiesNovato) {
        this.especiesNovato = especiesNovato;
    }

    public List<Especie> getEspeciesACargo() {
        return especiesACargo;
    }

    public void setEspeciesACargo(List<Especie> especiesACargo) {
        this.especiesACargo = especiesACargo;
    }

    public Map<Especie, Date> getFehcaInicioEspeciesACargo() {
        return fehcaInicioEspeciesACargo;
    }

    public void setFehcaInicioEspeciesACargo(Map<Especie, Date> fehcaInicioEspeciesACargo) {
        this.fehcaInicioEspeciesACargo = fehcaInicioEspeciesACargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Cuidador{" + "especiesDominadas=" + especiesDominadas + ", especiesNovato=" + especiesNovato + ", especiesACargo=" + especiesACargo + ", fehcaInicioEspeciesACargo=" + fehcaInicioEspeciesACargo + '}';
    }

    
    
}
