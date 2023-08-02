/*
package com.totem.autoAtendimento.model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Lanches {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nomeLanche;
    @Column(nullable = false)
    private Double preco;

    public Lanches(Long id, String nomeLanche, Double preco) {
        this.id = id;
        this.nomeLanche = nomeLanche;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }


    public String getNomeLanche() {
        return nomeLanche;
    }

    public void setNomeLanche(String nomeLanche) {
        this.nomeLanche = nomeLanche;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
*/