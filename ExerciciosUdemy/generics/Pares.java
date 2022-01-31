package generics;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Pares<C extends Number, V> {

	private final Set<Par<C, V>> itens = new LinkedHashSet<>();
	
	public void add(C chave, V valor) {
		if(chave == null) return;
		
		Par<C, V> novopar = new Par<C, V>(chave, valor);
		
		if(itens.contains(novopar)) {
			itens.remove(novopar);
		}//if
		
		itens.add(novopar);
		
	}//add
	
	public V getValor(C chave) {
		if(chave == null) return null;

		Optional<Par <C, V>> parOpcional = itens.stream()
				.filter(par -> chave.equals(par.getChave()))
				.findFirst();
		return parOpcional.isPresent()
				? parOpcional.get().getValor() : null;
	}
	
}//class
