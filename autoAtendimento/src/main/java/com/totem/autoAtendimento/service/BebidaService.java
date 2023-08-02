package com.totem.autoAtendimento.service;

import com.totem.autoAtendimento.model.Bebidas;
import com.totem.autoAtendimento.dto.BebidasDTO;
import com.totem.autoAtendimento.repository.BebidasRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BebidaService {

    private final BebidasRepository bebidasRepository;


    public BebidaService(BebidasRepository bebidasRepository) {
        this.bebidasRepository = bebidasRepository;
    }

    public BebidasDTO cadastraBebidas (BebidasDTO bebida){
        Bebidas savedBebida = bebidasRepository.save(bebida.toBebidas());
        return new BebidasDTO(savedBebida);
    }

    public Optional<BebidasDTO> getBebidasById(Long id){
        Optional<Bebidas> bebida = bebidasRepository.findById(id);
        if (bebida.isPresent())
            return Optional.of(new BebidasDTO(bebida.get()));
        return Optional.empty();
    }

    public Iterable<BebidasDTO> listaBebidas(){
        Iterable<Bebidas> bebidas = bebidasRepository.findAll();
        List<BebidasDTO> bebidasDTOList = new ArrayList<>();

        for(Bebidas bebida : bebidas){
            bebidasDTOList.add(new BebidasDTO(bebida));
        }
        return bebidasDTOList;
    }

    public BebidasDTO atualizaBebida (Long id, BebidasDTO bebidasDTO){
        Bebidas bebidaAtual = getBebidasById(id).get().toBebidas();

        if(bebidasDTO.getNomeBebida()!=null){
            bebidaAtual.setNomeBebida(bebidasDTO.getNomeBebida());
        }
        if(bebidasDTO.getPreco()!=null){
            bebidaAtual.setPreco(bebidasDTO.getPreco());
        }
        bebidaAtual = bebidasRepository.save(bebidasDTO.toBebidas());
        return new BebidasDTO(bebidaAtual);
    }

    public void deletaBebida(Long id){
        bebidasRepository.deleteById(id);
    }

}
