package com.compasso.service;

import org.springframework.stereotype.Service;

import com.compasso.domain.Pessoa;
import com.compasso.error.BadPessoaException;
import com.compasso.error.PessoaNotFoundException;
import com.compasso.repository.PessoaRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Service
public class PessoaService {
	   private static final Logger log = LoggerFactory.getLogger(PessoaService.class);

	   private final PessoaRepository repository;
	   
	   public PessoaService(final PessoaRepository repository) {
		   this.repository=repository;
	   }

	    public Pessoa createNewPessoa(final Pessoa pessoa) {
	        try {
	            return this.repository.save(pessoa);
	        } catch (Exception ex) {
	            log.info("error trying to create new pessoa. {}", ex.getMessage());
	            throw new BadPessoaException(pessoa.getNome());
	        }
	    }
	    public Pessoa findById(final Long id) {
	        return this.repository.findById(id).orElseThrow(() -> new PessoaNotFoundException(id));
	    }

}
