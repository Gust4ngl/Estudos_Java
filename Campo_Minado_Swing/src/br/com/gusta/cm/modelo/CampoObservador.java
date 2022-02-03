package br.com.gusta.cm.modelo;

@FunctionalInterface
public interface CampoObservador {

	public void eventoOcorreu(Campo c, CampoEvento evento);
	
}
