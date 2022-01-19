package testes.agendaTelefônica;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class Agenda {

	private Pessoa pessoa;

	private Consumer<Pessoa> imprimir = i -> System.out.println(i.getNome() + "\n" + i.getNumero());
	private ArrayList<Pessoa> agenda = new ArrayList<Pessoa>();

	private String nome;
	private int numero;

	private Scanner ler = new Scanner(System.in);

	void adicionarContato() {
		System.out.println("digite o nome");
		nome = ler.next();
		System.out.println("Digite o numero");
		numero = ler.nextInt();
		agenda.add(new Pessoa(nome, numero));
	}// void add

	void exibirContato() {
		agenda.forEach(imprimir);
	}// void exibir

	void alterarContato(int alt) {
		System.out.println("digite o nome");
		nome = ler.next();
		System.out.println("Digite o numero");
		numero = ler.nextInt();
		agenda.set(alt, pessoa);
	}// void alterar
}// class agenda
