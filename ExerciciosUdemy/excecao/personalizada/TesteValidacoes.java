package excecao.personalizada;

import excecao.Aluno;

public class TesteValidacoes {

	public static void main(String[] args) {
		
		try {
			Aluno a1 = new Aluno("gu", 10);
			Validar.aluno(a1);
			Validar.aluno(a1);
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		}catch (NumeroForaIntervaloException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}//try, catch
		
		System.out.println("Fim :)");
		
	}//psvm
	
}//class TesteValidações
