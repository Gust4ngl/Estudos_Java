package br.com.gusta.cm.visao;

import java.awt.Color;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import javax.swing.event.MouseInputListener;

import br.com.gusta.cm.modelo.Campo;
import br.com.gusta.cm.modelo.CampoEvento;
import br.com.gusta.cm.modelo.CampoObservador;

@SuppressWarnings("serial")
public class BotaoCampo extends JButton 
implements CampoObservador, MouseInputListener{

	private final Color BG_PADRAO = new Color(184, 184, 184);
	private final Color BG_MARCAR = new Color(8, 179, 247);
	private final Color BG_EXPLODIR = new Color(189, 66, 68);
	private final Color TEXTO_VERDE = new Color(0, 100, 0);
	
	private Campo campo;
	
	public BotaoCampo(Campo campo) {
		this.campo = campo;
		setBackground(BG_PADRAO);
		setOpaque(true);
		setBorder(BorderFactory.createBevelBorder(0));
		
		addMouseListener(this);
		campo.registrarObservador(this);
	}
	
	@Override
	public void eventoOcorreu(Campo c, CampoEvento evento) {
		switch(evento) {
		case ABRIR:
			aplicarEstiloAbrir();
			break;
		case MARCAR:
			aplicarEstiloMarcar();
			break;
		case DESMARCAR:
			aplicarEstiloDesmarcar();
			break;
		case EXPLODIR	:
			aplicarEstiloExplodir();
			break;
		default:
			aplicarEstiloPadrao();
			break;
		}
		
		SwingUtilities.invokeLater(() -> {
			repaint();
			validate();
		});
	}

	private void aplicarEstiloPadrao() {
		setBackground(BG_PADRAO);
		setBorder(BorderFactory.createBevelBorder(0));
		setText("");
	}

	private void aplicarEstiloExplodir() {
		setBackground(BG_EXPLODIR);
		setForeground(Color.white);
		setText("X");
	}


	private void aplicarEstiloMarcar() {
		setBackground(BG_MARCAR);
		setForeground(Color.black);
		setText("M");
	}

	private void aplicarEstiloDesmarcar() {
		setBackground(BG_PADRAO);
		setText("");
	}
	
	private void aplicarEstiloAbrir() {

		setBorder(BorderFactory.createLineBorder(Color.gray));
		
		if(campo.isMinado()) {
			setBackground(BG_EXPLODIR);
			return;
		}
		
		setBackground(BG_PADRAO);
		
		switch(campo.minasNaVizinhanca()) {
		case 1:
			setForeground(TEXTO_VERDE);
			break;
		case 2:
			setForeground(Color.blue);
			break;
		case 3:
			setForeground(Color.yellow);
			break;
		case 4:
		case 5:
		case 6:
			setForeground(Color.red);
			break;
		default:
			setForeground(Color.pink);
		}//switch
		
		String valor = !campo.vizinhancaSegura() ? 
				campo.minasNaVizinhanca() + "" : "";
		
		setText(valor);
		
	}
	
	//Interface dos eventos do mouse


	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getButton() == 1) {
			campo.abrir();
			System.out.println("Esquerdo");
		}else {
			campo.alternarMarcacao();
		}
	}
	
	public void mouseClicked(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mouseDragged(MouseEvent e) {}
	public void mouseMoved(MouseEvent e) {}
	
	
}//class
