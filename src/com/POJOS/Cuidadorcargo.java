/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
 * @author Toled
 */
@Entity
@Table(name = "cuidadorcargo")
@NamedQueries({
    @NamedQuery(name = "Cuidadorcargo.findAll", query = "SELECT c FROM Cuidadorcargo c"),
    @NamedQuery(name = "Cuidadorcargo.findById", query = "SELECT c FROM Cuidadorcargo c WHERE c.id = :id"),
    @NamedQuery(name = "Cuidadorcargo.findByFechacargo", query = "SELECT c FROM Cuidadorcargo c WHERE c.fechacargo = :fechacargo")})
public class Cuidadorcargo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "fechacargo")
    @Temporal(TemporalType.DATE)
    private Date fechacargo;
    @JoinColumn(name = "idcuidador", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Cuidador idcuidador;
    @JoinColumn(name = "idespecie", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Especie idespecie;

    public Cuidadorcargo() {
    }

    public Cuidadorcargo(Long id) {
        this.id = id;
    }

    public Cuidadorcargo(Long id, Date fechacargo) {
        this.id = id;
        this.fechacargo = fechacargo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechacargo() {
        return fechacargo;
    }

    public void setFechacargo(Date fechacargo) {
        this.fechacargo = fechacargo;
    }

    public Cuidador getIdcuidador() {
        return idcuidador;
    }

    public void setIdcuidador(Cuidador idcuidador) {
        this.idcuidador = idcuidador;
    }

    public Especie getIdespecie() {
        return idespecie;
    }

    public void setIdespecie(Especie idespecie) {
        this.idespecie = idespecie;
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
        if (!(object instanceof Cuidadorcargo)) {
            return false;
        }
        Cuidadorcargo other = (Cuidadorcargo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.POJO.Cuidadorcargo[ id=" + id + " ]";
    }
    
}
