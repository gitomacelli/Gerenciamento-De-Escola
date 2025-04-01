package br.com.escola;

public class Aluno extends Pessoa{
	
	private int matricula;
	
	public Aluno(String nome, int idade, int matricula) {
		super(nome, idade);
		this.matricula = matricula;
	}

	public void estudando() {
		System.out.println("O aluno " + nome +" está estudando");
	}
	
	
}
