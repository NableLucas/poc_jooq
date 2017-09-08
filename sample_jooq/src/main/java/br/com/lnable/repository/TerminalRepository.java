package br.com.lnable.repository;

import java.util.List;

import br.com.lnable.model.Terminal;

public interface TerminalRepository {
	public Terminal add(Terminal terminalEntry);
	
	public Terminal delete(Long id);
	
	public List<Terminal> findAll();
	
	public Terminal findById();
	
}
