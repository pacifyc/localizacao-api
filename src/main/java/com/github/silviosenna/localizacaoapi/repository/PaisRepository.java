package com.github.silviosenna.localizacaoapi.repository;

import com.github.silviosenna.localizacaoapi.pais.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaisRepository extends JpaRepository<Pais, Long> {
	
	

}
