package exercicios.model.repositories;

import org.springframework.data.repository.CrudRepository;

import exercicios.model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}
