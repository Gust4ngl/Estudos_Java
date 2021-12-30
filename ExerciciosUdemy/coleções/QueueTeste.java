package coleções;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTeste {

	public static void main(String[] args) {
		Queue<String> nomes = new LinkedList<>();
		
		nomes.add("Carlos");
		nomes.offer("João");
		nomes.add("Ana");
		nomes.offer("Rodrigo");
		
		//Offer e add fazem adicionam algo a uma lista
		//A diferença entre eles é o comportamento de cada um quando a fila fica cheia
		
		System.out.println(nomes.peek());// retorna null
		System.out.println(nomes.element());
		System.out.println(nomes.peek());
		System.out.println(nomes.element());// mostra uma exceção
		
		//Peek e Element mostram os proximos elementos da fila (Sem remover)
		//Diferenca entre peek e element é quando a fila está vazia
		
		System.out.println(nomes.poll());// retorna null
		System.out.println(nomes.remove());
		System.out.println(nomes.poll());
		System.out.println(nomes.remove());// retorna uma exceção
		
		//Poll e Remove mostra os proximos elementos da fila e logo em seguida os remove
		//A diferença entre os dois também ocorre quando a fila esta vazia
	
		System.out.println();
		
		for (String string : nomes) {
			System.out.println(string);//for feito para mostrar como é exibido os elementos em queue
		}
	}

}
