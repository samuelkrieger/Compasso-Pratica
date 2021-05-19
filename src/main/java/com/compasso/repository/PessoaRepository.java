package com.compasso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compasso.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
	

}
