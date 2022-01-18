package testes.agendaOO;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class AgendaTeste {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		String nome;
		int numero;
		int op = 0;

		Consumer<Pessoa> imprimir = i -> System.out.println(i.getNome() + "\n" + i.getNumero());// Consumer criado para
																								// imprimir os valores
																								// dentro do array de
																								// agenda usando lambda
		ArrayList<Pessoa> agenda = new ArrayList<Pessoa>();
		Scanner ler = new Scanner(System.in);

		while (op != 99) {
			System.out.println(
					"1 - Registrar contatos \n2 - Listar contatos \n3 - Alterar um Contato \n4 - Apagar um Contato");
			op = ler.nextInt();
			switch (op) {
			case 1:
				System.out.println("digite o nome");
				nome = ler.next();
				System.out.println("Digite o numero");
				numero = ler.nextInt();
				agenda.add(new Pessoa(nome, numero));
				System.out.println(
						"Deseja adicionar mais um contato? Para continuar basta digitar 1, para sair digite qualquer numero");
				op = ler.nextInt();

				while (op == 1) {
					System.out.println("digite o nome");
					nome = ler.next();
					System.out.println("Digite o numero");
					numero = ler.nextInt();
					agenda.add(new Pessoa(nome, numero));
					System.out.println(
							"Deseja adicionar mais um contato? Para continuar basta digitar 1, para sair digite qualquer numero");
					op = ler.nextInt();
				}
				break;

			case 2:
				System.out.println("\n");
				agenda.forEach(imprimir);
				System.out.println("\n");
				break;
			case 3:
				System.out.println("Qual contato voce deseja alterar?\n " + agenda);
				break;

			}// switch
		} // while
	}// psvm
}// class
