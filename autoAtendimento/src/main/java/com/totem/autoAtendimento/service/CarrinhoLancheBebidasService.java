package com.totem.autoAtendimento.service;

import com.totem.autoAtendimento.dto.BebidasDTO;
import com.totem.autoAtendimento.dto.CarrinhoLanchesBebidasDto;
import com.totem.autoAtendimento.model.Bebidas;
import com.totem.autoAtendimento.model.CarrinhoLanchesBebidas;
import com.totem.autoAtendimento.repository.CarrinhoLanchesBebidasRepository;
import jakarta.persistence.Transient;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CarrinhoLancheBebidasService {

    private CarrinhoLanchesBebidasRepository carrinhoLanchesBebidasRepository;

    public CarrinhoLancheBebidasService(CarrinhoLanchesBebidasRepository carrinhoLanchesBebidasRepository) {
        this.carrinhoLanchesBebidasRepository = carrinhoLanchesBebidasRepository;
    }
/*
    public CarrinhoLanchesBebidasDto create(CarrinhoLanchesBebidasDto carrinhoLanchesBebidas) {
        CarrinhoLancheBebidasService carrinhoLancheBebidasService = carrinhoLanchesBebidasRepository.save(carrinhoLanchesBebidas.toCarrinhoLanchesBebidas());
        return new CarrinhoLanchesBebidasDto(carrinhoLancheBebidasService;
    }
    */

}