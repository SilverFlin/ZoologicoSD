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
@Table(name = "relhabitatcontinente")
@NamedQueries({
    @NamedQuery(name = "Relhabitatcontinente.findAll", query = "SELECT r FROM Relhabitatcontinente r"),
    @NamedQuery(name = "Relhabitatcontinente.findById", query = "SELECT r FROM Relhabitatcontinente r WHERE r.id = :id")})
public class Relhabitatcontinente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @JoinColumn(name = "idcontinente", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Continente idcontinente;
    @JoinColumn(name = "idhabitat", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Habitat idhabitat;

    public Relhabitatcontinente() {
    }

    public Relhabitatcontinente(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Continente getIdcontinente() {
        return idcontinente;
    }

    public void setIdcontinente(Continente idcontinente) {
        this.idcontinente = idcontinente;
    }

    public Habitat getIdhabitat() {
        return idhabitat;
    }

    public void setIdhabitat(Habitat idhabitat) {
        this.idhabitat = idhabitat;
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
        if (!(object instanceof Relhabitatcontinente)) {
            return false;
        }
        Relhabitatcontinente other = (Relhabitatcontinente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.POJO.Relhabitatcontinente[ id=" + id + " ]";
    }
    
}
