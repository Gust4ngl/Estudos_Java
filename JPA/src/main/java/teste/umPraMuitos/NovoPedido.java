package teste.umPraMuitos;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class NovoPedido {

	public static void main(String[] args) {

		DAO<Object> dao = new DAO<Object>();
		Produto p1 = new Produto("Catapimbas", 9999.9);
		Pedido pedido = new Pedido();
		ItemPedido item = new ItemPedido(9999, pedido, p1);
		
		dao
			.abrirTransacao()
			.incluirTransacao(p1)
			.incluirTransacao(pedido)
			.incluirTransacao(item)
			.fecharTransacao()
			.fechar();
		
	}

}
