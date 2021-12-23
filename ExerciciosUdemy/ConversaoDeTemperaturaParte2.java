package exercicios;

import java.util.Scanner;

public class ConversaoDeTemperaturaParte2 {
	public static void main(String[] args) {
		int celsius = 0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite qual temperatura em celsius esta fazendo ai onde você está");
		celsius = ler.nextInt();
		int fahrenheit = (celsius * 9/5) + 32;
		System.out.printf("A temperatura de %d graus celsius em fahrenheit ficaria: %f", celsius, fahrenheit);
	}
}
