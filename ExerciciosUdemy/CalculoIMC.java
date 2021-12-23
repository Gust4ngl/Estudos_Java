package exercicios;

import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite seu peso:");
		double peso = ler.nextDouble();
		System.out.println("Digite sua altura:");
		double altura = ler.nextDouble();
		
		double imc = peso / Math.pow(altura, 2);
		
		System.out.printf("Seu imc é de %f", imc);
	}

}
