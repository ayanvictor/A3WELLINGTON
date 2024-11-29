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
@Table (name = "MOEDAS")
public class Moeda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "MOE_INT_ID")
    private int id;
    @Column (name = "MOE_STR_NOME")
    private String name;
    @Column (name = "MOE_STR_SYMBOL")
    private String symbol;
    @ManyToOne
    @JoinColumn (name = "PES_INT_ID", referencedColumnName = "PES_INT_ID")
    private Pessoas pessoa;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSymbol() {
        return symbol;
    }
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    public Pessoas getPessoa() {
        return pessoa;
    }
    public void setPessoa(Pessoas pessoa) {
        this.pessoa = pessoa;
    }
}
