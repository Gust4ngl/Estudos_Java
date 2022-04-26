package modelo.umpramuitos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Estoque {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Integer qtde;
	
	@OneToOne
	private Produto produto;
	
	public Estoque() {
	}

	public Estoque(Produto prod, Integer qtde) {
		super();
		this.produto = prod;
		this.qtde = qtde;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQtde() {
		return qtde;
	}

	public void setQtde(Integer qtde) {
		this.qtde = qtde;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public void addProdutoEstoque(Produto prod, Integer qtde) {
		this.setProduto(prod);
		this.setQtde(qtde);
	}

}