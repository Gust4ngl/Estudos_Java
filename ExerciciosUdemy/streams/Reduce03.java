package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce03 {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Lui", 9.5);
		Aluno a2 = new Aluno("Dan", 7.6);
		Aluno a3 = new Aluno("Gab", 5.4);
		Aluno a4 = new Aluno("Mir", 7.8);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		//Esse predicate de aluno vai pegar a nota de um aluno que seria "a" somente se ela for maior ou igual a 7  
		Function<Aluno, Double> apenasNota = a -> a.nota; 
		//A function vai fazer quase a mesma coisa que o predicate acima, por�m vair ser usado para outra coisa
		BiFunction<Media, Double, Media> calcularMedia = (media, nota) -> media.add(nota);
		//BiFunction vai fazer o seguinte, ela pega um obj do tipo m�dia, e um Double(wrapper) e retornar uma media, nesse caso a BiFuntion vai
		//pegar uma nota e adicionar ao obj de m�dia
		BinaryOperator<Media> combinarMedia = (m1, m2) -> Media.combinar(m1, m2); 
		//Esse BinaryOperator vai combinar as duas medias, com um metodo dentro da pr�pria classe
		
		Media media = alunos.stream()
						.filter(aprovado)
						//vai filtrar e pegar apenas as notas dos alunos que tiraram 7 ou mais
						.map(apenasNota)
						//vai "criar" um novo array para armazenar somente as notas dos alunos aprovados 
						.reduce(new Media(), calcularMedia, combinarMedia);
						//aqui foi criada um novo obj da classe media que seria a "Identidade" que seria o valor inicial da opera��o de redu��o
						//logo depois tem o acumulador que seria calcular media, como o pr�prio nome j� diz ele vai calcular a m�dia
						//e por ultimo o respons�vel por juntar tudo que seria o combinarMedia
		System.out.println("A m�dia dos alunos aprovados � de: " + media.getValor());
	}
	
}
