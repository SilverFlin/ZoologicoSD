/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba;


import com.modelos.*;
import java.util.ArrayList;
import java.util.List;
import com.enums.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author mig_2
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        List<Continente> listaContinentes = new ArrayList<>();
        List<Habitat> listaHabitats = new ArrayList<>();
        List<Especie> listaEspecies = new ArrayList<>();
        List<ZonaParque> listaZonas = new ArrayList<>();
        List<Itinerario> listaItinerario = new ArrayList<>();
        List<Queja> listaQuejas = new ArrayList<>();
        Map<Especie,Date>fechaEspecie = new HashMap();
        Date fecha = new Date();
        
        listaContinentes.add(Continente.AMERICA);
        
        Habitat habitat = new Habitat("Jungla", Clima.CALIDO, Vegetacion.SELVA,  listaContinentes);
        listaHabitats.add(habitat);
        
        Especie especie = new Especie("Zebra", "Zebra", "Una zebra", listaHabitats, listaZonas);
        listaEspecies.add(especie);
        fechaEspecie.put(especie, fecha);
        
        ZonaParque zonaParque = new ZonaParque("Zonaa 1", 100, listaEspecies);
        listaZonas.add(zonaParque);
        
        Queja queja = new  Queja(new Date(), "Descripción");
        listaQuejas.add(queja);
        
        Guia guia = new Guia(listaItinerario, "Juan", "direccion", "Telefono", fecha);
        Itinerario itinerario = new Itinerario(100, 500, 50, listaZonas, guia, listaQuejas);
        
        
       
        Cuidador cuidador = new Cuidador(listaEspecies, listaEspecies, listaEspecies, fechaEspecie, "Jose", "Direccion", "Telefono", fecha);
        
        
        
        
        

        
        
        
        
        
        System.out.println(habitat.toString());
        System.out.println(especie.toString());
        System.out.println(zonaParque.toString());
        System.out.println(guia.toString());
        System.out.println(cuidador.toString());
        System.out.println(itinerario.toString());
        System.out.println(queja.toString());        
        
    }
    
}
