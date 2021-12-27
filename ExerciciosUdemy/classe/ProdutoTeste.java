package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Coquinha Gelada", 5.99);
		System.out.println(p1.retornaValorDesconto());
		
		Produto p2 = new Produto("Pastel de Carne", 4.50);
		System.out.println(p2.retornaValorDesconto());
	}

}
