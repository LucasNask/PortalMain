package com.nask.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nask.business.PessoasBusiness;
import com.nask.model.Pessoas;
import com.nask.repository.PessoasInterface;

@RestController
@RequestMapping(value = "/api")
public class PessoasController {
	
	public PessoasBusiness pessoasBusiness;
	
	@Autowired
	public PessoasInterface pessoasInteface;
	
//	@Autowired
//	public PessoasController(PessoasBusiness pessoasBusiness) {
//		
//		this.pessoasBusiness = pessoasBusiness;
//		
//	}

	
	@GetMapping(value = "/retrievePessoaById/{id}")
	public Optional<Pessoas> retrievePessoas(@PathVariable(value = "id") Integer id) {
		
		return this.pessoasInteface.findById(id);
		
	}
	
	
	@GetMapping(value = "/retrievePessoaByLogin/{login}")
	public Pessoas retrievePessoasLogin(@PathVariable(value = "login") String login) {
		
		return this.pessoasInteface.findByLogin(login);
		
	}
	
	@PostMapping(value = "/insertPessoa")
	public Pessoas insertPessoa(@RequestBody Pessoas pessoas) {
		
		return this.pessoasInteface.save(pessoas);
		
	}
	
	
	
}
