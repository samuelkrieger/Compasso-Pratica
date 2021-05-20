package com.compasso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.compasso.domain.Pessoa;
import com.compasso.response.PessoaCreatedResponse;
import com.compasso.response.PessoaFoundResponse;
import com.compasso.service.PessoaService;

@RestController
@RequestMapping("/api/pessoa")
public class PessoaControler {
	
	    @Autowired
	    private PessoaService service;
	    
	    @PostMapping
	    @ResponseStatus(HttpStatus.CREATED)
	    public PessoaCreatedResponse create(@RequestBody Pessoa pessoa) {
	        final Pessoa created = this.service.createNewPessoa(pessoa);
	        return new PessoaCreatedResponse(created);
	    }
	    
	    @GetMapping("/{id}")
	    @ResponseStatus(HttpStatus.OK)
	    public PessoaFoundResponse find( @PathVariable String id) {
	        long ids=Long.parseLong(id);
	    	final Pessoa found = this.service.findById(ids);
	        return new PessoaFoundResponse(found);
	    }


	
	

}
