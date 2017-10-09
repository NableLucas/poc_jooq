package br.com.lnable.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
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
	public void findAll() {
		List<Pessoa> allPessoas = p.getAllPessoas();
		System.out.println(allPessoas.size());
	}

}
