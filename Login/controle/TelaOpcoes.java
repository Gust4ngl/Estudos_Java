package telalogin.controle;

import java.util.Scanner;

public class TelaOpcoes {

	private static Comandos cod = new Comandos();
	private static Scanner ler = new Scanner(System.in);
	private static String nome, senha;
	private static int op = 0;
	
	public static void Executar() {
		while(op != 99) {
		System.out.println("1 - registrar 2 - logar");
		op = ler.nextInt();
			switch (op) {
			case 1:
				System.out.println("digite o nome");
				nome = ler.next();
				System.out.println("digite a senha");
				senha = ler.next();
				cod.registrarUsuario(nome, senha);
				nome = null;
				senha = null;
				break;
			case 2:
				System.out.println("digite o nome");
				nome = ler.next();
				System.out.println("digite a senha");
				senha = ler.next();
				cod.fazerLogin(nome, senha);
				break;
			}
		}
	}
}
