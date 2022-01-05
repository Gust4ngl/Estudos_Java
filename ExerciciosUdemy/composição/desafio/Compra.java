package composição.desafio;

import java.util.ArrayList;

public class Compra {

	Item item;
	ArrayList<Item> compras = new ArrayList<Item>();

	void adicionarProdutos(Produto p, int qtde) {
		this.compras.add(new Item(p, qtde));
	}// Void addProdutos

	double valorTotal() {
		double total = 0;
		for (Item item : compras) {
			total += item.quantidade * item.produto.valor;
		}
		return total;
	}// double Valor Total

}
