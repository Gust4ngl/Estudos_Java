package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce02 {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Lui", 9.5);
		Aluno a2 = new Aluno("Dan", 7.6);
		Aluno a3 = new Aluno("Gab", 5.4);
		Aluno a4 = new Aluno("Mir", 7.8);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, Double> apenasNota = a -> a.nota; 
		BinaryOperator<Double> soma = (a, b) -> a + b;
		
		alunos.parallelStream()
			.filter(aprovado)
			.map(apenasNota)
			.reduce(soma)
			.ifPresent(System.out::println);
	}
	
}
