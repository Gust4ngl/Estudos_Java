package br.com.gus4.app.calc;

import br.com.gus4.app.calc.interno.Operacoes;
import br.com.gust4.app.logging.Logger;

public class Calculadora {

	private Operacoes op = new Operacoes();

	public double soma(double... nums) {
		Logger.info("Somando...");
		return op.soma(nums);
	}
	
}
