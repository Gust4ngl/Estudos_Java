package excecao.personalizada;

import excecao.Aluno;

public class Validar {

	private Validar() {}
	
	public static void aluno (Aluno aluno) {
		
		if (aluno == null) {
			throw new IllegalArgumentException("O aluno está nulo");
		}//if
		
		if (aluno.nome == null || aluno.nome.trim().isEmpty()) {
			throw new StringVaziaException("Nome");
		}//if
		
		if (aluno.nota < 0 || aluno.nota > 10) {
			throw new NumeroForaIntervaloException("Nota");
		}
		
	}//psv aluno
	
}//class validar 
