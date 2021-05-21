package com.compasso.response;

import org.springframework.http.HttpStatus;

public class PessoaNotFoundResponse extends Response<Void> {
    public PessoaNotFoundResponse(String message) {
        super("pessoa-not-found", message, HttpStatus.NOT_FOUND, null);
    }
}