package com.compasso.service;

import java.util.Optional;

import com.compasso.model.request.PessoaRequest;
import com.compasso.model.response.PessoaResponse;


public interface PessoaService {

		PessoaResponse created(PessoaRequest request);
		
		Optional<PessoaResponse>  findById(final Long id);
}
