package com.compasso.response;

import org.springframework.http.HttpStatus;

import com.compasso.model.entity.Pessoa;
import com.compasso.model.request.PessoaRequest;

public class PessoaFoundResponse  extends Response<Pessoa>{

	public PessoaFoundResponse(PessoaRequest result) {
		super("pessoat-found", "", HttpStatus.OK, result);
	}

}
