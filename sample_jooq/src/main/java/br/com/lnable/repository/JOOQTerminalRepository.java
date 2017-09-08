package br.com.lnable.repository;

import java.util.List;

import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import br.com.lnable.model.Terminal;

@Repository
public class JOOQTerminalRepository implements TerminalRepository {

	private final DSLContext jooq;
	
	public JOOQTerminalRepository(DSLContext jooq) {
		this.jooq = jooq;
	}

	public Terminal add(Terminal terminalEntry) {
		// TODO Auto-generated method stub
		return null;
	}

	public Terminal delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Terminal> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Terminal findById() {
		// TODO Auto-generated method stub
		return null;
	}

}
