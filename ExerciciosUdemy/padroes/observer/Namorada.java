package padroes.observer;

public class Namorada implements ChegadaAniversarianteObservador{
	
	public void chegou(EventoChegadaAniversariante evento) {
		System.out.println("Avisar os convidados...");
		System.out.println("Apagar as luzes...");
		System.out.println("Esperar...");
		System.out.println("Surpresa!!!");
	}//método chegou
	
}//class
