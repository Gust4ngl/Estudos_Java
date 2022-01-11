package oo.heran�a.desafio;

public class Carro {
	private int velocidadeAtual;
	private final int VELOCIDADE_MAXIMA;
	private int delta = 5;

	/*
	 * private vai deixar com que somente os atributos ou metodos da mesma classe,
	 * que no caso � carro usem esses atributos privados.
	 */

	Carro(int velocidademax) {
		this.VELOCIDADE_MAXIMA = velocidademax;
	}

	public void acelerar() {
		if (velocidadeAtual + delta < VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += delta;
		}
	}// void acelerar

	public void frear() {

		if (this.velocidadeAtual == 0) {
			System.out.println("N�o foi possivel frear pois o carro ja esta parado!");
		} else {
			velocidadeAtual -= delta;
		}

	}// void frear

	public String toString() {
		return "A velocidade atual do carro �: " + velocidadeAtual + " Km/h";
	}

	/*
	 * O public podera ser usado nao somente dentro da mesma classe, quanto do mesmo
	 * pacote e ate mesmo em outros pacotes.
	 */

	void alterarDelta(int delta) {
		this.delta = delta;
	}

	/*
	 * Quando n�o � definido um nivel de acesso, por padr�o o java coloca protected
	 * (default) os unicos que podem acessar esse metodo seria somente oque estiver
	 * dentro do mesmo pacote, ou atrav�s de heran�a.
	 */

}
