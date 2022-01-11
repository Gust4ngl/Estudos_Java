package oo.polimorfismo;

public class Jantar {
	
	public static void main(String[] args) {
		Pessoa convidado = new Pessoa(64.29);
		Macarrao macarrao = new Macarrao(0.2);
		Strogonoff strogonoff = new Strogonoff(0.18);
		Brigadeiro brigadeiro = new Brigadeiro(0.15);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(brigadeiro);
		convidado.comer(macarrao);
		convidado.comer(strogonoff);
		
		System.out.println(convidado.getPeso());
		
		
	}
	
}
