package teste.umPraMuitos;

import infra.DAO;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class ObterPedido {

	public static void main(String[] args) {

		DAO<Pedido> dao = new DAO<Pedido>(Pedido.class);
		Pedido pedido = dao.buscarPorID(2L);
		
		for(ItemPedido itens: pedido.getItens()) {
			System.out.println(itens.getQtde());
			System.out.println(itens.getProduto().getNome());
		}
		
		
		dao.fechar();
	}

}
