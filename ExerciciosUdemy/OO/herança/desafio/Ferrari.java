package oo.herança.desafio;

public class Ferrari extends Carro {

	public Ferrari() {
		super(256);
		super.alterarDelta(15);
	}

	public Ferrari(int maxima, int delta) {
		super(maxima);
		super.alterarDelta(delta);
	}

//	@Override
//	void acelerar() {
//		velocidadeAtual = 15;
//	}// void acelerar
//
//	void frear() {
//		if (this.velocidadeAtual == 0) {
//			System.out.println("Não foi possivel frear pois o carro ja esta parado!");
//		} else {
//			velocidadeAtual -= 15;
//		}
//
//	}// void frear

}
