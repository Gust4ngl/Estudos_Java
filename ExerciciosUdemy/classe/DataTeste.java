package classe;

public class DataTeste {

	public static void main(String[] args) {
		Data diaAleatorio = new Data();
		
		diaAleatorio.dia = 05;
		diaAleatorio.mes = 12;
		diaAleatorio.ano = 2019;
		
		System.out.printf("Data: %d/%d/%d", diaAleatorio.dia, diaAleatorio.mes, diaAleatorio.ano);
		
		Data natal = new Data();
		natal.dia = 25;
		natal.mes = 12;
		natal.ano = 2021;
		
		System.out.printf("\nData: %d/%d/%d", natal.dia, natal.mes, natal.ano);
	}

}
