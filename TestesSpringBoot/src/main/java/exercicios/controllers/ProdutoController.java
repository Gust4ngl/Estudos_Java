package exercicios.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import exercicios.model.entities.Produto;
import exercicios.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoRepository prodRepository;

	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody Produto novoProduto(@Valid Produto produto) {
		prodRepository.save(produto);
		return produto;
	}

	@GetMapping("/buscar")
	public Iterable<Produto> buscarProd() {
		return prodRepository.findAll();
	}

	@GetMapping("/buscarID")
	public Optional<Produto> buscarPorIdProd(@RequestParam(name = "id") int id) {
		return prodRepository.findById(id);
	}

	@DeleteMapping("/deletar/{id}")
	public String deletarPorID(@PathVariable int id) {
		prodRepository.deleteById(id);
		return "Produto deletado!";
	}
	
//	@PutMapping
//	public Produto alterarProd(@Valid Produto prod) {
//		prodRepository.save(prod);
//		return prod;
//	}
	
}
