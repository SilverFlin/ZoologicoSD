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
@Table(name = "especie")
@NamedQueries({
    @NamedQuery(name = "Especie.findAll", query = "SELECT e FROM Especie e"),
    @NamedQuery(name = "Especie.findById", query = "SELECT e FROM Especie e WHERE e.id = :id"),
    @NamedQuery(name = "Especie.findByNombreEspanhol", query = "SELECT e FROM Especie e WHERE e.nombreEspanhol = :nombreEspanhol"),
    @NamedQuery(name = "Especie.findByNombreCientifico", query = "SELECT e FROM Especie e WHERE e.nombreCientifico = :nombreCientifico"),
    @NamedQuery(name = "Especie.findByDescripcion", query = "SELECT e FROM Especie e WHERE e.descripcion = :descripcion")})
public class Especie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "nombreEspanhol")
    private String nombreEspanhol;
    @Basic(optional = false)
    @Column(name = "nombreCientifico")
    private String nombreCientifico;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idespecie")
    private List<Relespeciehabitat> relespeciehabitatList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idespecie")
    private List<Cuidadorcargo> cuidadorcargoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idespecie")
    private List<Cuidadordominada> cuidadordominadaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idespecie")
    private List<Relzonaespecie> relzonaespecieList;

    public Especie() {
    }

    public Especie(Long id) {
        this.id = id;
    }

    public Especie(Long id, String nombreEspanhol, String nombreCientifico, String descripcion) {
        this.id = id;
        this.nombreEspanhol = nombreEspanhol;
        this.nombreCientifico = nombreCientifico;
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<Relespeciehabitat> getRelespeciehabitatList() {
        return relespeciehabitatList;
    }

    public void setRelespeciehabitatList(List<Relespeciehabitat> relespeciehabitatList) {
        this.relespeciehabitatList = relespeciehabitatList;
    }

    public List<Cuidadorcargo> getCuidadorcargoList() {
        return cuidadorcargoList;
    }

    public void setCuidadorcargoList(List<Cuidadorcargo> cuidadorcargoList) {
        this.cuidadorcargoList = cuidadorcargoList;
    }

    public List<Cuidadordominada> getCuidadordominadaList() {
        return cuidadordominadaList;
    }

    public void setCuidadordominadaList(List<Cuidadordominada> cuidadordominadaList) {
        this.cuidadordominadaList = cuidadordominadaList;
    }

    public List<Relzonaespecie> getRelzonaespecieList() {
        return relzonaespecieList;
    }

    public void setRelzonaespecieList(List<Relzonaespecie> relzonaespecieList) {
        this.relzonaespecieList = relzonaespecieList;
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
        if (!(object instanceof Especie)) {
            return false;
        }
        Especie other = (Especie) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.POJO.Especie[ id=" + id + " ]";
    }
    
}
