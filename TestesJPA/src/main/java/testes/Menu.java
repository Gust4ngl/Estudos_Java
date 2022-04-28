package testes;

import infra.DAO;
import modelo.Produtos;
import modelo.TelaOpcoes;

public class Menu {

	public static void main(String[] args) {

		TelaOpcoes tOp = new TelaOpcoes();
		DAO<Produtos> dao = new DAO<>(Produtos.class);
		tOp.alterarProdutos();
		tOp.verProdutos();
		
	}

}
