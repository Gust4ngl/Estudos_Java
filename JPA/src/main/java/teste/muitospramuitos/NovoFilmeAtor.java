package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

public class NovoFilmeAtor {

	public static void main(String[] args) {

		Filme filmeA = new Filme("A volta dos que não foram", 9.9);
		Filme filmeB = new Filme("Não sei", 0.3);
		Ator atorA = new Ator("Lucas");
		Ator atorB = new Ator("Pedro");
		
		filmeA.addAtor(atorA);
		filmeA.addAtor(atorB);
		
		filmeB.addAtor(atorA);
		filmeB.addAtor(atorB);
		
		DAO<Filme> dao = new DAO<>();
		
		dao.incluirTudo(filmeA);
	}

}
