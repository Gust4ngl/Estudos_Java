package botaoInterativo;

import java.awt.Color;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.event.MouseInputListener;

@SuppressWarnings("serial")
public class Botao extends JButton implements MouseInputListener{
	
	final Color preto = new Color(0, 0, 0);
	
	public Botao() {
		setBackground(preto);
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		addMouseListener(this);
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		setBackground(Color.WHITE);
		setText("Entrou!");
	}
	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getButton() == 1) {
			setBackground(Color.GRAY);
			setText("Clicou!");
		} else if (e.getButton() == 3) {
			setBackground(Color.PINK);
		}
	}
	@Override
	public void mouseExited(MouseEvent e) {
		setBackground(Color.BLACK);
		setText("Saiu :(");		
	}
	public void mouseClicked(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseDragged(MouseEvent e) {}
	public void mouseMoved(MouseEvent e) {}
	
}
