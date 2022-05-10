package modelo.consulta;

import infra.DAO;

public class ObterMediaFilmes {

	public static void main(String[] args) {

		DAO<NotaFilme> dao = new DAO<NotaFilme>(NotaFilme.class);
		
		NotaFilme notaF = dao.consultarUm("MediaGeral");
		System.out.println(notaF.getMedia());
		
		dao.fechar();
	}

}
