package com.compasso.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compasso.model.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
	

}
