
package com.totem.autoAtendimento.model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Lanches {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLanches;
    @Column(nullable = false)
    private String nomeLanche;
    @Column(nullable = false)
    private Double precoLanche;

    public Lanches(Long idLanches, String nomeLanche, Double precoLanche) {
        this.idLanches = idLanches;
        this.nomeLanche = nomeLanche;
        this.precoLanche = precoLanche;
    }

    public Long getIdLanches() {
        return idLanches;
    }


    public String getNomeLanche() {
        return nomeLanche;
    }

    public void setNomeLanche(String nomeLanche) {
        this.nomeLanche = nomeLanche;
    }

    public Double getPrecoLanche() {
        return precoLanche;
    }

    public void setPrecoLanche(Double precoLanche) {
        this.precoLanche = precoLanche;
    }
}
