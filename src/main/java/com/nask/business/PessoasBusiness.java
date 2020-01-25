package com.nask.business;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nask.model.Pessoas;
import com.nask.repository.PessoasInterface;

@Service
public class PessoasBusiness {

	private PessoasInterface pessoaRep;
	
	@Autowired
	public PessoasBusiness(PessoasInterface pessoaRep) {
		
		this.pessoaRep = pessoaRep;
		
	}
	
	
	
	public Optional<Pessoas> retrievePessoasById(Integer id) {
		
		return this.pessoaRep.findById(id);
		
	}
	
	public Pessoas retrievePessoasByLogin(String login) {
		
		return this.pessoaRep.findByLogin(login);
		
	}
	
	
}
