package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		Function<Integer, String> parOuImpar = num -> num % 2 == 0 ? "Par" : "Ímpar";
		/*
		 * Oque function vai fazer? Primeiro tem que definir os parametros de entrada e
		 * os de saida(return) que nesse caso seriam Integer(wrapper) e String,logo em
		 * seguida a lambda de num vai verificar se no final o numero é igual a zero, e
		 * retornar par ou impar dependendo do resultado
		 */

		System.out.println(parOuImpar.apply(52));

		Function<String, String> Resultado = valor -> "O resultado é: " + valor;

		String resultadoFinal = parOuImpar.andThen(Resultado).apply(52);
		/*
		 * andThen vai chamar a função parOuImpar e logo em seguida vai usar o apply que
		 * no caso seria 52 e logo em seguida ele ira chamar a função Resultado( como a
		 * função parOuimpar recebe um integer e retorna uma String, logo em seguida a
		 * função Resultado pegaria a String que parOuImpar retornou e usaria como
		 * parametro de entrada para a função resultado, e a mesma retornaria outra
		 * string
		 */
		System.out.println(resultadoFinal);
	}
}
