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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value = "pessoa")
@RequestMapping("/api/pessoa")
public class PessoaControler {
	
	    @Autowired
	    private PessoaService service;
	    
	    @PostMapping
	    @ResponseStatus(HttpStatus.CREATED)
	    @ApiOperation(
	            value = "Create Pessoa",
	            nickname = "create",
	            notes = "Creates a new Pessoa",
	            response = PessoaCreatedResponse.class,
	            tags = {"Creation"}
	    )
	    @ApiResponses({
	            @ApiResponse(code = 201, message = "pessoa-created", response = PessoaCreatedResponse.class),
	            @ApiResponse(code = 400, message = "pessoa-error"),
	    })
	    public PessoaCreatedResponse create(@RequestBody Pessoa pessoa) {
	        final Pessoa created = this.service.createNewPessoa(pessoa);
	        return new PessoaCreatedResponse(created);
	    }
	    
	    @GetMapping("/{id}")
	    @ResponseStatus(HttpStatus.OK)
	    @ApiOperation(
	            value = "Find Pessoa by Id",
	            nickname = "find",
	            notes = "Finds an existing pessoa by id",
	            response = PessoaFoundResponse.class,
	            tags = {"Find"}
	    )
	    @ApiResponses({
	            @ApiResponse(code = 200, message = "pessoa-found", response = PessoaFoundResponse.class),
	            @ApiResponse(code = 404, message = "pessoa-not-found", response = PessoaFoundResponse.class),
	    })
	    public PessoaFoundResponse find( @PathVariable String id) {
	        long ids=Long.parseLong(id);
	    	final Pessoa found = this.service.findById(ids);
	        return new PessoaFoundResponse(found);
	    }


	
	

}
