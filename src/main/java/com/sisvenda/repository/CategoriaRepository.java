package com.sisvenda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.sisvenda.entidade.Categoria;

public interface CategoriaRepository  extends PagingAndSortingRepository<Categoria, Long> {

    @Query("select c from Categoria c where c.categoriaPai is null")
    List<Categoria> listarCategoriasPais();
}
