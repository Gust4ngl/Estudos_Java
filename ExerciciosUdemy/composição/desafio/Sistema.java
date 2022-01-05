package composição.desafio;

public class Sistema {

	public static void main(String[] args) {

		Cliente c1 = new Cliente("Gustavo");
		Compra carrinho1 = new Compra();

		carrinho1.adicionarProdutos(new Produto("Celular", 1999.99), 1);
		carrinho1.adicionarProdutos(new Produto("Notebook", 2999.99), 1);
		c1.compras.add(carrinho1);

		Compra carrinho2 = new Compra();

		carrinho2.adicionarProdutos(new Produto("Camiseta Preta", 59.99), 2);
		carrinho2.adicionarProdutos(new Produto("Bermuda", 159.99), 3);
		c1.compras.add(carrinho2);

		System.out.println(c1.valorCarrinho());

	}

}
