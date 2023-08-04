package com.totem.autoAtendimento.service;

import com.totem.autoAtendimento.dto.LanchesDTO;
import com.totem.autoAtendimento.model.Lanches;
import com.totem.autoAtendimento.repository.LancheRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class LancheService {

    private final LancheRepository lancheRepository;


    public LancheService(LancheRepository lancheRepository) {
        this.lancheRepository = lancheRepository;
    }

    public LanchesDTO cadastraLanche(LanchesDTO lanchesDTO) {
        Lanches savedLanche = lancheRepository.save(lanchesDTO.toLanche());
        return new LanchesDTO(savedLanche);
    }

    public Optional<LanchesDTO> getLancheById(Long id) {
        Optional<Lanches> lanche = lancheRepository.findById(id);
        return lanche.map(LanchesDTO::new);
    }

    public Iterable<LanchesDTO> listaLanches() {
        Iterable<Lanches> lanches = lancheRepository.findAll();
        List<LanchesDTO> lancheDTOList = new ArrayList<>();

        for (Lanches lanche : lanches) {
            lancheDTOList.add(new LanchesDTO(lanche));
        }
        return lancheDTOList;
    }

    public LanchesDTO atualizaLanche(Long id,LanchesDTO lanchesDTO) {
        Lanches lancheAtual = lancheRepository.findById(id).get();
        //todo: adicionar verificacao se nao existir e estourar um erro. como estourar um erro no spring
        lancheAtual.setNomeLanche(lanchesDTO.getNomeLanche());
        lancheAtual.setPrecoLanche(lanchesDTO.getPreco());
        Lanches lancheAtualizado =lancheRepository.save(lancheAtual);


       return new LanchesDTO(lancheAtualizado);
    }

    public void deletaLanche(Long id) {
        lancheRepository.deleteById(id);
    }

}
