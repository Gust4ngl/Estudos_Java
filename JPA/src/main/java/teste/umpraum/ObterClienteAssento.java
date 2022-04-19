package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Cliente;

public class ObterClienteAssento {

	public static void main(String[] args) {

		DAO<Cliente> dao = new DAO<Cliente>(Cliente.class);
		Cliente cliente = dao.buscarPorID(7L);
		
		System.out.println("Nome: " + cliente.getNome() + "\nAssento n: " + cliente.getAssento().getNome());
		System.out.println(cliente.getAssento().getCliente().getNome());
	}

}
