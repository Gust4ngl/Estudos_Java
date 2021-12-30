package coleções;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Gustavo");// put tanto adiciona quanto substitui
		usuarios.put(2, "Beatriz");
		usuarios.put(1, "Gustavo");
		//Coloquei a mesma coisa aqui para mostrar que como os valor desse put são iguais ao outro,
		//na hora de exibir o tamanho do map de usuarios vai so mostrar dois e não tres
		
		System.out.println(usuarios.size());
		
		System.out.println(usuarios.keySet());// vai mostrar os valores das chaves(numeros que coloquei)
		System.out.println(usuarios.containsKey(1));//mostra se tem ou nao o numero digitado
		System.out.println(usuarios.containsValue("Gustavo"));//mostra se tem alguma string com esse nome ou com oque for digitado la detro
		System.out.println(usuarios.get(1));
		
		//formas de percorrer um map
		
		for (int chave : usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for (String valor : usuarios.values()) {
			System.out.println(valor);
		}
		
		for (Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ======> ");
			System.out.println(registro.getValue());
		}
	}

}
