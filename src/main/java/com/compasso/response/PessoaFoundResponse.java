package com.compasso.response;

import org.springframework.http.HttpStatus;

import com.compasso.model.entity.Pessoa;
import com.compasso.model.response.PessoaResponse;

public class PessoaFoundResponse  extends Response<Pessoa>{

	public PessoaFoundResponse(PessoaResponse result) {
		super("pessoat-found", "", HttpStatus.OK, result);
	}

}
