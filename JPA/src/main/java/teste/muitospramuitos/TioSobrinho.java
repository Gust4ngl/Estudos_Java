package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Sobrinho;
import modelo.muitospramuitos.Tio;

public class TioSobrinho {

	public static void main(String[] args) {

		Tio tio1 = new Tio("maria");
		Tio tio2 = new Tio("José");
		
		Sobrinho sobrinho1 = new Sobrinho("Carlos");
		Sobrinho sobrinho2 = new Sobrinho("Paty");
		
		
		tio1.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tio1);
		tio1.getSobrinhos().add(sobrinho2);
		sobrinho2.getTios().add(tio1);
		
		tio2.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tio2);
		tio2.getSobrinhos().add(sobrinho2);
		sobrinho2.getTios().add(tio2);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirTransacao()
			.incluirTransacao(tio1)
			.incluirTransacao(tio2)
			.incluirTransacao(sobrinho1)
			.incluirTransacao(sobrinho2)
			.fecharTransacao()
			.fechar();
		
	}

}
