package testes;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		String nome = null;
		int num1 = 0, num2 = 0, resultado = 0;
		int op = 0;
		
		Scanner ler = new Scanner(System.in);
		
		while (op != 99) {
			System.out.println("1 - somar 2 - subtrair 3 - multiplicar 4 - dividir");
			op = ler.nextInt();
			
			switch (op) {
				case 0:
					op = 99;
					break;
				case 1:
					System.out.println("Digite um numero: ");
					num1 = ler.nextInt();
					System.out.println("Digite outro numero");
					num2 = ler.nextInt();
					resultado = num1 + num2;
					System.out.println("O resultado é:" + resultado);
					break;
				case 2:
					System.out.println("Digite um numero: ");
					num1 = ler.nextInt();
					System.out.println("Digite outro numero");
					num2 = ler.nextInt();
					resultado = num1 - num2;
					System.out.println("O resultado é:" + resultado);
					break;
				case 3:
					System.out.println("Digite um numero: ");
					num1 = ler.nextInt();
					System.out.println("Digite outro numero");
					num2 = ler.nextInt();
					resultado = num1 * num2;
					System.out.println("O resultado é:" + resultado);
					break;
				case 4:
					System.out.println("Digite um numero: ");
					num1 = ler.nextInt();
					System.out.println("Digite outro numero");
					num2 = ler.nextInt();
					resultado = num1 / num2;
					System.out.println("O resultado é:" + resultado);
					break;
				default:
					System.out.println("Digite uma opção valida");
					break;
			}
		}
	}
}
