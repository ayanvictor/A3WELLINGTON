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
@Table (name = "Conversao")
public class Conversao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "CON_INT_ID")
    private int id;
    
    @ManyToOne
    @JoinColumn (name = "ORI_INT_ID", referencedColumnName = "ORI_INT_ID")
    private Origem origem;

    @ManyToOne
    @JoinColumn (name = "DES_INT_ID", referencedColumnName = "DES_INT_ID")
    private Destino destino;

    @Column (name = "CON_STR_NAME")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Origem getOrigem() {
        return origem;
    }

    public void setOrigem(Origem origem) {
        this.origem = origem;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
