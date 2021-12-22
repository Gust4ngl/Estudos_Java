package testes;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Agenda {

	public static void main(String[] args) {
		String nome = null, endereco = null;
		int numero = 0, cep = 0;
		int op = 0;

		ArrayList<String> Contato = new ArrayList();

		while (op != 99) {
			op = Integer.parseInt(JOptionPane.showInputDialog(
					"1 - Registrar contatos \n2 - Listar contatos \n3 - Alterar um Contato \n4 - Apagar um Contato"));
			switch (op) {
			case 1:
				nome = JOptionPane.showInputDialog("Digite o nome do contato");
				endereco = JOptionPane.showInputDialog("digite o endereço do contato");
				numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do contato"));
				cep = Integer.parseInt(JOptionPane.showInputDialog("Digite o cep do contato"));

				Contato.add("\n Nome: " + nome + "\nEndereço: " + endereco + "\nNumero: " + numero + "\nCep: " + cep);
				op = JOptionPane.showConfirmDialog(null, "Deseja continuar registrando contatos a agenda?");

				while (op != 1) {
					nome = JOptionPane.showInputDialog("Digite o nome do contato");
					endereco = JOptionPane.showInputDialog("digite o endereço do contato");
					numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do contato"));
					cep = Integer.parseInt(JOptionPane.showInputDialog("Digite o cep do contato"));

					Contato.add(
							"\n Nome: " + nome + "\nEndereço: " + endereco + "\nNumero: " + numero + "\nCep: " + cep);
					op = JOptionPane.showConfirmDialog(null, "Deseja continuar registrando contatos a agenda?");
				}
				break;

			case 2:

				JOptionPane.showMessageDialog(null, "Cadastre um contato a agenda primeiro!");
				int n = Contato.size();
				for (int i = 0; i < n; i++) {
					JOptionPane.showMessageDialog(null, "Posição: " + i + Contato.get(i));
				}
				break;

			case 3:
				op = Integer.parseInt(JOptionPane.showInputDialog("Qual contato voce deseja alterar?" + Contato));
				JOptionPane.showMessageDialog(null, "O contato selecionado foi: " + Contato.get(op));
				nome = JOptionPane.showInputDialog("Digite o nome do contato");
				endereco = JOptionPane.showInputDialog("digite o endereço do contato");
				numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do contato"));
				cep = Integer.parseInt(JOptionPane.showInputDialog("Digite o cep do contato"));

				Contato.set(op,
						"\n Nome: " + nome + "\nEndereço: " + endereco + "\nNumero: " + numero + "\nCep: " + cep);
				JOptionPane.showMessageDialog(null, "Contato alterado com sucesso!");
				break;

			case 4:
				JOptionPane.showMessageDialog(null, "Cadastre um contato a agenda primeiro!");
				op = Integer.parseInt(JOptionPane.showInputDialog("Qual contato voce deseja apagar?" + Contato));
				Contato.remove(op);
				break;

			default:
				break;
			}// switch

		} // while

	}// psvm

}// public class
