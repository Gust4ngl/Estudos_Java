package lambdas;

import java.util.function.Predicate;

public class Predicados {

	public static void main(String[] args) {

		Predicate<Produto> isCaro = prod -> prod.preco >= 899.99;

		Produto produto = new Produto("Celular", 2199.99, 0.15);
		System.out.println(isCaro.test(produto));

	}
}
