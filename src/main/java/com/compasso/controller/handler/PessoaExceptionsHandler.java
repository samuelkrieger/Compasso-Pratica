package com.compasso.controller.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.compasso.error.BadPessoaException;
import com.compasso.error.PessoaNotFoundException;
import com.compasso.response.PessoaErrorResponse;
import com.compasso.response.PessoaNotFoundResponse;

@RestControllerAdvice
public class PessoaExceptionsHandler {

    @ExceptionHandler(BadPessoaException.class)
    public ResponseEntity<PessoaErrorResponse> handleBadRequest(BadPessoaException ex) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(new PessoaErrorResponse(ex.getMessage()));
    }

    @ExceptionHandler(PessoaNotFoundException.class)
    public ResponseEntity<PessoaNotFoundResponse> handleNotFound(PessoaNotFoundException ex) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new PessoaNotFoundResponse(ex.getMessage()));
    }

}