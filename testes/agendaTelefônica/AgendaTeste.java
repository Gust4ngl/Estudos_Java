package testes.agendaTelefônica;

import java.util.Scanner;

public class AgendaTeste {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int op = 0;
		
		Agenda agenda = new Agenda();
		Scanner ler = new Scanner(System.in);


		while (op != 99) {
			System.out.println(
					"1 - Registrar contatos \n2 - Listar contatos \n3 - Alterar um Contato \n4 - Apagar um Contato");
			op = ler.nextInt();
			switch (op) {
			case 1:
				agenda.adicionarContato();
				System.out.println(
						"Deseja adicionar mais um contato? Para continuar basta digitar 1, para sair digite qualquer numero");
				op = ler.nextInt();

				while (op == 1) {
					
					System.out.println(
							"Deseja adicionar mais um contato? Para continuar basta digitar 1, para sair digite qualquer numero");
					op = ler.nextInt();
				}
				break;

			case 2:
				System.out.println("\n");
				agenda.exibirContato();
				System.out.println("\n");
				break;
			case 3:
				System.out.println("Qual contato voce deseja alterar?\n ");
				op = ler.nextInt();
				agenda.alterarContato(op);
				break;

			}// switch
		} // while
	}// psvm
}// class
