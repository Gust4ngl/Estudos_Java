package streams.desafioFilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Revenda {

	public static void main(String[] args) {

		Car c1 = new Car("Corsa rebaixado", 19.999, true);
		Car c2 = new Car("Mercedes", 199.999, false);
		Car c3 = new Car("Ferrari", 599.999, false);
		Car c4 = new Car("Pálio com aerofólio", 4.999, true);
		
		List<Car> carros = Arrays.asList(c1, c2, c3, c4);
		
		Predicate<Car> caro = v -> v.valor <= 20.000;
		Predicate<Car> luxo = l -> true;
		Function<Car, String> exibirCarrosLuxo = e -> "Os carros de luxo são: " + e.modelo;
		
		carros.stream()
			.filter(caro)
			.filter(luxo)
			.map(exibirCarrosLuxo)
			.forEach(System.out::println);
		
	}

}
