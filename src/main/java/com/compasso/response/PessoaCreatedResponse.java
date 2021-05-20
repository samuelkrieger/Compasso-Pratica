package com.compasso.response;

import org.springframework.http.HttpStatus;

import com.compasso.domain.Pessoa;

public class PessoaCreatedResponse extends Response<Pessoa> {
    public PessoaCreatedResponse(Pessoa result) {
        super("Pessoa-created", "", HttpStatus.CREATED, result);
    } 

}
