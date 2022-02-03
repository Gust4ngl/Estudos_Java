package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Teste");
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setSize(600, 200);
		janela.setLayout(new FlowLayout());
		janela.setLocationRelativeTo(null); //centraliza a janela

		JButton botao = new JButton("Clicar");
		janela.add(botao);
		
		botao.addActionListener(e -> {
			System.out.println("Clicou!");
		});
		
		janela.setVisible(true);
	}

}
