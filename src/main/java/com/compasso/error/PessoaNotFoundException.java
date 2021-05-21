package com.compasso.error;

public class PessoaNotFoundException extends NotFoundException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PessoaNotFoundException(Long id) {
        super(String.format("pessoa not found by id=%s", id));
    }
}