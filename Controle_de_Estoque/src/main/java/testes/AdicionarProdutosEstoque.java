package testes;

import java.util.Scanner;

import infra.DAO;
import modelo.umpramuitos.Estoque;
import modelo.umpramuitos.Produto;

public class AdicionarProdutosEstoque {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		DAO<Object> dao = new DAO<Object>();
		
		Produto prod;
		Estoque estoque = new Estoque();
		
		String nome;
		double valor;
		int op = 0;
		
		while(op != 99) {
			System.out.println("Digite as opções: 1-Add");
			op = ler.nextInt();
			switch(op) {
			
			case 1:
				System.out.println("digite o nome do produto:");
				nome = ler.next();
				System.out.println("digite o valor");
				valor = ler.nextDouble();
				prod = new Produto(nome, valor);
				estoque.addProdutoEstoque(prod, 9);
				dao
					.abrirTransacao()
					.incluirTransacao(prod)
					.incluirTransacao(estoque)
					.fecharTransacao()
					.fechar();
				break;
			
			}
			
		}
		
	}

}
