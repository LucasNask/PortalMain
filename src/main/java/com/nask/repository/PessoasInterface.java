package com.nask.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nask.model.Pessoas;

public interface PessoasInterface extends JpaRepository<Pessoas, Integer>{

	Pessoas findById (int id);
	
	Pessoas findByLogin (String login);
	
}
