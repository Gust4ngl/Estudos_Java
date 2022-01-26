package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {

		Consumer<String> print = System.out::print;
		//Consumer<Integer> println = System.out::println;

		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
		langs.forEach(print);

		String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n" };
		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1, 4).forEach(print);
		/*
		 * vai printar a partir do primeiro numero digitado(que seria as posições em que
		 * os valores dentro do array estão
		 */

		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		System.out.println();
		outrasLangs.parallelStream().forEach(print);
		/*
		 * aqui em parallelStream a ordem que sera exibida vai ser diferente toda vez em
		 * que o algoritmo for executado, já que como o próprio nome diz, os processos
		 * serão paralelos
		 */
		
		//Stream.generate(() -> "a").forEach(print);
		//Stream.iterate(0, n -> n + 1).forEach(println);
	}

}
