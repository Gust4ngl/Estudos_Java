package teste.heranca;

import infra.DAO;
import modelo.heranca.PessoaFisica;

public class AddPessoaFisica {

	public static void main(String[] args) {

		DAO<PessoaFisica> dao = new DAO<PessoaFisica>();
		PessoaFisica f = new PessoaFisica();
		
		f.setNome("Zé");
		f.setCpf("12345678912");
		
		dao.incluirTudo(f);
	}

}
