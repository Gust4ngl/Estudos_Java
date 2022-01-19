package testes.calculadoraSimples;

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Calculadora {

	public static void main(String[] args) {
				
		double num1 = 0, num2 = 0;
		int op = 0;
	
		Scanner ler = new Scanner(System.in);

		while (op != 99) {
			System.out.println("1 - somar 2 - subtrair 3 - multiplicar 4 - dividir");
			op = ler.nextInt();

			switch (op) {
			case 1:
				System.out.println("Digite um número");
				num1 = ler.nextDouble();
				System.out.println("Digite um número");
				num2 = ler.nextDouble();
				BinaryOperator<Double> soma = (a, b) -> {return a + b;};
				System.out.println(soma.apply(num1, num2));
				break;
			case 2:
				System.out.println("Digite um número");
				num1 = ler.nextDouble();
				System.out.println("Digite um número");
				num2 = ler.nextDouble();
				BinaryOperator<Double> subtracao = (a, b) -> {return a - b;};
				System.out.println(subtracao.apply(num1, num2));
				break;
			case 3:
				System.out.println("Digite um número");
				num1 = ler.nextDouble();
				System.out.println("Digite um número");
				num2 = ler.nextDouble();
				BinaryOperator<Double> multiplicar = (a, b) -> {return a * b;};
				System.out.println(multiplicar.apply(num1, num2));
				break;
			case 4:
				System.out.println("Digite um número");
				num1 = ler.nextDouble();
				System.out.println("Digite um número");
				num2 = ler.nextDouble();
				BinaryOperator<Double> dividir = (a, b) -> {return a / b;};
				System.out.println(dividir.apply(num1, num2));
				break;
			default:
				System.out.println("Digite uma opção valida");
				break;
			}
		}
	}
}
