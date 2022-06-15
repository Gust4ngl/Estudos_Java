package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class DeletarUser {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA");
		EntityManager em = emf.createEntityManager();

		Usuario user = em.find(Usuario.class, 1L);
		
		if (user != null) {
			
			em.getTransaction().begin();
			em.remove(user);
			em.getTransaction().commit();
			
		}
		
		em.close();
		emf.close();
	}

}
