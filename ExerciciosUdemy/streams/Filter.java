package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Lui", 9.5);
		Aluno a2 = new Aluno("Dan", 7.6);
		Aluno a3 = new Aluno("Gab", 5.4);
		Aluno a4 = new Aluno("Mir", 7.8);
		Aluno a5 = new Aluno("Rud", 10.0);
		Aluno a6 = new Aluno("Eri", 5.1);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, String> saudacoes = a -> "Parabéns " + 
		a.nome + " você foi aprovado!!!";
		
		alunos.stream()
			.filter(aprovado)
			.map(saudacoes)
			.forEach(System.out::println);
	}

}
