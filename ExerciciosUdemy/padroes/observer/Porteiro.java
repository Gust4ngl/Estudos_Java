package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

	private List<ChegadaAniversarianteObservador> observadores = new ArrayList<>();

	public void registrar(ChegadaAniversarianteObservador observador) {
		this.observadores.add(observador);
	}
	
	public void monitorar() {
		Scanner ler = new Scanner(System.in);
		
		String valor = "";
		
		
		while (!"sair".equalsIgnoreCase(valor)) {
			
			System.out.println("Anivesariante chegou?");
			valor = ler.nextLine();
			
			if("sim".equalsIgnoreCase(valor)) {
				//criar evento 
				EventoChegadaAniversariante evento = 
						new EventoChegadaAniversariante(new Date());
				//notificar os observers!!
				observadores.stream().forEach(o -> o.chegou(evento));
			}//if
			else {
				System.out.println("Alarme falso");
			}//else
			
		}//while
		
		ler.close();
		
	}//void monitorar

}//class
