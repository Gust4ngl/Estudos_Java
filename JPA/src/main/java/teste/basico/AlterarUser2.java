package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUser2 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Usuario user = em.find(Usuario.class, 2L);
		user.setNome("Gusta");
		user.setEmail("gustasilva@gmail.com");
		//em.merge(user);

		em.getTransaction().commit();

		em.close();
		emf.close();
	}

}
