package visao;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class TelaPrincipal extends JFrame {

	public TelaPrincipal() {

		organizarLayout();

		setSize(232, 322);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}// construtor

	private void organizarLayout() {

		setLayout(new BorderLayout());

		Menu menu = new Menu();
		add(menu, BorderLayout.CENTER);
	}

	public static void main(String[] args) {

		new TelaPrincipal();

	}

}
