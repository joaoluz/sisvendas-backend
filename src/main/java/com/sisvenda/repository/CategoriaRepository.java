package com.sisvenda.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sisvenda.entidade.Categoria;

@Repository
public interface CategoriaRepository  extends CrudRepository<Categoria, Long>{

}
