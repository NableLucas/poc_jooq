package br.com.lnable.service;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PessoaService {

	@Autowired
	public DSLContext dsl;
	
	public void create() {
	
	}
}
