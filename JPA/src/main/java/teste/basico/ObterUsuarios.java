package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class ObterUsuarios {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA");
		EntityManager em = emf.createEntityManager();
		
		String jpql = "select u from Usuario u";
		
		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
		List<Usuario> user = query.getResultList();
		query.setMaxResults(2);
		
		for (Usuario usuario : user) {
			System.out.println("\nID: " + usuario.getId() + "\nNome: " + usuario.getNome() + "\nE-mail: " + usuario.getEmail());
		}
		
		em.close();
		emf.close();
		
	}

}
