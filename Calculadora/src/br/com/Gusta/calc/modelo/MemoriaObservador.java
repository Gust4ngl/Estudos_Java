package br.com.Gusta.calc.modelo;

@FunctionalInterface
public interface MemoriaObservador {

	void valorAlterado(String novoValor);
	
}
