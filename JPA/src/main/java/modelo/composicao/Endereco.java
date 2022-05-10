package modelo.composicao;

import javax.persistence.Embeddable;

@Embeddable
public class Endereco {

	private String logradouro;
	private String complemento;
	
	public Endereco() {
		super();
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

}

/*
	Embeddable � respons�vel por incluir todos os atributos dessa classe nas tabelas do banco de dados
	s� que isso s� acontece nas classes em que o "endereco" est� instanciado.
*/