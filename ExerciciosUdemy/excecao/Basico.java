package excecao;

public class Basico {

	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		try {
			imprimirALuno(a1);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro na hora de "
					+ "exibir o nome do aluno");
		}//try, catch imprimirAluno(a1)
		
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Ocorreu um erro: " + e.getMessage());	//getMessage exibe o tipo de erro que ocorreu
		}//try, catch
		
		System.out.println("Fim.");
		
	}//psvm
	
	public static void imprimirALuno (Aluno aluno) {
		System.out.println(aluno.nome);
	}//método imprimir aluno
	
}//class basico
