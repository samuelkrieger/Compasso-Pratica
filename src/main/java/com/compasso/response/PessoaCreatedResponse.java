package com.compasso.response;

import org.springframework.http.HttpStatus;

import com.compasso.model.entity.Pessoa;
import com.compasso.model.response.PessoaResponse;


public class PessoaCreatedResponse extends Response<Pessoa> {

	public PessoaCreatedResponse(PessoaResponse created) {
		 super("Pessoa-created", "", HttpStatus.CREATED, created);
	}
   
}
