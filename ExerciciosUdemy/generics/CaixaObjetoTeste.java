package generics;

public class CaixaObjetoTeste {

	public static void main(String[] args) {

		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3);// double (Primitivo) -> Double (wrapper)

		Double coisaA = (Double) caixaA.abrir();
		System.out.println(coisaA);

		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("Teste");// double (Primitivo) -> Double (wrapper)

		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);

	}// main

}// class
