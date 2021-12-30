package coleções;

import java.util.HashSet;
import java.util.Set;

public class SetTeste {

	public static void main(String[] args) {
		Set<String> pessoas = new HashSet<>();
		
		pessoas.add("Carlos");
		pessoas.add("João");
		pessoas.add("Ana");
		
		for(String p: pessoas) {
			System.out.println(p);//for feito para mostrar como é exibido os elementos em pilha
		}
	}
}
