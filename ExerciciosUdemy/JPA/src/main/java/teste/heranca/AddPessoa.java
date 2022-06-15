package teste.heranca;

import infra.DAO;
import modelo.heranca.Pessoa;

public class AddPessoa {

	public static void main(String[] args) {

		DAO<Pessoa> dao = new DAO<Pessoa>();
		Pessoa p = new Pessoa();
		
		p.setNome("Mario");
		
		dao.incluirTudo(p);
	}

}
