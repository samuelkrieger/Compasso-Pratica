package com.compasso.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.compasso.model.request.PessoaRequest;
import com.compasso.model.response.PessoaResponse;
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
	            notes = "Criar uma nova pessoa",
	            response = PessoaCreatedResponse.class,
	            tags = {"Creation"}
	    )
	    @ApiResponses({
	            @ApiResponse(code = 201, message = "pessoa-criada", response = PessoaCreatedResponse.class),
	            @ApiResponse(code = 400, message = "pessoa-erro"),
	    })
	    public PessoaCreatedResponse created (@RequestBody PessoaRequest request) {
	    	final PessoaResponse created=this.service.created(request);
	    	return new PessoaCreatedResponse(created);
	    }
	    
	    @GetMapping("/{id}")
	    @ResponseStatus(HttpStatus.OK)
	    @ApiOperation(
	            value = "Encontrar uma Pessoa pelo Id",
	            nickname = "find",
	            notes = "Encontrar uma Pessoa pelo Id",
	            response = PessoaFoundResponse.class,
	            tags = {"Find"}
	    )
	    @ApiResponses({
	            @ApiResponse(code = 200, message = "pessoa-found", response = PessoaFoundResponse.class),
	            @ApiResponse(code = 404, message = "pessoa-not-found", response = PessoaFoundResponse.class),
	    })
	    public PessoaFoundResponse get(@PathVariable("id") Long id) {
	    	Optional<PessoaResponse> userResponse = this.service.findById(id);
	    	
	        return new PessoaFoundResponse(userResponse.get());
	    }


	
	

}
