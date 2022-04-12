package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUser3 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin(); //Qualquer coisa que for alterada aqui estar� fazendo mudan�as no banco de dados
									 // Se usar o comando detach o objeto alterado dentro desse contexto n�o influenciar� os dados armazenados no BD

		Usuario user = em.find(Usuario.class, 2L);
		em.detach(user); // Fun��o respons�vel por tirar o objeto do estado gerenci�vel
		
		user.setNome("Gust");
		em.merge(user);

		em.getTransaction().commit();

		em.close();
		emf.close();
	}

}
