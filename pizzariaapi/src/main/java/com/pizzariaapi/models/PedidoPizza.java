package com.pizzariaapi.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class PedidoPizza extends Pizza{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int quantidade;


    public PedidoPizza() {
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
