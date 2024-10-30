package br.com.msilva.test;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

import br.com.msilva.Pessoa;



public class TestePessoa {

	
	@Test
	public void testeGeneroFeminino() {
		Pessoa testePessoa = new Pessoa();
		testePessoa.setNome("Sarah");
		testePessoa.setGenero("Feminino");
		
		Assert.assertEquals("Sarah", testePessoa.getNome());
		Assert.assertEquals("Feminino", testePessoa.getGenero());
	}

}
