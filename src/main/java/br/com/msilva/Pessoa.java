package br.com.msilva;

import java.util.List;
import java.util.Scanner;

public class Pessoa {
	private String nome;
    private String genero;



    public Pessoa(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }


    public Pessoa() {
		// TODO Auto-generated constructor stub
	}


	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public static List<Pessoa> gerarPessoas(){
        Pessoa pessoa1 = new Pessoa("Maria","Feminino");       
        Pessoa pessoa2 = new Pessoa("Antonio","Masculino");       
        Pessoa pessoa3 = new Pessoa("Duda","Feminino");     
        Pessoa pessoa4 = new Pessoa("Fabio","Masculino");
        Pessoa pessoa5 = new Pessoa("Ana","Feminino"); 
        return List.of(pessoa1,pessoa2,pessoa3,pessoa4,pessoa5);
    }

	
}
