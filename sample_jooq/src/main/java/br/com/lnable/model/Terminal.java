package br.com.lnable.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Terminal {

	@Id
	private Long id;
	
	private String serial;
	
	private String model;
	
}
