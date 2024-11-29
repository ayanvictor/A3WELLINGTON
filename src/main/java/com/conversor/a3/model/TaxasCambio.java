package com.conversor.a3.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "TaxasCambio")
public class TaxasCambio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "TAX_INT_ID")
    private int id;

    @ManyToOne
    @JoinColumn (name = "CON_INT_ID", referencedColumnName = "CON_INT_ID")
    private Conversao conversao;

    @Column (name = "TAX_DEC_TAXAS")
    private Double taxa;

    @Column (name = "TAX_DATE_DATA")
    private Date date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Conversao getConversao() {
        return conversao;
    }

    public void setConversao(Conversao conversao) {
        this.conversao = conversao;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
