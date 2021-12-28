package desafioModuloClassesMetodos;

public class Pessoa {
	String nome;
	double peso;
	
	Pessoa(String nome,double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	
	void comer(Comida comida) {
		peso += comida.pesoComida;
	}
	
	String dialogo() {
		return "Meu nome �: " + nome + " e meu peso � de: " + peso;  
	}
}
