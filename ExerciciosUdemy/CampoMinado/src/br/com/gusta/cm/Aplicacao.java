package br.com.gusta.cm;

import br.com.gusta.cm.modelo.Tabuleiro;
import br.com.gusta.cm.visao.TabuleiroConsole;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);
		
		
	}//main
	
}
