package modelo;

import java.util.List;
import java.util.Scanner;

import infra.DAO;

public class TelaOpcoes {

	private DAO<Produtos> dao = new DAO<>(Produtos.class);
	private Produtos prods;
	private Scanner ler = new Scanner(System.in);
	private Long op;
	
	private String nome;
	private Double preco;
	private Integer qtde;
	private Integer novaQtde;
	
	public void adicionarProdutos() {
		System.out.println("Digite o nome do produto");
		nome = ler.next();
		System.out.println("Digite o preço do produto");
		preco = ler.nextDouble();
		System.out.println("Digite a quantidade do produto");
		qtde = ler.nextInt();
		prods = new Produtos(nome, preco, qtde);
		dao.incluirAtomico(prods);
	}
	
	public void verProdutos() {
		List<Produtos> listaProdutos = dao.exibirTodosBD();
		
		for(Produtos produto : listaProdutos) {
			System.out.println("ID: " + produto.getId() + "\nNome: " + produto.getNome() + "\nValor: " + produto.getPreco() + "\nQuantidade: " + produto.getQtde() + "\n\n");
		}
		
	}
	
	public void alterarProdutos() {
		verProdutos();
		System.out.println("Digite o ID de um dos produtos exibidos acima:");
		op = ler.nextLong();
		prods = dao.buscarPorID(op);
		System.out.println("Digite a nova quantidade de produtos");
		novaQtde = ler.nextInt();
		prods.setQtde(novaQtde);
		dao.alterarAtomico(prods);
	}
	
}
