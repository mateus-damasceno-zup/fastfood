package com.totem.autoAtendimento.model;

import jakarta.persistence.*;

import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
public class Bebidas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBebida;
    @Column(nullable = false)
    private String nomeBebida;
    @Column(nullable = false)
    private Double precoBebida;



    public Bebidas(Long id, String nomeBebida, Double precoBebida) {
        this.idBebida = id;
        this.nomeBebida = nomeBebida;
        this.precoBebida = precoBebida;
    }

    public Long getIdBebida() {
        return idBebida;
    }


    public String getNomeBebida() {
        return nomeBebida;
    }

    public void setNomeBebida(String nomeBebida) {
        this.nomeBebida = nomeBebida;
    }

    public Double getPrecoBebida() {
        return precoBebida;
    }

    public void setPrecoBebida(Double precoBebida) {
        this.precoBebida = precoBebida;
    }
}
