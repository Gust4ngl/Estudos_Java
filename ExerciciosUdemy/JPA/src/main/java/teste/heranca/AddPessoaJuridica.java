package teste.heranca;

import infra.DAO;
import modelo.heranca.PessoaJuridica;

public class AddPessoaJuridica {

	public static void main(String[] args) {

		DAO<PessoaJuridica> dao = new DAO<PessoaJuridica>();
		PessoaJuridica j = new PessoaJuridica();
		
		j.setNome("Jão");
		j.setCnpj("12345678912");
		
		dao.incluirTudo(j);
		
	}

}
