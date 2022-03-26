package lojaSkate;

public class Skate {

	private String marca;
	private int id;
	
	public Skate(int id, String nome) {
		this.id = id;
		this.marca = nome;	
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

}
