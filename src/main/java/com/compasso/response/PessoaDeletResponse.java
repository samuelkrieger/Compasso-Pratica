package com.compasso.response;

import org.springframework.http.HttpStatus;

import com.compasso.model.entity.Pessoa;
import com.compasso.model.request.PessoaRequest;

public class PessoaDeletResponse extends Response<Pessoa>{

	public PessoaDeletResponse(PessoaRequest result) {
		super("pessoa-deleted", "", HttpStatus.OK, result);
		
	}

}
