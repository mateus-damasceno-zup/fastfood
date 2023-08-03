package com.totem.autoAtendimento.controller;


import com.totem.autoAtendimento.dto.BebidasDTO;
import com.totem.autoAtendimento.dto.LanchesDTO;
import com.totem.autoAtendimento.service.LancheService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/lanches")
public class LanchesController {

    private final LancheService lanchesService;


    public LanchesController(LancheService lanchesService) {
        this.lanchesService = lanchesService;
    }

    @GetMapping
    public Iterable<LanchesDTO> listaLanches() {

        return lanchesService.listaLanches();
    }
    @GetMapping(value = "/{id}")
    public Optional<LanchesDTO> getLancheById(@PathVariable Long id) {
        return lanchesService.getLancheById(id);
    }

    @PostMapping
    public LanchesDTO novoLanche(@RequestBody LanchesDTO lanchesDTO){
        return lanchesService.cadastraLanche(lanchesDTO);
    }
    @DeleteMapping(path = "/{id}")
    public void deletaLanche(@PathVariable Long id){
        lanchesService.deletaLanche(id);
    }
    @PutMapping("/{id}")
    public LanchesDTO atualizaLanche (@PathVariable Long id,
                                      @RequestBody LanchesDTO lanchesDTO){
        return lanchesService.atualizaLanche(id,lanchesDTO);
    }

}
