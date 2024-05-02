package com.pizzariaapi.models;

import jakarta.persistence.*;

@Entity
public class Ingrediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private float descricao;

    public Ingrediente() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getDescricao() {
        return descricao;
    }

    public void setDescricao(float descricao) {
        this.descricao = descricao;
    }
}
