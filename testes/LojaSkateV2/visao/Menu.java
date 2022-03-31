package visao;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JPanel;

import modelo.LojaSkate;

@SuppressWarnings("serial")
public class Menu extends JPanel implements ActionListener {

	private final Color COR_CINZA_ESCURO = new Color(46, 46, 46);

	public Menu() {

		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();

		setLayout(layout);

		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.BOTH;

		c.gridwidth = 2;
		adicionarBotao("Adicionar", COR_CINZA_ESCURO, c, 0, 0);
		adicionarBotao("Consultar", COR_CINZA_ESCURO, c, 0, 1);
		adicionarBotao("Alterar", COR_CINZA_ESCURO, c, 0, 2);
		adicionarBotao("Vender", COR_CINZA_ESCURO, c, 0, 3);

	}

	private void adicionarBotao(String string, Color cor, GridBagConstraints c, int x, int y) {

		c.gridx = x;
		c.gridy = y;
		Botao botao = new Botao(string, cor);
		botao.addActionListener(this);
		add(botao, c);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton botao = (JButton) e.getSource();
		try {
			LojaSkate.getInstancia().processarFuncao(botao.getText());
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
