package oo.heran�a.teste;

import oo.heran�a.desafio.Carro;
import oo.heran�a.desafio.Civic;
import oo.heran�a.desafio.Ferrari;

public class CarroTeste {
	public static void main(String[] args) {
		Carro civic = new Civic();

		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		System.out.println(civic);
		civic.frear();
		System.out.println(civic);

		System.out.println();

		Carro ferrari = new Ferrari();

		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		System.out.println(ferrari);
		ferrari.frear();
		System.out.println(ferrari);
	}
}
