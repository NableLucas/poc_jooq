package br.com.lnable.service;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static br.com.lnable.jooq.domain.tables.Pessoa.PESSOA;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import br.com.lnable.jooq.domain.tables.records.PessoaRecord;
import br.com.lnable.model.Pessoa;

@Service
@Transactional
public class PessoaService {

	@Autowired
	public DSLContext dsl;

	public Pessoa createPessoa(Pessoa pessoa) {
		PessoaRecord pessoaRecord = dsl.insertInto(PESSOA).set(PESSOA.NOME, pessoa.getNome())
				.set(PESSOA.EMAIL, pessoa.getEmail())
				.set(PESSOA.TELEFONE, pessoa.getTelefone())
				.set(PESSOA.DT_CRIACAO, pessoa.getDtCriacao())
				.returning(PESSOA.ID)
				.fetchOne();
		
		pessoa.setId(pessoaRecord.getId().longValue());
		return pessoa;
	}
	
	public List<Pessoa> getAllPessoas(){
		List<Pessoa> pessoas = new ArrayList<>();
		Result<Record> result = dsl.select().from(PESSOA).fetch();
		for (Record record : result) {
			pessoas.add(getPessoaEntity(record));
		}
		return pessoas;
	}
	
	public Pessoa getPessoa(Long id) {
		Record result = dsl.select().from(PESSOA).where(PESSOA.ID.eq(id.intValue())).fetchOne();
		return getPessoaEntity(result);
	}

	private Pessoa getPessoaEntity(Record record) {
		Long id = record.getValue(PESSOA.ID, Long.class);
		String nome = record.getValue(PESSOA.NOME, String.class);
		String telefone = record.getValue(PESSOA.TELEFONE, String.class);
		String email = record.getValue(PESSOA.EMAIL, String.class);
		Timestamp dtCriacao = record.getValue(PESSOA.DT_CRIACAO, Timestamp.class);
		return new Pessoa(id, nome, email, telefone, dtCriacao);
	}
}
