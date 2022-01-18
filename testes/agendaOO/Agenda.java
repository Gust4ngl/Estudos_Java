package testes.agendaOO;

public class Agenda {

	Pessoa pessoa;

	void adicionar(String nome, int numero) {
		pessoa = new Pessoa(nome, numero);
	}// void add
}// class agenda
