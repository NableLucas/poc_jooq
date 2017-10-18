package br.com.lnable.service;

import static org.junit.Assert.assertEquals;

import java.sql.Timestamp;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import br.com.lnable.App;
import br.com.lnable.model.Pessoa;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class)
@WebAppConfiguration
public class PessoaServiceTest {
	@Autowired
	private PessoaService p;
	
	@Test
	@Order(1)
	public void findAll() {
		List<Pessoa> allPessoas = p.getAllPessoas();
		assertEquals(1, allPessoas.size());
	}
	
	@Test
	public void createPessoa() {
		Pessoa pessoa = newPessoa();
		Pessoa pessoaCreated = p.createPessoa(pessoa);
		Pessoa pessoaFinded = p.getPessoa(pessoaCreated.getId());
		assertEquals(pessoaCreated.getId(), pessoaFinded.getId());
		
	}
	
	private Pessoa newPessoa() {
		Pessoa p = new Pessoa("Pessoa teste", "teste@teste.com", "22228888", new Timestamp(System.currentTimeMillis()));
		return p;
	}
	
	

}
