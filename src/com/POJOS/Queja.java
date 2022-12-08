/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.POJOS;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author mig_2
 */
@Entity
@Table(name = "queja")
@NamedQueries({
    @NamedQuery(name = "Queja.findAll", query = "SELECT q FROM Queja q"),
    @NamedQuery(name = "Queja.findById", query = "SELECT q FROM Queja q WHERE q.id = :id"),
    @NamedQuery(name = "Queja.findByDescripcion", query = "SELECT q FROM Queja q WHERE q.descripcion = :descripcion"),
    @NamedQuery(name = "Queja.findByFecha", query = "SELECT q FROM Queja q WHERE q.fecha = :fecha")})
public class Queja implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @JoinColumn(name = "idItinerario", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Itinerario idItinerario;

    public Queja() {
    }

    public Queja(Long id) {
        this.id = id;
    }

    public Queja(Long id, String descripcion, Date fecha) {
        this.id = id;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Itinerario getIdItinerario() {
        return idItinerario;
    }

    public void setIdItinerario(Itinerario idItinerario) {
        this.idItinerario = idItinerario;
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
        if (!(object instanceof Queja)) {
            return false;
        }
        Queja other = (Queja) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Queja[ id=" + id + " ]";
    }
    
}
