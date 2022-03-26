package lojaSkate;

import java.sql.SQLException;
import java.util.Scanner;

public class Loja {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws SQLException {
		
		Scanner ler = new Scanner(System.in);
		SkateShop loja = new SkateShop();
		 
		int op = 0;
		
		while (op != 99) {
			System.out.println("Digite uma opção \n 1 - Adicionar \n 2 - Exibir \n 3 - Alterar \n 4 - vender");
			op = ler.nextInt();
			
			switch (op) {
			case 1:
				loja.adicionarSkate();
				break;
			case 2:
				loja.exibirProdutos();
				break;
			case 3:
				loja.alterarSkate();
				break;
			case 4:
				loja.venderSkate();
				break;
			default:
				break;
			}//switch
			
		}//while
		
	}//main

}//classe
