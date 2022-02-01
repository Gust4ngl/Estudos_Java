package padroes.observer;

import java.util.Date;

public class EventoChegadaAniversariante {
	
	private final Date momento;

	public EventoChegadaAniversariante(Date momento) {
		super();
		this.momento = momento;
	}//construtor

	public Date getMomento() {
		return momento;
	}//get
	
}//class
