package com.compasso.error;

public class PessoaNotFoundException extends NotFoundException {
    public PessoaNotFoundException(Long id) {
        super(String.format("pessoa not found by id=%s", id));
    }
}