package br.com.lnable.model;

import java.sql.Timestamp;

public class Pessoa {

	private Long id;
	private String nome;
	private String email;
	private String telefone;
	private Timestamp dtCriacao;


	public Pessoa() {
		super();
	}
	
	public Pessoa(String nome, String email, String telefone, Timestamp dtCriacao) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.dtCriacao = dtCriacao;
	}

	public Pessoa(Long id, String nome, String email, String telefone, Timestamp dtCriacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.dtCriacao = dtCriacao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getDtCriacao() {
		return dtCriacao;
	}

	public void setDtCriacao(Timestamp dtCriacao) {
		this.dtCriacao = dtCriacao;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/*
	 * CREATE TABLE `poc-jooq`.`Usuario` ( `id` INT NOT NULL AUTO_INCREMENT, `nome`
	 * VARCHAR(45) NOT NULL, `email` VARCHAR(45) DEFAULT NULL, `telefone`
	 * VARCHAR(15) DEFAULT NULL, `dt-criacao` datetime DEFAULT NULL,
	 * 
	 * PRIMARY KEY (`id`));
	 */

}

