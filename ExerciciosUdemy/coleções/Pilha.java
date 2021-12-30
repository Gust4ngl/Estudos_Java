package coleções;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		Deque<String> nomes = new ArrayDeque<>();
		
		nomes.add("Carlos");
		nomes.push("João");
		
		
//		System.out.println(nomes.peek());
//		System.out.println(nomes.element());
//
//		System.out.println(nomes.pop());
//		System.out.println(nomes.poll());
		
		for (String string : nomes) {
			System.out.println(string); //for feito para mostrar como é exibido os elementos em pilha
		}
		
	}

}
