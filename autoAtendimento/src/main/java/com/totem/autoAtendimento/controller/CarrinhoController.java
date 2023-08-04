package com.totem.autoAtendimento.controller;

import com.totem.autoAtendimento.dto.BebidasDTO;
import com.totem.autoAtendimento.dto.CarrinhoDTO;
import com.totem.autoAtendimento.service.BebidaService;
import com.totem.autoAtendimento.service.CarrinhoService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/carrinho")
public class CarrinhoController {

    private final CarrinhoService carrinhoService;



    public CarrinhoController(CarrinhoService carrinhoService) {
        this.carrinhoService = carrinhoService;
    }

    @GetMapping
    public Iterable<CarrinhoDTO> listaCarrinho() {

        return carrinhoService.listaCarrinhos();
    }
    @GetMapping(value = "/{id}")
    public Optional<CarrinhoDTO> getCarrinhoById(@PathVariable Long id) {
        return carrinhoService.getCarrinhoById(id);
    }

    @PostMapping
    public CarrinhoDTO novoCarrinho(@RequestBody CarrinhoDTO carrinhoDTO){
        return carrinhoService.adicionaCarrinho(carrinhoDTO);
    }
    @DeleteMapping(path = "/{id}")
    public void deletaBebida(@PathVariable Long id){
        carrinhoService.deletaCarrinho(id);
    }

    @PutMapping("/{id}")
    public CarrinhoDTO atualizaBebida (@PathVariable Long id,
                                         @RequestBody CarrinhoDTO carrinhoDTO){
        return carrinhoService.atualizaCarrinho(id,carrinhoDTO);
    }
}
