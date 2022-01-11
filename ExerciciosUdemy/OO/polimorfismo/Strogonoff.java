package oo.polimorfismo;

public class Strogonoff extends Comida{

	private double peso;
	
	Strogonoff(double peso) {
		super(peso);
	}//construtor peso

	public double getPeso() {
		return peso;
	}//getter peso

	public void setPeso(double peso) {

		if (peso >= 0) {
			this.peso = peso;
		} else {

		}
		
	}//setter peso
}
