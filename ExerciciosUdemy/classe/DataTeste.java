package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data dataCalendario = new Data();
		System.out.println(dataCalendario.obterDataformatada());
		
		Data natal = new Data(25, 12, 2021);
		System.out.println(natal.obterDataformatada());
	}

}
