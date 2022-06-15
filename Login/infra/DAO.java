package telalogin.infra;

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
	public DAO<E> fecharTransacao() {
		em.getTransaction().commit();
		return this;
	}
	public DAO<E> incluirTransacao(E entidade) {
		em.persist(entidade);
		return this;
	}
	public DAO<E> incluirTudo(E entidade) {
		return this.abrirTransacao().incluirTransacao(entidade).fecharTransacao();
	}

	// Métodos de busca
	
	public E buscarPorID(Long op) {
		return em.find(classe, op);
	}
	
	
	private List<E> exibirEspecifico(String nome) {
		if (classe == null) {
			throw new UnsupportedOperationException("Classe nula.");
		}
		
		nome.toLowerCase();
		String jpql = "SELECT e FROM " + classe.getName() + " e WHERE user = '" + nome + "'" ;
		TypedQuery<E> query = em.createQuery(jpql, classe);
		
		return query.getResultList();
	}
	
	public E consultarUm(String nome) {
		List<E> lista = exibirEspecifico(nome);
		return lista.isEmpty() ? null : lista.get(0);
	}
		
	public void fechar() {
		em.close();
	}
	
}
