package desafioModuloClassesMetodos;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("El macho", 98.75);
		Comida c1 = new Comida("Batatas Fritas", 0.200);
		
		System.out.println(p1.dialogo());
		p1.comer(c1);
		System.out.println(p1.dialogo());
	}

}
