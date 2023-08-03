
package com.totem.autoAtendimento.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.totem.autoAtendimento.model.Lanches;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class LanchesDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String nomeLanche;

    private Double preco;

    public LanchesDTO(Lanches lanche){
        this.id = lanche.getId();
        this.nomeLanche = lanche.getNomeLanche();
        this.preco = lanche.getPreco();

    }
    public Lanches toLanche(){
        return new Lanches(id, nomeLanche,preco);
    }

    public Long getId() {
        return id;
    }

    public String getNomeLanche() {
        return nomeLanche;
    }

    public Double getPreco() {
        return preco;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNomeLanche(String nomeLanche) {
        this.nomeLanche = nomeLanche;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
