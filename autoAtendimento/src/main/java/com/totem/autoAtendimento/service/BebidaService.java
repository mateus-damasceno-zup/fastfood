package com.totem.autoAtendimento.service;

import com.totem.autoAtendimento.model.Bebidas;
import com.totem.autoAtendimento.dto.BebidasDTO;
import com.totem.autoAtendimento.repository.BebidasRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BebidaService {

    private final BebidasRepository bebidasRepository;


    public BebidaService(BebidasRepository bebidasRepository) {
        this.bebidasRepository = bebidasRepository;
    }

    public BebidasDTO cadastraBebidas(BebidasDTO bebida) {
        Bebidas savedBebida = bebidasRepository.save(bebida.toBebidas());
        return new BebidasDTO(savedBebida);
    }

    public Optional<BebidasDTO> getBebidasById(Long id) {
        Optional<Bebidas> bebida = bebidasRepository.findById(id);
        return bebida.map(BebidasDTO::new);
    }

    public Iterable<BebidasDTO> listaBebidas() {
        Iterable<Bebidas> bebidas = bebidasRepository.findAll();
        List<BebidasDTO> bebidasDTOList = new ArrayList<>();

        for (Bebidas bebida : bebidas) {
            bebidasDTOList.add(new BebidasDTO(bebida));
        }
        return bebidasDTOList;
    }

    public BebidasDTO atualizaBebida(Long id,BebidasDTO bebidasDTO) {
        Bebidas bebidasAtual = bebidasRepository.findById(id).get();
        //todo: adicionar verificacao se nao existir e estourar um erro. como estourar um erro no spring
        bebidasAtual.setNomeBebida(bebidasDTO.getNomeBebida());
        bebidasAtual.setPrecoBebida(bebidasDTO.getPreco());
        Bebidas bebidasAtualizada =bebidasRepository.save(bebidasAtual);


       return new BebidasDTO(bebidasAtualizada);
    }

    public void deletaBebida(Long id) {
        bebidasRepository.deleteById(id);
    }

}
