package exercicios;

import java.util.Scanner;

public class ConversaoDeTemperaturaParte1 {

	public static void main(String[] args) {
		int fahrenheit = 75;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual a temperatura (em Fahrenheit) que está em sua cidade?");
		fahrenheit = ler.nextInt();
		int celsius = (fahrenheit - 32) * 5/9;
		System.out.printf("A temperatura Fahrenheit de %d convertida em Celsius é: %f", fahrenheit, celsius);
	}

}
