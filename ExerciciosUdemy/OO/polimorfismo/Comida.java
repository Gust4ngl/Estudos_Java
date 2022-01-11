package oo.polimorfismo;

public class Comida {
	
	double peso;
	
	Comida(double peso) {
		setPeso(peso);
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
