package br.com.escola;

public class Pessoa {

	 public String nome;
	 private int idade;
	 
	 public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	 public void exibirInformacao() {
		 System.out.println("Exibindo informações");
	 }
}
