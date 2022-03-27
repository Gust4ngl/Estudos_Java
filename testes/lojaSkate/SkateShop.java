package lojaSkate;

import java.sql.SQLException;
import java.util.Scanner;

public class SkateShop {
		
		Skate skate;
		ComandosParaBancoDeDados cod = new ComandosParaBancoDeDados();
		private Scanner ler = new Scanner(System.in);
		
		private String marca = null;
		private int qtde = 0;
		private int id = 0;

		public void adicionarSkate() throws SQLException {
			System.out.println("Digite a marca do skate para registrar");
			marca = ler.next();
			System.out.println("Digite a quantidade de produtos a serem registrados");
			qtde = ler.nextInt();
			new Skate(id, marca, qtde);
			cod.inserirDados(marca, qtde);
		}//metodo para registrar peças que foram usadas no skate		
		
		public void exibirProdutos() throws SQLException {
			cod.consultarDados();
		}//exibir marcas de skate disponíveis
		
		@SuppressWarnings("unused")
		public void alterarSkate() throws SQLException {
			System.out.println("Digite qual o id do skate será alterado:");
			int alt = ler.nextInt();
			System.out.println("Digite a nova marca do skate:");
			marca = ler.next();
			System.out.println("Digite a nova quantidade de itens que ainda existem:");
			int qtde = ler.nextInt();
			cod.alterarDados(alt, marca, qtde);
			
		}
		
		@SuppressWarnings("unused")
		public void venderSkate() throws SQLException {
			System.out.println("Digite qual o ID do skate será vendido");
			int alt = ler.nextInt();
			cod.excluirDados(alt);
		}
}
