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
@Table(name = "relzonaespecie")
@NamedQueries({
    @NamedQuery(name = "Relzonaespecie.findAll", query = "SELECT r FROM Relzonaespecie r"),
    @NamedQuery(name = "Relzonaespecie.findById", query = "SELECT r FROM Relzonaespecie r WHERE r.id = :id")})
public class Relzonaespecie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @JoinColumn(name = "idespecie", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Especie idespecie;
    @JoinColumn(name = "idzonaparque", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Zonaparque idzonaparque;

    public Relzonaespecie() {
    }

    public Relzonaespecie(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Especie getIdespecie() {
        return idespecie;
    }

    public void setIdespecie(Especie idespecie) {
        this.idespecie = idespecie;
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
        if (!(object instanceof Relzonaespecie)) {
            return false;
        }
        Relzonaespecie other = (Relzonaespecie) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.POJO.Relzonaespecie[ id=" + id + " ]";
    }
    
}
