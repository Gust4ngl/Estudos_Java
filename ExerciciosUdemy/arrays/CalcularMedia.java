package arrays;

import java.util.Scanner;

public class CalcularMedia {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite aqui quantas notas você quer adicionar:");
		int op = ler.nextInt();
		double[] notas = new double[op];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota " + (i + 1));
			notas[i] = ler.nextDouble();
			}
		
		double media = 0;
		for(double nota: notas) {
		media += nota;	
		}
		System.out.println("A média é: " + media / op);
	}

}
