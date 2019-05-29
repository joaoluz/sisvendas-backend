package com.sisvenda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sisvenda.entidade.Categoria;
import com.sisvenda.service.CategoriaService;

@RestController
@RequestMapping("categoria")
public class CategoriaController {
	
	@Autowired
	private CategoriaService service;
	
	@GetMapping(value="/listar")
    public List<Categoria> listar() {
        return service.listar();
    }
	
	@GetMapping(value="/{id}")
	public Categoria getById(@PathVariable Long id) {
		return service.getById(id);
	}
	
	@PostMapping
	public Categoria save(@RequestBody Categoria categoria) {
		return service.save(categoria);
	}
	
}
