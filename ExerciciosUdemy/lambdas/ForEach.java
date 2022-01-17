package lambdas;

import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		List<String> nomes = Arrays.asList("Ana", "Bia", "Lia", "Gui");

		System.out.println("Forma tradicional");
		for (String nome : nomes) {
			System.out.println(nome);
		} // foreach

		System.out.println("\nLambda #01...");
		nomes.forEach((nome) -> {
			System.out.println(nome);
		});

		System.out.println("\nLambda #02...");
		nomes.forEach(nome -> imprimir(nome));

		System.out.println("\nMethod reference");
		nomes.forEach(System.out::println);

		System.out.println("\nMethod reference #02...");
		nomes.forEach(ForEach::imprimir);

	}// psvm

	static void imprimir(String nome) {
		System.out.println("o nome é " + nome);

	}// void imprimir

}// class
