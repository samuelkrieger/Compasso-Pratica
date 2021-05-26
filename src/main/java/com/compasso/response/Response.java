package com.compasso.response;

import org.springframework.http.HttpStatus;

import com.compasso.model.response.PessoaResponse;

public abstract class Response<T> {
    private final String reason;
    private final String message;
    private final HttpStatus status;
    private final PessoaResponse result;

    public Response(final String reason, final String message, final HttpStatus status, final PessoaResponse created) {
        this.reason = reason;
        this.message = message;
        this.status = status;
        this.result = created;
    }

    public String getReason() {
        return reason;
    }

    public String getMessage() {
        return message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public PessoaResponse getResult() {
        return result;
    }
}