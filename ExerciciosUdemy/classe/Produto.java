package classe;

public class Produto {
	String nome;
	double valor;
	static double desconto = 0.50;
	
	Produto (String nomeInicial, double valorInicial){
		nome = nomeInicial;
		valor = valorInicial;
	}
	
	double retornaValorDesconto(){
		return valor * (1 - desconto);
	}
}
