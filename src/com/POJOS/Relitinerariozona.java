/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.POJOS;

import java.io.Serializable;
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

/**
 *
 * @author Toled
 */
@Entity
@Table(name = "relitinerariozona")
@NamedQueries({
    @NamedQuery(name = "Relitinerariozona.findAll", query = "SELECT r FROM Relitinerariozona r"),
    @NamedQuery(name = "Relitinerariozona.findById", query = "SELECT r FROM Relitinerariozona r WHERE r.id = :id")})
public class Relitinerariozona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @JoinColumn(name = "iditinerario", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Itinerario iditinerario;
    @JoinColumn(name = "idzonaparque", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Zonaparque idzonaparque;

    public Relitinerariozona() {
    }

    public Relitinerariozona(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Itinerario getIditinerario() {
        return iditinerario;
    }

    public void setIditinerario(Itinerario iditinerario) {
        this.iditinerario = iditinerario;
    }

    public Zonaparque getIdzonaparque() {
        return idzonaparque;
    }

    public void setIdzonaparque(Zonaparque idzonaparque) {
        this.idzonaparque = idzonaparque;
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
        if (!(object instanceof Relitinerariozona)) {
            return false;
        }
        Relitinerariozona other = (Relitinerariozona) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.POJO.Relitinerariozona[ id=" + id + " ]";
    }
    
}
