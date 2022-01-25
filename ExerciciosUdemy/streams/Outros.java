package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Lui", 9.5);
		Aluno a2 = new Aluno("Dan", 7.6);
		Aluno a3 = new Aluno("Gab", 5.4);
		Aluno a4 = new Aluno("Mir", 7.8);
		Aluno a5 = new Aluno("Lui", 9.5);
		Aluno a6 = new Aluno("Dan", 7.6);
		Aluno a7 = new Aluno("Gab", 5.4);
		Aluno a8 = new Aluno("Mir", 7.8);
		
		List<Aluno> alunos =
				Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		System.out.println("distinct...");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/limit");
		alunos.stream()
			.distinct()
			.skip(2)
			.limit(2)
			.forEach(System.out::println);
		
		System.out.println("\nTakeWhile");
		alunos.stream()
			.distinct()
			.takeWhile(a -> a.nota >= 7)
			.forEach(System.out::println);

		
	}

}
