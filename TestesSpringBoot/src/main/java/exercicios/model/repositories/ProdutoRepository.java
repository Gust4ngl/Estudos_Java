package exercicios.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import exercicios.model.entities.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {

}
