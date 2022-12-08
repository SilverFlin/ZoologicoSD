/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
 * @author mig_2
 */
@Entity
@Table(name = "cuidadordominada")
@NamedQueries({
    @NamedQuery(name = "Cuidadordominada.findAll", query = "SELECT c FROM Cuidadordominada c"),
    @NamedQuery(name = "Cuidadordominada.findById", query = "SELECT c FROM Cuidadordominada c WHERE c.id = :id"),
    @NamedQuery(name = "Cuidadordominada.findByIsdominada", query = "SELECT c FROM Cuidadordominada c WHERE c.isdominada = :isdominada")})
public class Cuidadordominada implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "isdominada")
    private short isdominada;
    @JoinColumn(name = "idcuidador", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Cuidador idcuidador;
    @JoinColumn(name = "idespecie", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Especie idespecie;

    public Cuidadordominada() {
    }

    public Cuidadordominada(Long id) {
        this.id = id;
    }

    public Cuidadordominada(Long id, short isdominada) {
        this.id = id;
        this.isdominada = isdominada;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public short getIsdominada() {
        return isdominada;
    }

    public void setIsdominada(short isdominada) {
        this.isdominada = isdominada;
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
        if (!(object instanceof Cuidadordominada)) {
            return false;
        }
        Cuidadordominada other = (Cuidadordominada) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Cuidadordominada[ id=" + id + " ]";
    }
    
}
