
package com.totem.autoAtendimento.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.totem.autoAtendimento.model.Bebidas;
import com.totem.autoAtendimento.model.Carrinho;
import com.totem.autoAtendimento.model.Lanches;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CarrinhoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private List<Bebidas> listaBebidas;

    private List<Lanches> listaLanche;

    public CarrinhoDTO(Carrinho carrinho){
        this.id = carrinho.getIdCarrinho();
        this.listaBebidas = carrinho.getListaBebidas();
        this.listaLanche = carrinho.getLanche();

    }
    public Carrinho toCarrinho(){
        return new Carrinho(id, listaBebidas,listaLanche);
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

    public List<Lanches> getListaLanche() {
        return listaLanche;
    }

    public void setListaLanche(List<Lanches> listaLanche) {
        this.listaLanche = listaLanche;
    }
}
