package com.sisvenda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sisvenda.entidade.Categoria;
import com.sisvenda.repository.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;
	
	public List<Categoria> listar() {
		return (List<Categoria>) repository.findAll();
	}
	
	public Categoria getById(Long id) {
		return repository.findById(id).get();
	}

	public Categoria save(Categoria categoria) {
		return repository.save(categoria);
	}
	
}
