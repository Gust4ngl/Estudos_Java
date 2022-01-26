package excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {

		try {
			geraErro1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} // try, catch geraErro1

		geraErro2();

		try {
			geraErro3();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} // try, catch geraErro3

		System.out.println("Fim.");

	}// psvm

	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro #01");
	}// Exceção não cheacada ou não verificada ^^^

	static void geraErro2() {
		try {
			throw new Exception("Ocorreu um erro #02");
		} catch (Exception e) {
			System.out.println("Teste #02");
		} // try catch geraErro2
	}// Exceção cheacada ou verificada ^^^

	static void geraErro3() throws Exception {
		throw new Exception("Ocorreu um erro #03");
	}

}// class
