
package com.totem.autoAtendimento.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Transient;

@Entity
public class CarrinhoLanchesBebidas {
    @EmbeddedId
    @JsonIgnore
    private CarrinhoLancheBebidaPk pk;
    @Column(nullable = false)
    private Integer qtdBebidas;
    @Column(nullable = false)
    private Integer qtdLanches;

    public CarrinhoLanchesBebidas(Bebidas bebidas,Integer qtdBebidas, Lanches lanches,
                                   Integer qtdLanches) {
        pk = new CarrinhoLancheBebidaPk();
        pk.setBebidas(bebidas);
        this.qtdBebidas = qtdBebidas;
        pk.setLanches(lanches);
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
        return (getBebidas().getPrecoBebida() * qtdBebidas) + (getLanches().getPrecoLanche() * qtdLanches);
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
