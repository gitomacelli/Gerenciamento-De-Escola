package br.com.escola.main;

import br.com.escola.Aluno;
import br.com.escola.Diciplina;
import br.com.escola.Professor;
import br.com.escola.Turma;

public class Main {

	public static void main(String[] args) {
		
		Aluno objAluno1 = new Aluno("Isabela", 26, 12546);
		objAluno1.estudando();
		
		Professor objProfessor1 = new Professor("Ary", 42, 12.302);
		objProfessor1.darAula();
		
		Diciplina objMateria = new Diciplina("Historia", objProfessor1);
		objMateria.ministrar();
		
		Turma objTurma1 = new Turma(40, "Taarde", objMateria);
		objTurma1.exibirInformacoes();

	}

}
