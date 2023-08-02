/*
package com.totem.autoAtendimento.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Carrinho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private List<Bebidas> listaBebidas = new ArrayList<>();
    @Column
    private List<Lanches> listaLanche = new ArrayList<>();

    @Transient
    public Double getPrecototalBebidas(){
        double soma = 0;
        List<Bebidas> pedidoBebidas = getListaBebidas();
        for (Bebidas b : pedidoBebidas){
            soma +=b.getPreco();
        }
        return soma;
    }
    @Transient
    public Double getPrecototalLanches(){
        double soma = 0;
        List<Lanches> pedidoLanches = getLanche();
        for (Lanches l : pedidoLanches){
            soma +=l.getPreco();
        }
        return soma;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Bebidas> getListaBebidas() {
        return listaBebidas;
    }

    public void setListaBebidas(List<Bebidas> listaBebidas) {
        this.listaBebidas = listaBebidas;
    }

    public List<Lanches> getLanche() {
        return listaLanche;
    }

    public void setLanche(List<Lanches> lanche) {
        this.listaLanche = lanche;
    }
}
*/