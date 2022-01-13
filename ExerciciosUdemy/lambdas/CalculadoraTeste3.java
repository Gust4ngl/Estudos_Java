package lambdas;

import java.util.function.BinaryOperator;

public class CalculadoraTeste3 {

	public static void main(String[] args) {
		BinaryOperator<Double> calc = (a, b) -> {return a + b; };
		System.out.println(calc.apply(5.0, 2.0));
		
		calc = (a, b) -> {return a * b; };
		
	}

}
