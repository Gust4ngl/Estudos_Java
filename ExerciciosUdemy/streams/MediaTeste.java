package streams;

public class MediaTeste {

	public static void main(String[] args) {
		
		Media m1 = new Media().add(8.3).add(8.9);
		Media m2 = new Media().add(7.0).add(9.6);
		
		System.out.println(m1.getValor());
		System.out.println(m2.getValor());
		
		System.out.println(Media.combinar(m1, m2).getValor());
		
	}
	
}
