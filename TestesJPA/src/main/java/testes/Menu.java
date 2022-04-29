package testes;

import java.util.Scanner;

import modelo.TelaOpcoes;

public class Menu {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		TelaOpcoes tp = new TelaOpcoes();
		int op = 0;
		
		while(op != 99) {
			
			System.out.println("Digite uma opção:\n 1 - Adicionar produtos\n 2 - Consultar produtos\n 3 - Alterar produtos\n 4 - Excluir produtos");
			op = ler.nextInt();
			
			switch(op) {
			
			case 1:
				tp.adicionarProdutos();
				break;
			case 2:
				tp.verProdutos();
				break;
			case 3:
				tp.alterarProdutos();
				break;
			case 4:
				tp.excluirProdutos();
				break;
			
			}// switch
			
		}// while
		
	}// main
	
}// class
