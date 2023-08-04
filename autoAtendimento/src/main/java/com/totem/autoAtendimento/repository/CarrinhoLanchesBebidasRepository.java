package com.totem.autoAtendimento.repository;

import com.totem.autoAtendimento.model.CarrinhoLancheBebidaPk;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrinhoLanchesBebidasRepository extends CrudRepository<CarrinhoLanchesBebidasRepository, CarrinhoLancheBebidaPk> {
}
