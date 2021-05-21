package com.compasso.response;

import org.springframework.http.HttpStatus;

public class PessoaErrorResponse extends Response<Void> {
    public PessoaErrorResponse(String message) {
        super("pessoa-error", message, HttpStatus.BAD_REQUEST, null);
    } 

}
