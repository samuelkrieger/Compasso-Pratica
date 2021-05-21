package com.compasso.service.mapper;

import org.springframework.stereotype.Component;

import com.compasso.model.entity.Pessoa;
import com.compasso.model.request.PessoaRequest;
import com.compasso.service.Mapper;

@Component
public class PessoaRequestMapper implements Mapper<PessoaRequest,Pessoa> {

	@Override
	public Pessoa map(PessoaRequest input) {
		if(input==null){
			return null;
		}
		Pessoa pessoa=new Pessoa();
		pessoa.setNome(input.getNome());
		pessoa.setCpf(input.getCpf());
		return pessoa;
	}
	

}
