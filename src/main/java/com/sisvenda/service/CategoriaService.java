package com.sisvenda.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.sisvenda.entidade.Categoria;
import com.sisvenda.exception.NegocioException;
import com.sisvenda.repository.CategoriaRepository;

@Service
public class CategoriaService {
	final static private Logger LOGGER = LoggerFactory.getLogger (CategoriaService.class);
	@Autowired
	private CategoriaRepository repository;
	
	public Page<Categoria> listar(Pageable pageable) {
		return repository.findAll(pageable);
	}

	public Categoria getById(Long id) {
		LOGGER.info("João testando");
		return repository.findById(id).get();
	}

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
