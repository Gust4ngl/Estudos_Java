package br.com.gusta.cm.visao;

import javax.swing.JFrame;

import br.com.gusta.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame {

	public TelaPrincipal() {
		
		Tabuleiro tabuleiro = new Tabuleiro(9, 9, 5);
		add(new PainelTabuleiro(tabuleiro));
		
		setTitle("Campo Minado");
		setSize(690, 430);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		
	}//construtor
	
	public static void main(String[] args) {
		
		new TelaPrincipal();
		
	}//main
	
}//class
