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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author mig_2
 */
@Entity
@Table(name = "itinerario")
@NamedQueries({
    @NamedQuery(name = "Itinerario.findAll", query = "SELECT i FROM Itinerario i"),
    @NamedQuery(name = "Itinerario.findById", query = "SELECT i FROM Itinerario i WHERE i.id = :id"),
    @NamedQuery(name = "Itinerario.findByDuracionMinutos", query = "SELECT i FROM Itinerario i WHERE i.duracionMinutos = :duracionMinutos"),
    @NamedQuery(name = "Itinerario.findByMaxVisitantes", query = "SELECT i FROM Itinerario i WHERE i.maxVisitantes = :maxVisitantes"),
    @NamedQuery(name = "Itinerario.findByLongitudMetros", query = "SELECT i FROM Itinerario i WHERE i.longitudMetros = :longitudMetros")})
public class Itinerario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "duracionMinutos")
    private double duracionMinutos;
    @Basic(optional = false)
    @Column(name = "maxVisitantes")
    private int maxVisitantes;
    @Basic(optional = false)
    @Column(name = "longitudMetros")
    private double longitudMetros;
    @JoinColumn(name = "idguia", referencedColumnName = "id")
    @ManyToOne
    private Guia idguia;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idItinerario")
    private List<Queja> quejaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iditinerario")
    private List<Relitinerariozona> relitinerariozonaList;

    public Itinerario() {
    }

    public Itinerario(Long id) {
        this.id = id;
    }

    public Itinerario(Long id, double duracionMinutos, int maxVisitantes, double longitudMetros) {
        this.id = id;
        this.duracionMinutos = duracionMinutos;
        this.maxVisitantes = maxVisitantes;
        this.longitudMetros = longitudMetros;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(double duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public int getMaxVisitantes() {
        return maxVisitantes;
    }

    public void setMaxVisitantes(int maxVisitantes) {
        this.maxVisitantes = maxVisitantes;
    }

    public double getLongitudMetros() {
        return longitudMetros;
    }

    public void setLongitudMetros(double longitudMetros) {
        this.longitudMetros = longitudMetros;
    }

    public Guia getIdguia() {
        return idguia;
    }

    public void setIdguia(Guia idguia) {
        this.idguia = idguia;
    }

    public List<Queja> getQuejaList() {
        return quejaList;
    }

    public void setQuejaList(List<Queja> quejaList) {
        this.quejaList = quejaList;
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
        if (!(object instanceof Itinerario)) {
            return false;
        }
        Itinerario other = (Itinerario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Itinerario[ id=" + id + " ]";
    }
    
}
