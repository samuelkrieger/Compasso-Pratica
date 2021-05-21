package com.compasso.error;

public class BadPessoaException extends BadRequestException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BadPessoaException(String Name) {
        super(String.format("invalid pessoa for name=%s", Name));
    }
}