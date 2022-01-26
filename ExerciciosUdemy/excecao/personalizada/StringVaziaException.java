package excecao.personalizada;

@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException {

	private String nomeDoAtributo;
	
	public StringVaziaException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}//Constructor classe
	
	public String getMessage() { 
		return String.format("O atributo %s está vazio", nomeDoAtributo);
	}//getMessage
	
}
