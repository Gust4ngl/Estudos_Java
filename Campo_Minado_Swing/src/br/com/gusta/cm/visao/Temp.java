package br.com.gusta.cm.visao;

import br.com.gusta.cm.modelo.Tabuleiro;

public class Temp {

	public static void main(String[] args) {
		
		Tabuleiro tab = new Tabuleiro(3, 3, 9);
		tab.alternarMarcacao(0, 0);
		tab.alternarMarcacao(0, 1);
		tab.alternarMarcacao(0, 2);
		tab.alternarMarcacao(1, 0);
		tab.alternarMarcacao(1, 1);
		tab.alternarMarcacao(1, 2);
		tab.alternarMarcacao(2, 0);
		tab.alternarMarcacao(2, 1);
		tab.alternarMarcacao(2, 2);
	}
	
}
