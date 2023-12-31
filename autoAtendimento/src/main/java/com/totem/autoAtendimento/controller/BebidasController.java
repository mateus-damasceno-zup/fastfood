package com.totem.autoAtendimento.controller;

import com.totem.autoAtendimento.dto.BebidasDTO;
import com.totem.autoAtendimento.service.BebidaService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/bebidas")
public class BebidasController {

    private final BebidaService bebidaService;



    public BebidasController(BebidaService bebidaService) {
        this.bebidaService = bebidaService;
    }

    @GetMapping
    public Iterable<BebidasDTO> listaBebidas() {

        return bebidaService.listaBebidas();
    }
    @GetMapping(value = "/{id}")
    public Optional<BebidasDTO> getBebidasById(@PathVariable Long id) {
        return bebidaService.getBebidasById(id);
    }

    @PostMapping
    public BebidasDTO novaBebida(@RequestBody BebidasDTO bebidasDTO){
        return bebidaService.cadastraBebidas(bebidasDTO);
    }
    @DeleteMapping(path = "/{id}")
    public void deletaBebida(@PathVariable Long id){
        bebidaService.deletaBebida(id);
    }

    @PutMapping("/{id}")
    public BebidasDTO atualizaBebida (@PathVariable Long id,
                                         @RequestBody BebidasDTO bebidasDTO){
        return bebidaService.atualizaBebida(id,bebidasDTO);
    }
}
