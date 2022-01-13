package lambdas;

public class CalculadoraTeste2 {

	public static void main(String[] args) {
		Calculo calc = (a, b) -> {return a + b; };
		System.out.println(calc.executarCalculo(5, 2));
		
		calc =  (a, b) -> {return a * b; };
		System.out.println(calc.executarCalculo(5, 2));
	}

}
