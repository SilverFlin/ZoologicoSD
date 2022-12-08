/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.POJOS;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author mig_2
 */
@Entity
@Table(name = "cuidador")
@NamedQueries({
    @NamedQuery(name = "Cuidador.findAll", query = "SELECT c FROM Cuidador c"),
    @NamedQuery(name = "Cuidador.findById", query = "SELECT c FROM Cuidador c WHERE c.id = :id"),
    @NamedQuery(name = "Cuidador.findByNombre", query = "SELECT c FROM Cuidador c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Cuidador.findByDireccion", query = "SELECT c FROM Cuidador c WHERE c.direccion = :direccion"),
    @NamedQuery(name = "Cuidador.findByTelefono", query = "SELECT c FROM Cuidador c WHERE c.telefono = :telefono"),
    @NamedQuery(name = "Cuidador.findByFechaIngreso", query = "SELECT c FROM Cuidador c WHERE c.fechaIngreso = :fechaIngreso")})
public class Cuidador implements Serializable {

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
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @Column(name = "telefono")
    private String telefono;
    @Basic(optional = false)
    @Column(name = "fechaIngreso")
    @Temporal(TemporalType.DATE)
    private Date fechaIngreso;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcuidador")
    private List<Cuidadorcargo> cuidadorcargoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcuidador")
    private List<Cuidadordominada> cuidadordominadaList;

    public Cuidador() {
    }

    public Cuidador(Long id) {
        this.id = id;
    }

    public Cuidador(Long id, String nombre, String direccion, String telefono, Date fechaIngreso) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaIngreso = fechaIngreso;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuidador)) {
            return false;
        }
        Cuidador other = (Cuidador) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Cuidador[ id=" + id + " ]";
    }
    
}
