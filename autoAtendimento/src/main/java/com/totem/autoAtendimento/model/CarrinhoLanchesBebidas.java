/*
package com.totem.autoAtendimento.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Transient;

@Entity
public class CarrinhoLanchesBebidas {
    @EmbeddedId
    @JsonIgnore
    private CarrinhoLancheBebidaPk pk;

    private Integer qtdBebidas;
    private Integer qtdLanches;

    public CarrinhoLanchesBebidas(Carrinho carrinho, Bebidas bebidas,Lanches lanches,
                                  Integer qtdBebidas, Integer qtdLanches) {
        pk = new CarrinhoLancheBebidaPk();
        pk.setLanches(lanches);
        pk.setBebidas(bebidas);
        this.qtdBebidas = qtdBebidas;
        this.qtdLanches = qtdLanches;
    }
    @Transient
    public Lanches getLanches(){
        return this.pk.getLanches();
    }
    @Transient
    public Bebidas getBebidas(){
        return this.pk.getBebidas();
    }

    @Transient
    public Double getPrecoTotal(){
        return (getBebidas().getPreco() * qtdBebidas) + (getLanches().getPreco() * qtdLanches);
    }

    public CarrinhoLancheBebidaPk getPk() {
        return pk;
    }

    public void setPk(CarrinhoLancheBebidaPk pk) {
        this.pk = pk;
    }

    public Integer getQtdBebidas() {
        return qtdBebidas;
    }

    public void setQtdBebidas(Integer qtdBebidas) {
        this.qtdBebidas = qtdBebidas;
    }

    public Integer getQtdLanches() {
        return qtdLanches;
    }

    public void setQtdLanches(Integer qtdLanches) {
        this.qtdLanches = qtdLanches;
    }
}
*/