package classe;

public class Data {
	int dia, mes, ano;
			
	Data(){
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	Data(int diaIncial, int mesInicial, int anoInicial){
		dia = diaIncial;
		mes = mesInicial;
		ano = anoInicial;
	}
	
	
	String obterDataformatada() {
		return String.format("Data: %d/%d/%d",dia, mes, ano);
	}
	
}
