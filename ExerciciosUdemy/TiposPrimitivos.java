package exercicios;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//Informa��es do funcionario
		
		//Tipos num�ricos inteiros
		byte anosDeEmpresa = 14;
		short numeroDeVoos = 359;
		int idFuncionario = 40212;
		long pontosAcumulados = 3_128_124_233L;
		
		//Tipos num�ricos reais
		float salario = 17_241.45F;
		double totalDeVendas = 2_358_134_236.45;
		
		//Tipo caractere
		char status = 'A'; //ativo
		
		//Tipo booleano
		boolean estaDeFerias = true; //false, ta trabalhando
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Quantas vezes ele viajou at� o momento
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / totalDeVendas);
		System.out.println(idFuncionario + "Salario: " + salario);
		System.out.println("F�rias?" + estaDeFerias);
		System.out.println("Status" + status);
	}	
}
