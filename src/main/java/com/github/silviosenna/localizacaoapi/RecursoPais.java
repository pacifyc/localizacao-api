package com.github.silviosenna.localizacaoapi;

import com.github.silviosenna.localizacaoapi.pais.Pais;
import com.github.silviosenna.localizacaoapi.repository.PaisRepository;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController

@RequestMapping("/pais")


public class RecursoPais {
	

	private PaisRepository repository;
	
	public RecursoPais(PaisRepository repository) {
	this.repository = repository;
		  }
	
	@GetMapping
	public List<Pais> pais(){

		return repository.findAll();
				}

}
