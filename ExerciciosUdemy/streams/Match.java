package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Lui", 9.5);
		Aluno a2 = new Aluno("Dan", 7.6);
		Aluno a3 = new Aluno("Gab", 5.4);
		Aluno a4 = new Aluno("Mir", 7.8);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Predicate<Aluno> reprovado = aprovado.negate();
		
		System.out.println(alunos.stream().allMatch(aprovado));
		//todos foram aprovados? ^^^
		System.out.println(alunos.stream().anyMatch(aprovado));
		//alguém foi aprovado? ^^^
		System.out.println(alunos.stream().noneMatch(reprovado));
		//todos foram reprovados? ^^^
		
	}
	//Da mesma forma que depois de usar o reduce em stream não é possível mais usar
	//outras funções como o map e o filter, a mesma coisa acontece com o match
}
