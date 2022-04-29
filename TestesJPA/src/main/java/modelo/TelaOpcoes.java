package modelo;

import java.util.List;
import java.util.Scanner;

import infra.ProdutoDAO;

public class TelaOpcoes {

	private Produtos prods;
	private ProdutoDAO prodDAO = new ProdutoDAO();
	private Scanner ler = new Scanner(System.in);
	private Long op;
	private int controle;
	
	private String nome;
	private Double preco;
	private Integer qtde;
	private String novoNome;
	private Double novoPreco;
	private Integer novaQtde;
	
	public void adicionarProdutos() {
		System.out.println("Digite o nome do produto");
		nome = ler.next();
		System.out.println("Digite o preço do produto");
		preco = ler.nextDouble();
		System.out.println("Digite a quantidade do produto");
		qtde = ler.nextInt();
		prods = new Produtos(nome, preco, qtde);
		prodDAO.incluirAtomico(prods);
	}
	
	public void verProdutos() {
		List<Produtos> listaProdutos = prodDAO.exibirTodosBD();
		
		for(Produtos produto : listaProdutos) {
			System.out.println("ID: " + produto.getId() + "\nNome: " + produto.getNome() + "\nValor: " + produto.getPreco() + "\nQuantidade: " + produto.getQtde() + "\n\n");
		}
		
	}
	
	public void alterarProdutos() {
		verProdutos();
		System.out.println("Digite o ID de um dos produtos exibidos acima:");
		op = ler.nextLong();
		System.out.println("Oque você deseja fazer com o produto selecionado?\n 1 - Alterar nome\n 2 - Alterar quantidade\n 3 - Alterar preço");
		controle = ler.nextInt();
		prods = prodDAO.buscarPorID(op);
		switch (controle) {
		case 1:
			System.out.println("Digite o novo nome do produto");
			novoNome = ler.next();
			prods.setNome(novoNome);
			prodDAO.alterarAtomico(prods);
			break;
		case 2: 
			System.out.println("Digite a nova quantidade de produtos");
			novaQtde = ler.nextInt();
			prods.setQtde(novaQtde);
			prodDAO.alterarAtomico(prods);
			break;
		case 3:
			System.out.println("Digite o novo preço do produto");
			novoPreco = ler.nextDouble();
			prods.setPreco(novoPreco);
			prodDAO.alterarAtomico(prods);
			break;
		}
	
	}
	public void excluirProdutos() {
		verProdutos();
		System.out.println("Digite o ID de um dos produtos exibidos acima:");
		op = ler.nextLong();
		prods = prodDAO.buscarPorID(op);
		prodDAO.excluirAtomico(prods);
	}
	
}
