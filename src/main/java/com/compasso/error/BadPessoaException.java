package com.compasso.error;

public class BadPessoaException extends BadRequestException {
    public BadPessoaException(String Name) {
        super(String.format("invalid pessoa for name=%s", Name));
    }
}