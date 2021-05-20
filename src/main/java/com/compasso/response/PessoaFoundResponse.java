package com.compasso.response;

import org.springframework.http.HttpStatus;

import com.compasso.domain.Pessoa;

public class PessoaFoundResponse  extends Response<Pessoa>{

	public PessoaFoundResponse(Pessoa result) {
		super("pessoat-found", "", HttpStatus.OK, result);
	}

}
