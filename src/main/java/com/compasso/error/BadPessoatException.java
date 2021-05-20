package com.compasso.error;

public class BadPessoatException extends BadRequestException {
    public BadPessoatException(String Name) {
        super(String.format("invalid pessoa for name=%s", Name));
    }
}