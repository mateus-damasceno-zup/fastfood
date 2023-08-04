package com.totem.autoAtendimento.dto;

import com.totem.autoAtendimento.model.Bebidas;
import com.totem.autoAtendimento.model.Carrinho;
import com.totem.autoAtendimento.model.CarrinhoLanchesBebidas;
import com.totem.autoAtendimento.model.Lanches;

public class CarrinhoLanchesBebidasDto {

    private Bebidas bebidas;
    private Integer qtdBebidas;
    private Lanches lanches;
    private Integer qtdLanches;

    public CarrinhoLanchesBebidasDto(CarrinhoLanchesBebidas carrinhoLanchesBebidas) {
        this.bebidas = carrinhoLanchesBebidas.getBebidas();
        this.qtdBebidas = carrinhoLanchesBebidas.getQtdBebidas();
        this.lanches = carrinhoLanchesBebidas.getLanches();
        this.qtdLanches = carrinhoLanchesBebidas.getQtdLanches();
    }

    public CarrinhoLanchesBebidas toCarrinhoLanchesBebidas(){
        return new CarrinhoLanchesBebidas(bebidas,qtdBebidas,lanches,qtdLanches);
    }

    public Bebidas getBebidas() {
        return bebidas;
    }

    public void setBebidas(Bebidas bebidas) {
        this.bebidas = bebidas;
    }

    public Integer getQtdBebidas() {
        return qtdBebidas;
    }

    public void setQtdBebidas(Integer qtdBebidas) {
        this.qtdBebidas = qtdBebidas;
    }

    public Lanches getLanches() {
        return lanches;
    }

    public void setLanches(Lanches lanches) {
        this.lanches = lanches;
    }

    public Integer getQtdLanches() {
        return qtdLanches;
    }

    public void setQtdLanches(Integer qtdLanches) {
        this.qtdLanches = qtdLanches;
    }
}
