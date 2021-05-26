package com.compasso.response;

import org.springframework.http.HttpStatus;

import com.compasso.model.entity.Pessoa;
import com.compasso.model.response.PessoaResponse;

public class PessoaDeletResponse extends Response<Pessoa>{

	public PessoaDeletResponse(PessoaResponse result) {
		super("pessoa-deleted", "", HttpStatus.OK, result);
		
	}

}
