package oo.polimorfismo;

public class Pessoa {
	
	private double peso;
	
	Pessoa(double peso){
		this.peso = peso;
	}
	
	public void comer(Comida comida) {
		this.peso += comida.getPeso();
		}
	
	public double getPeso() {
		return peso;
	}
	
/*	Metodos usando polimorfismo estatico
	
	public void comer(Macarrao macarrao) {
	this.peso += macarrao.getPeso();
	}
	public void comer(Strogonoff strogonoff) {
		this.peso += strogonoff.getPeso();
	}
	public void comer(Brigadeiro brigadeiro) {
		this.peso += brigadeiro.getPeso();
	}
	
*/
}
