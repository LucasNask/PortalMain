package com.nask.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nask.business.PessoasBusiness;
import com.nask.model.Pessoas;
import com.nask.repository.PessoasInterface;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@Api(value="API REST Pessoas")
@RestController
@RequestMapping(value = "/api")
public class PessoasController {
	
	public PessoasBusiness pessoasBusiness;
	
	
	@Autowired
	public PessoasController(PessoasBusiness pessoasBusiness) {
		
		this.pessoasBusiness = pessoasBusiness;
		
	}

	@ApiOperation(value="Retorna um obj Pessoas")
	@GetMapping(value = "/retrievePessoaById/{id}")
	public Optional<Pessoas> retrievePessoas(@PathVariable(value = "id") Integer id) {
		return this.pessoasBusiness.retrievePessoasById(id);
		
	}
	
	
	@GetMapping(value = "/retrievePessoaByLogin/{login}")
	public Pessoas retrievePessoasLogin(@PathVariable(value = "login") String login) {
		
		return this.pessoasBusiness.retrievePessoasByLogin(login);
		
	}
	
	
	
}
