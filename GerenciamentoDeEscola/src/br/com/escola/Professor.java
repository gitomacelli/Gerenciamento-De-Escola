package br.com.escola;

public class Professor extends Pessoa {
	
	private double salario;

	public Professor(String nome, int idade, double salario) {
		super(nome, idade);
		this.salario = salario;
	
	}
	public void darAula() {
		System.out.println("Professor "+ nome +" dando aula");
	}
	

}
