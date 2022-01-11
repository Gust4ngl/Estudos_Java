package oo.herança.teste;

import oo.herança.desafio.Carro;
import oo.herança.desafio.Civic;
import oo.herança.desafio.Ferrari;

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
