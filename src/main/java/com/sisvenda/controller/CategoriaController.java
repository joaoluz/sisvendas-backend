package com.sisvenda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sisvenda.entidade.Categoria;
import com.sisvenda.service.CategoriaService;

@RestController
@RequestMapping("categoria")
public class CategoriaController {
	
	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value="/listar",method=RequestMethod.GET)
    public List<Categoria> listar() {
        return service.listar();
    }
	
}
