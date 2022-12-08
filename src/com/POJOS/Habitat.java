/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.POJOS;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Toled
 */
@Entity
@Table(name = "habitat")
@NamedQueries({
    @NamedQuery(name = "Habitat.findAll", query = "SELECT h FROM Habitat h"),
    @NamedQuery(name = "Habitat.findById", query = "SELECT h FROM Habitat h WHERE h.id = :id"),
    @NamedQuery(name = "Habitat.findByNombre", query = "SELECT h FROM Habitat h WHERE h.nombre = :nombre"),
    @NamedQuery(name = "Habitat.findByVegetacion", query = "SELECT h FROM Habitat h WHERE h.vegetacion = :vegetacion"),
    @NamedQuery(name = "Habitat.findByClima", query = "SELECT h FROM Habitat h WHERE h.clima = :clima")})
public class Habitat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "vegetacion")
    private String vegetacion;
    @Basic(optional = false)
    @Column(name = "clima")
    private String clima;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idhabitat")
    private List<Relespeciehabitat> relespeciehabitatList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idhabitat")
    private List<Relhabitatcontinente> relhabitatcontinenteList;

    public Habitat() {
    }

    public Habitat(Long id) {
        this.id = id;
    }

    public Habitat(Long id, String nombre, String vegetacion, String clima) {
        this.id = id;
        this.nombre = nombre;
        this.vegetacion = vegetacion;
        this.clima = clima;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVegetacion() {
        return vegetacion;
    }

    public void setVegetacion(String vegetacion) {
        this.vegetacion = vegetacion;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public List<Relespeciehabitat> getRelespeciehabitatList() {
        return relespeciehabitatList;
    }

    public void setRelespeciehabitatList(List<Relespeciehabitat> relespeciehabitatList) {
        this.relespeciehabitatList = relespeciehabitatList;
    }

    public List<Relhabitatcontinente> getRelhabitatcontinenteList() {
        return relhabitatcontinenteList;
    }

    public void setRelhabitatcontinenteList(List<Relhabitatcontinente> relhabitatcontinenteList) {
        this.relhabitatcontinenteList = relhabitatcontinenteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Habitat)) {
            return false;
        }
        Habitat other = (Habitat) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.POJO.Habitat[ id=" + id + " ]";
    }
    
}
