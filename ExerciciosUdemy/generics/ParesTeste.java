package generics;

public class ParesTeste {

	public static void main(String[] args) {
		
		Pares<Integer, String> resultadoConcurso = new Pares<>();
		
		resultadoConcurso.add(1, "Maria");
		resultadoConcurso.add(2, "Carlos");
		resultadoConcurso.add(3, "Guilherme");
		resultadoConcurso.add(4, "João");
		resultadoConcurso.add(2, "Renata");

		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(4));
		System.out.println(resultadoConcurso.getValor(2));
		
	}//main
	
}//class
