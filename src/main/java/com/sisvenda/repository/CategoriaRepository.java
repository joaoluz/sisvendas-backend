package com.sisvenda.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.sisvenda.entidade.Categoria;

import java.util.List;

@Repository
public interface CategoriaRepository  extends PagingAndSortingRepository<Categoria, Long> {

    @Query("select c from Categoria c where c.categoriaPai is null")
    List<Categoria> listarCategoriasPais();
}
