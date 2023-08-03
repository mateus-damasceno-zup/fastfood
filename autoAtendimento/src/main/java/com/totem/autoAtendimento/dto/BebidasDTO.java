package com.totem.autoAtendimento.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.totem.autoAtendimento.model.Bebidas;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

import java.io.Serializable;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class BebidasDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String nomeBebida;

    private Double preco;


    public BebidasDTO(Bebidas bebidas) {
        this.id = bebidas.getId();
        this.nomeBebida = bebidas.getNomeBebida();
        this.preco = bebidas.getPreco();
    }

    public Bebidas toBebidas() {
        return new Bebidas(id,nomeBebida, preco);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
