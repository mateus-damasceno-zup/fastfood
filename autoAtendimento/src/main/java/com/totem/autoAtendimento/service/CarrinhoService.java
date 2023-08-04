package com.totem.autoAtendimento.service;


import com.totem.autoAtendimento.dto.CarrinhoDTO;
import com.totem.autoAtendimento.model.Carrinho;

import com.totem.autoAtendimento.repository.CarrinhoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CarrinhoService {

    private CarrinhoRepository carrinhoRepository;

    public CarrinhoService(CarrinhoRepository carrinhoRepository) {
        this.carrinhoRepository = carrinhoRepository;
    }
    public CarrinhoDTO adicionaCarrinho(CarrinhoDTO carrinhoDTO) {
        Carrinho savedCarrinho = carrinhoRepository.save(carrinhoDTO.toCarrinho());
        return new CarrinhoDTO(savedCarrinho);
    }

    public Optional<CarrinhoDTO> getCarrinhoById(Long id) {
        Optional<Carrinho> carrinho = carrinhoRepository.findById(id);
        return carrinho.map(CarrinhoDTO::new);
    }

    public Iterable<CarrinhoDTO> listaCarrinhos() {
        Iterable<Carrinho> carrinhos = carrinhoRepository.findAll();
        List<CarrinhoDTO> carrinhoDTOList = new ArrayList<>();

        for (Carrinho carrinho : carrinhos) {
            carrinhoDTOList.add(new CarrinhoDTO(carrinho));
        }
        return carrinhoDTOList;
    }

    public CarrinhoDTO atualizaCarrinho(Long id,CarrinhoDTO carrinhoDTO) {
        Carrinho carrinhoAtual = carrinhoRepository.findById(id).get();
        //todo: adicionar verificacao se nao existir e estourar um erro. como estourar um erro no spring
        carrinhoAtual.setLanche(carrinhoDTO.getListaLanche());
        carrinhoAtual.setListaBebidas(carrinhoDTO.getListaBebidas());
        Carrinho carrinhoAtualizado =carrinhoRepository.save(carrinhoAtual);


        return new CarrinhoDTO(carrinhoAtualizado);
    }

    public void deletaCarrinho(Long id) {
        carrinhoRepository.deleteById(id);
    }

}
