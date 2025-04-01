package br.com.escola;

public class Diciplina {
	
	public String nome;
	private Professor professor;

	public Diciplina(String nome, Professor professor) {
		super();
		this.nome = nome;
		this.professor = professor;
	}

	public void ministrar() {
		System.out.println("Professor " + professor.nome + "ministrando aula de" +nome);
	}

}
