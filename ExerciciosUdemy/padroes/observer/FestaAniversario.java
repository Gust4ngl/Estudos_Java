package padroes.observer;

public class FestaAniversario {

	public static void main(String[] args) {
		 Namorada namorada = new Namorada();
		 Porteiro porteiro = new Porteiro();
		 
		 porteiro.registrar(namorada);
		 
		 porteiro.registrar(e -> {
			 System.out.println("Surpresa via lambda!");});
		 porteiro.monitorar();
	}//main
	
}//class
