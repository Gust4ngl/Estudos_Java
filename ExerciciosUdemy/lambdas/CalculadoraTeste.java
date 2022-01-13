package lambdas;

public class CalculadoraTeste {

	public static void main(String[] args) {
		Calculo calc = new Multiplicar();
		System.out.println(calc.executarCalculo(5, 2));
		
		//Mudando a instância de calc 
		
		calc = new Soma();
		System.out.println(calc.executarCalculo(5, 2));
	}

}
