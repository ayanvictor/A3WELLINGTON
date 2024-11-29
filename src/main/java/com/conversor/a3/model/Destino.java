package com.conversor.a3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "Destino")
public class Destino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "DES_INT_ID")
    private int id;
    @ManyToOne
    @JoinColumn (name = "MOE_INT_ID", referencedColumnName = "MOE_INT_ID")
    private Moeda moeda;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Moeda getMoeda() {
        return moeda;
    }
    public void setMoeda(Moeda moeda) {
        this.moeda = moeda;
    }

}
