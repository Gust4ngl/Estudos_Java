package infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DAO<E> {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private Class<E> classe;

	static {
		try {
			emf = Persistence.createEntityManagerFactory("TestesJPA");
		} catch (Exception e) {
			// logar -> log4j
		}
	}

	// Construtores
	public DAO() {
		this(null);
	}
	public DAO(Class<E> classe) {
		this.classe = classe;
		em = emf.createEntityManager();
	}

	// Métodos para incluir
	public DAO<E> abrirTransacao() {
		em.getTransaction().begin();
		return this;
	}
	public DAO<E> incluirTransacao(E entidade) {
		em.persist(entidade);
		return this;
	}
	public DAO<E> alterarDados(E entidade) {
		em.merge(entidade);
		return this;
	}
	public DAO<E> excluirDados(E entidade) {
		em.remove(entidade);
		return this;
	}
	public DAO<E> fecharTransacao() {
		em.getTransaction().commit();
		return this;
	}
	
	public DAO<E> incluirAtomico(E entidade) {
		return this.abrirTransacao().incluirTransacao(entidade).fecharTransacao();
	}
	public DAO<E> alterarAtomico(E entidade) {
		return this.abrirTransacao().alterarDados(entidade).fecharTransacao();
	}
	public DAO<E> excluirAtomico(E entidade) {
		return this.abrirTransacao().excluirDados(entidade).fecharTransacao();
	}

	// Métodos de busca
	
	public E buscarPorID(Long op) {
		return em.find(classe, op);
	}
	
	public List<E> exibirTodosBD() {
		if (classe == null) {
			throw new UnsupportedOperationException("Classe nula.");
		}
		
		String jpql = "SELECT e FROM " + classe.getName() + " e";
		TypedQuery<E> query = em.createQuery(jpql, classe);
		return query.getResultList();
	}
	
	public void fechar() {
		em.close();
	}
	
}
