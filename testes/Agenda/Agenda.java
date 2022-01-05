package testes;

import java.util.ArrayList;

public class Agenda {

	ArrayList<Contatos> contatos = new ArrayList<Contatos>();

	void addContatos(String nome, int numero, int cep) {
		var contato = new Contatos(nome, numero, cep);
		this.contatos.add(contato);
	}

	ArrayList<String> exibirCtt() {
		ArrayList<String> c1 = new ArrayList<>();

		for (Contatos contatos2 : contatos) {
			c1.add(contatos2.nome);
		}
		return c1;
		/*
		Sei que essa provavelmente não é a melhor forma de criar um método para mostrar
		os atributos dentro de uma classe mas foi a unica forma que eu consegui fazer sem pesquisar em lugar nenhum.
		Basicamente esse é um método que vai me retornar um ArrayList, oque ele vai fazer? bem, eu criei um array chamado
		c1 para armazenar somente os nomes de cada contato(poderia mostrar todos os atributos mas quis fazer só com o nome pra não confundir muito),
		O que esse for vai fazer? ele vai percorrer o arraylist de contatos e toda vez que ele percorrer um valor dentro do array,
		ele vai adicionar esse valor ao arraylist de c1.
		Depois que ele percorrer todo o arraylist e adicionar os valores ao outro arraylist(c1), ele vai retornar todos os valores de c1 em forma de array
		na hora que eu chamar esse método 
		 */
	}
	
}
