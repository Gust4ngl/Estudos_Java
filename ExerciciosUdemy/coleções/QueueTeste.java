package cole��es;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTeste {

	public static void main(String[] args) {
		Queue<String> nomes = new LinkedList<>();
		
		nomes.add("Carlos");
		nomes.offer("Jo�o");
		nomes.add("Ana");
		nomes.offer("Rodrigo");
		
		//Offer e add fazem adicionam algo a uma lista
		//A diferen�a entre eles � o comportamento de cada um quando a fila fica cheia
		
		System.out.println(nomes.peek());// retorna null
		System.out.println(nomes.element());
		System.out.println(nomes.peek());
		System.out.println(nomes.element());// mostra uma exce��o
		
		//Peek e Element mostram os proximos elementos da fila (Sem remover)
		//Diferenca entre peek e element � quando a fila est� vazia
		
		System.out.println(nomes.poll());// retorna null
		System.out.println(nomes.remove());
		System.out.println(nomes.poll());
		System.out.println(nomes.remove());// retorna uma exce��o
		
		//Poll e Remove mostra os proximos elementos da fila e logo em seguida os remove
		//A diferen�a entre os dois tamb�m ocorre quando a fila esta vazia
	
		System.out.println();
		
		for (String string : nomes) {
			System.out.println(string);//for feito para mostrar como � exibido os elementos em queue
		}
	}

}
