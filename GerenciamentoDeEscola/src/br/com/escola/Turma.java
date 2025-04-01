package br.com.escola;

public class Turma {
	
	private int qntAlunos;
	private String periodo;
	private Diciplina diciplina;
	
	public Turma(int qntAlunos, String periodo, Diciplina diciplina) {
		super();
		this.qntAlunos = qntAlunos;
		this.periodo = periodo;
		this.diciplina = diciplina;
	}
	public void exibirInformacoes() {
		System.out.println("A turma esta tendo aula da diciplina " + diciplina.nome);	
	}
	

}
