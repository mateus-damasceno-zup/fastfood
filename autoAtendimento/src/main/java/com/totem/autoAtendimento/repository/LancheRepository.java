
package com.totem.autoAtendimento.repository;


import com.totem.autoAtendimento.model.Lanches;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LancheRepository extends CrudRepository<Lanches,Long> {
}
