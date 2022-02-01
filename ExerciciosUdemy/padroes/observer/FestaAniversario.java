package padroes.observer;

public class FestaAniversario {

	public static void main(String[] args) {
		 Namorada namorada = new Namorada();
		 Porteiro porteiro = new Porteiro();
		 
		 porteiro.registrar(namorada);
		 porteiro.monitorar();
	}
	
}
