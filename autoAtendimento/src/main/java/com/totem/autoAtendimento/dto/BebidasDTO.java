package com.totem.autoAtendimento.dto;

import com.totem.autoAtendimento.model.Bebidas;

import java.io.Serializable;


public class BebidasDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String nomeBebida;

    private Double preco;

    public BebidasDTO(Bebidas bebida){
        this.id = bebida.getId();
        this.nomeBebida = bebida.getNomeBebida();
        this.preco = bebida.getPreco();

    }
    public Bebidas toBebidas(){
        return new Bebidas(id,nomeBebida,preco);
    }

    public Long getId() {
        return id;
    }

    public String getNomeBebida() {
        return nomeBebida;
    }

    public Double getPreco() {
        return preco;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNomeBebida(String nomeBebida) {
        this.nomeBebida = nomeBebida;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
