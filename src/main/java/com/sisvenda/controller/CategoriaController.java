package com.sisvenda.controller;

import java.util.List;

import com.sisvenda.exception.NegocioException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sisvenda.entidade.Categoria;
import com.sisvenda.service.CategoriaService;

import javax.validation.Valid;

@RestController
@RequestMapping("categoria")
public class CategoriaController {
	
	@Autowired
	private CategoriaService service;
	
	@GetMapping(value="/listar")
    public List<Categoria> listar() {
        return service.listar();
    }
	
	@GetMapping(value="/pais")
    public List<Categoria> listarCategoriasPais() {
        return service.listarCategoriasPais();
    }

	@GetMapping(value="/{id}")
	public Categoria getById(@PathVariable Long id) {
		return service.getById(id);
	}
	
	@PostMapping
	public ResponseEntity<Categoria> save(@RequestBody @Valid Categoria categoria) throws NegocioException {
		categoria = service.save(categoria);
		return new ResponseEntity<>(categoria, HttpStatus.CREATED);
	}
	
}
