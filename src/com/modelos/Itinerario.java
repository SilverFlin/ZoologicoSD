package com.modelos;

import java.util.List;

/**
 *
 * @author angel
 */
public class Itinerario extends EntidadBase{
    private double duraciomnMinutos;
    private double longuitudMetros;
    private int maxVisitantes;
    private List<ZonaParque> zonasVisitadas;
    private Guia guiaAsignado;
    private List<Queja> queja;

    public Itinerario(double duraciomnMinutos, double longuitudMetros, int maxVisitantes, List<ZonaParque> zonasVisitadas, Guia guiaAsignado, List<Queja> queja) {
        super();
        this.duraciomnMinutos = duraciomnMinutos;
        this.longuitudMetros = longuitudMetros;
        this.maxVisitantes = maxVisitantes;
        this.zonasVisitadas = zonasVisitadas;
        this.guiaAsignado = guiaAsignado;
        this.queja = queja;
    }

    public Itinerario() {
        super();
    }
   
    
    
    public int contarEspeciesVisitadas(){
        return 0;
    }

    public double getDuraciomnMinutos() {
        return duraciomnMinutos;
    }

    public void setDuraciomnMinutos(double duraciomnMinutos) {
        this.duraciomnMinutos = duraciomnMinutos;
    }

    public double getLonguitudMetros() {
        return longuitudMetros;
    }

    public void setLonguitudMetros(double longuitudMetros) {
        this.longuitudMetros = longuitudMetros;
    }

    public int getMaxVisitantes() {
        return maxVisitantes;
    }

    public void setMaxVisitantes(int maxVisitantes) {
        this.maxVisitantes = maxVisitantes;
    }

    public List<ZonaParque> getZonasVisitadas() {
        return zonasVisitadas;
    }

    public void setZonasVisitadas(List<ZonaParque> zonasVisitadas) {
        this.zonasVisitadas = zonasVisitadas;
    }

    public Guia getGuiaAsignado() {
        return guiaAsignado;
    }

    public void setGuiaAsignado(Guia guiaAsignado) {
        this.guiaAsignado = guiaAsignado;
    }

    public List<Queja> getQueja() {
        return queja;
    }

    public void setQueja(List<Queja> queja) {
        this.queja = queja;
    }

    @Override
    public String toString() {
        return "Itinerario{" + "duraciomnMinutos=" + duraciomnMinutos + ", longuitudMetros=" + longuitudMetros + ", maxVisitantes=" + maxVisitantes + ", zonasVisitadas=" + zonasVisitadas + ", guiaAsignado=" + guiaAsignado + ", queja=" + queja + '}';
    }
    
    
    
    
}
