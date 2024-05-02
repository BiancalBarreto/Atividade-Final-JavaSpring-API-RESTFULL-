package com.pizzariaapi.models;

import jakarta.persistence.*;

@Entity
public class Pizza {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @Column(nullable = false)
        private String nome;

        @Column(nullable = false)
        private float precoBase;

        @Column(nullable = false)
        private String personalizada;

        public Pizza() {
        }

        public long getId() {
                return id;
        }

        public void setId(long id) {
                this.id = id;
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public float getPrecoBase() {
                return precoBase;
        }

        public void setPrecoBase(float precoBase) {
                this.precoBase = precoBase;
        }

        public String getPersonalizada() {
                return personalizada;
        }

        public void setPersonalizada(String personalizada) {
                this.personalizada = personalizada;
        }
}
