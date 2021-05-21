package com.compasso.response;

import org.springframework.http.HttpStatus;

import com.compasso.model.request.PessoaRequest;

public abstract class Response<T> {
    private final String reason;
    private final String message;
    private final HttpStatus status;
    private final PessoaRequest result;

    public Response(final String reason, final String message, final HttpStatus status, final PessoaRequest created) {
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

    public PessoaRequest getResult() {
        return result;
    }
}