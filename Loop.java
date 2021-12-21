package testes;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		String nome = null;
		int num = 0;
		int op = 0;
		int resposta = 0;

		Scanner ler = new Scanner(System.in);

		/*
		 * System.out.println("Digite qualquer coisa"); nome = ler.next();
		 * System.out.println("Quantas vezes voce quer que mostre oque voce digitou?");
		 * op = ler.nextInt();
		 * 
		 * for (int i = 0; i < op; i++) { System.out.println(nome); }
		 */
		while (resposta != 99) {

			System.out.println("digite um numero");
			num = ler.nextInt();
			System.out.println("Até qual numero voce quer ir?");
			op = ler.nextInt();

			if (num > op) {
				for (int i = num; i >= op; i--) {
					System.out.println(num);
					num--;
				} // for
			} // if
			else if (num < op) {
				for (int i = num; i <= op; i++) {
					System.out.println(num);
					num++;
				} // for
			} // else
			else {
				for (int i = num; i <= op; i++) {
					System.out.println("voce chegou ao seu destino");
				} // for
			} // else
			System.out.println("Digite qualquer numero para repetir o algoritimo ou 99 para sair");
			resposta = ler.nextInt();
		} // while

	}// psvm

}// public class
