package br.com.Gusta.calc.visao;

import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Botao extends JButton {

	public Botao(String texto, Color cor) {
		setText(texto);
		setFont(new Font("courier", Font.PLAIN, 25));
		setOpaque(true);
		setBackground(cor);
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		setForeground(Color.WHITE);
	}
	
}
