package com.compasso.service.mapper;

import org.springframework.stereotype.Component;

import com.compasso.model.entity.Pessoa;
import com.compasso.model.response.PessoaResponse;
import com.compasso.service.Mapper;

@Component
public class PessoaResponseMapper implements Mapper<Pessoa,PessoaResponse> {

	@Override
	public PessoaResponse map(Pessoa input) {
		if(input==null){
			return null;
		}
		PessoaResponse pessoa=new PessoaResponse();
		pessoa.setNome(input.getNome());
		pessoa.setCpf(input.getCpf());
		return pessoa;
	}

}
