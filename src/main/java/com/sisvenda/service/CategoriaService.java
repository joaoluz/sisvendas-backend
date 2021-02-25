package com.sisvenda.service;

import java.util.List;

import com.sisvenda.exception.NegocioException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.sisvenda.entidade.Categoria;
import com.sisvenda.repository.CategoriaRepository;

import javax.transaction.Transactional;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;
	
	public Page<Categoria> listar(Pageable pageable) {
		return repository.findAll(pageable);
	}

	public Categoria getById(Long id) {
		return repository.findById(id).get();
	}

	@Transactional
	public Categoria save(Categoria categoria) throws NegocioException {
		try {
			categoria = repository.save(categoria);
		} catch (Exception e) {
			throw new NegocioException("Falha ao cadastrar categoria");
		}

		return categoria;
	}

    public List<Categoria> listarCategoriasPais() {
		return repository.listarCategoriasPais();
    }
}
