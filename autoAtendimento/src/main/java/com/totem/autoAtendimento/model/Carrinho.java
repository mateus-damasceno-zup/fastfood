
package com.totem.autoAtendimento.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="carrinhoLanchesBebidas")

public class Carrinho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCarrinho;
    @OneToMany(mappedBy = "Bebidas")
    @Column(nullable = false)
    private List<Bebidas> listaBebidas = new ArrayList<>();
    @Column(nullable = false)
    @OneToMany(mappedBy = "Lanches")
    private List<Lanches> listaLanche = new ArrayList<>();



    public Carrinho(Long idCarrinho, List<Bebidas> listaBebidas, List<Lanches> listaLanche) {
        this.idCarrinho = idCarrinho;
        this.listaBebidas = listaBebidas;
        this.listaLanche = listaLanche;
    }
    @Transient
    public Double getPrecototalBebidas(){
        double soma = 0D;
        List<Bebidas> pedidoBebidas = getListaBebidas();
        for (Bebidas b : pedidoBebidas){
            soma +=b.getPrecoBebida();
        }
        return soma;
    }
    @Transient
    public Double getPrecototalLanches(){
        double soma = 0D;
        List<Lanches> pedidoLanches = getLanche();
        for (Lanches l : pedidoLanches){
            soma +=l.getPrecoLanche();
        }
        return soma;
    }

    @Transient
    public int getNumeroTotalDeBebidas(){
        return this.listaBebidas.size();
    }
    @Transient
    public int getNumeroTotalDeLanches(){
        return this.listaLanche.size();
    }

    public Long getIdCarrinho() {
        return idCarrinho;
    }

    public void setIdCarrinho(Long idCarrinho) {
        this.idCarrinho = idCarrinho;
    }

    public List<Bebidas> getListaBebidas() {
        return listaBebidas;
    }

    public void setListaBebidas(List<Bebidas> listaBebidas) {
        this.listaBebidas = listaBebidas;
    }

    public List<Lanches>    getLanche() {
        return listaLanche;
    }

    public void setLanche(List<Lanches> lanche) {
        this.listaLanche = lanche;
    }
}
