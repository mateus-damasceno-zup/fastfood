package com.totem.autoAtendimento.repository;

import com.totem.autoAtendimento.model.Bebidas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BebidasRepository extends CrudRepository<Bebidas,Long> {
}
