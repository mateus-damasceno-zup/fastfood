package com.totem.autoAtendimento.model;

import jakarta.persistence.*;

import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
public class Bebidas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nomeBebida;
    @Column(nullable = false)
    private Double preco;

    public Bebidas(Long id, String nomeBebida, Double preco) {
        this.id = id;
        this.nomeBebida = nomeBebida;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }


    public String getNomeBebida() {
        return nomeBebida;
    }

    public void setNomeBebida(String nomeBebida) {
        this.nomeBebida = nomeBebida;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
