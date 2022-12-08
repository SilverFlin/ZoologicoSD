/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.POJOS;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author mig_2
 */
@Entity
@Table(name = "zonaparque")
@NamedQueries({
    @NamedQuery(name = "Zonaparque.findAll", query = "SELECT z FROM Zonaparque z"),
    @NamedQuery(name = "Zonaparque.findById", query = "SELECT z FROM Zonaparque z WHERE z.id = :id"),
    @NamedQuery(name = "Zonaparque.findByNombre", query = "SELECT z FROM Zonaparque z WHERE z.nombre = :nombre"),
    @NamedQuery(name = "Zonaparque.findByExtension", query = "SELECT z FROM Zonaparque z WHERE z.extension = :extension")})
public class Zonaparque implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "extension")
    private double extension;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idzonaparque")
    private List<Relzonaespecie> relzonaespecieList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idzonaparque")
    private List<Relitinerariozona> relitinerariozonaList;

    public Zonaparque() {
    }

    public Zonaparque(Long id) {
        this.id = id;
    }

    public Zonaparque(Long id, String nombre, double extension) {
        this.id = id;
        this.nombre = nombre;
        this.extension = extension;
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

    public double getExtension() {
        return extension;
    }

    public void setExtension(double extension) {
        this.extension = extension;
    }

    public List<Relzonaespecie> getRelzonaespecieList() {
        return relzonaespecieList;
    }

    public void setRelzonaespecieList(List<Relzonaespecie> relzonaespecieList) {
        this.relzonaespecieList = relzonaespecieList;
    }

    public List<Relitinerariozona> getRelitinerariozonaList() {
        return relitinerariozonaList;
    }

    public void setRelitinerariozonaList(List<Relitinerariozona> relitinerariozonaList) {
        this.relitinerariozonaList = relitinerariozonaList;
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
        if (!(object instanceof Zonaparque)) {
            return false;
        }
        Zonaparque other = (Zonaparque) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Zonaparque[ id=" + id + " ]";
    }
    
}
