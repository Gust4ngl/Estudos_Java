package excecao.personalizada;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends RuntimeException {

	private String nomeDoAtributo;
	
	public NumeroForaIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}//Constructor classe
	
	public String getMessage() { 
		return String.format("O atributo %s está fora do intervalo", nomeDoAtributo);
	}//getMessage
	
}
