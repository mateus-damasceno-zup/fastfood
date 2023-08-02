/*
package com.totem.autoAtendimento.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Embeddable
public class CarrinhoLancheBebidaPk implements Serializable {
    private static final long serialVersionUID = 476151177562655457L;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "carrinho_id")
    private Carrinho carrinho;
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "bebidas_id")
    private Bebidas bebidas;
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "lanches_id")
    private Lanches lanches;

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public Bebidas getBebidas() {
        return bebidas;
    }

    public void setBebidas(Bebidas bebidas) {
        this.bebidas = bebidas;
    }

    public Lanches getLanches() {
        return lanches;
    }

    public void setLanches(Lanches lanches) {
        this.lanches = lanches;
    }
}
*/