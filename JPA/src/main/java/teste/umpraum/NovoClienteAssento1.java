package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento1 {

	public static void main(String[] args) {

		Assento assento = new Assento("14H");
		Cliente cliente = new Cliente("Joe", assento);

		DAO<Object> dao = new DAO<Object>();

		dao.abrirTransacao().incluirTransacao(assento).incluirTransacao(cliente).fecharTransacao().fechar();

	}

}
