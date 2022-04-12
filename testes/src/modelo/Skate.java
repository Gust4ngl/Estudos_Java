package modelo;

public class Skate {

	private String marca;
	private int id, quantidade;

	public Skate(int id, String nome, int qtde) {
		this.id = id;
		this.marca = nome;
		this.quantidade = qtde;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getId() {
		return id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
