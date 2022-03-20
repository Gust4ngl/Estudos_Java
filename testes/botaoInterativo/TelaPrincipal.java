package botaoInterativo;

import java.awt.BorderLayout;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		TelaPrincipal tp = new TelaPrincipal();
	}
	
	public TelaPrincipal() {
		organizarLayout();
		setSize(232, 322);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void organizarLayout() {
		setLayout(new BorderLayout());
		Botao b = new Botao();
		add(b, BorderLayout.CENTER);
	}

}
