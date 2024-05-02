package com.pizzariaapi.models;

import jakarta.persistence.*;

@Entity
public class Fornada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private int numFornada;

    @Column(nullable = false)
    private int qtdPizzas;

    public Fornada() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumFornada() {
        return numFornada;
    }

    public void setNumFornada(int numFornada) {
        this.numFornada = numFornada;
    }

    public int getQtdPizzas() {
        return qtdPizzas;
    }

    public void setQtdPizzas(int qtdPizzas) {
        this.qtdPizzas = qtdPizzas;
    }
}
