package com.compasso.response;

import org.springframework.http.HttpStatus;

import com.compasso.model.entity.Pessoa;
import com.compasso.model.request.PessoaRequest;


public class PessoaCreatedResponse extends Response<Pessoa> {
    public PessoaCreatedResponse(PessoaRequest created) {
        super("Pessoa-created", "", HttpStatus.CREATED, created);
    } 

}
