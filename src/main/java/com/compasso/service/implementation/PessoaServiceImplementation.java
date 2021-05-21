package com.compasso.service.implementation;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.compasso.error.BadPessoaException;
import com.compasso.model.entity.Pessoa;
import com.compasso.model.repository.PessoaRepository;
import com.compasso.model.request.PessoaRequest;
import com.compasso.model.response.PessoaResponse;
import com.compasso.service.Mapper;
import com.compasso.service.PessoaService;


@Service
public class PessoaServiceImplementation  implements PessoaService{
	   private static final Logger log = LoggerFactory.getLogger(PessoaServiceImplementation.class);

	   @Autowired
	   private PessoaRepository repository;
	   
	  
	   @Autowired
	   private Mapper<PessoaRequest,Pessoa> requestmapper;
	   
	   @Autowired
	   private Mapper<Pessoa,PessoaResponse> responsemapper;
	  
	   
	   
	
	   @Override
	    public PessoaResponse created (final PessoaRequest request) {
			Pessoa pessoa= requestmapper.map(request);
	        try {
	        
	            return this.repository.saveAndFlush(pessoa).map((Pessoa input) -> responsemapper.map(input));
	        } catch (Exception ex) {
	            log.info("error trying to create new pessoa. {}", ex.getMessage());
	            throw new BadPessoaException(pessoa.getNome());}
	        }
	    

	    @Override
	    public Optional<PessoaResponse>  findById(final Long id) {
	    	return repository.findById(id).map(this.responsemapper::map);
	    }

}
