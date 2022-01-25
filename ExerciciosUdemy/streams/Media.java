package streams;

public class Media {
	
	private double total;
	private int qtde;
	
	public Media add(double valor) { 
		total +=valor;
		qtde++;
		return this;
	}
	public double getValor() {
		return total / qtde;
	}
	
	public static Media combinar(Media m1, Media m2) {
		Media resultado = new Media();
		resultado.total = m1.total + m2.total;
		resultado.qtde = m1.qtde + m2.qtde;
		return resultado;
	}
}
