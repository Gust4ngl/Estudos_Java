package composição.desafio;

import java.util.ArrayList;

public class Cliente {

	String nome;

	ArrayList<Compra> compras = new ArrayList<>();

	Cliente(String nome) {
		this.nome = nome;
	}// Construtor Cliente

	double valorCarrinho() {
		double total = 0;
		for (Compra compra : compras) {
			total += compra.valorTotal();
		}
		return total;
	}// Double Valor Carrinho
}
