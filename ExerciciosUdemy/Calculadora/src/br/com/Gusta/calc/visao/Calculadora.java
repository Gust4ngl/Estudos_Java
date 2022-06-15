package br.com.Gusta.calc.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame{

	public Calculadora() {
		
		organizarLayout();
		
		setSize(232, 322);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}//construtor

	private void organizarLayout() {
		
		setLayout(new BorderLayout());
		
		Display display = new Display();
		display.setPreferredSize(new Dimension(233, 70));
		add(display, BorderLayout.NORTH);
		
		Teclado teclado = new Teclado();
		add(teclado, BorderLayout.CENTER);
		
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		
	}//main
	
}
