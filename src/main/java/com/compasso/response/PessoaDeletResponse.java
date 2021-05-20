package com.compasso.response;

import org.springframework.http.HttpStatus;

import com.compasso.domain.Pessoa;

public class PessoaDeletResponse extends Response<Pessoa>{

	public PessoaDeletResponse(Pessoa result) {
		super("pessoa-deleted", "", HttpStatus.OK, result);
		
	}

}
