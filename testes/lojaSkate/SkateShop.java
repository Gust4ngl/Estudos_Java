package lojaSkate;

import java.sql.SQLException;
import java.util.Scanner;

public class SkateShop {
		
		Skate skate;
		ComandosParaBancoDeDados cod = new ComandosParaBancoDeDados();
		private Scanner ler = new Scanner(System.in);
		
		private String marca = null;
	

		public void adicionarSkate() throws SQLException {
			System.out.println("Digite a marca do skate para registrar");
			marca = ler.next();
			int id = 0;
			new Skate(id, marca);
			cod.inserirDados(marca);
		}//metodo para registrar peças que foram usadas no skate		
		
		public void exibirProdutos() throws SQLException {
			cod.consultarDados();
		}//exibir marcas de skate disponíveis
		
		@SuppressWarnings("unused")
		public void alterarSkate() throws SQLException {
			System.out.println("Digite qual o id do skate será alterado");
			int alt = ler.nextInt();
			System.out.println("Digite a nova marca do skate");
			marca = ler.next();
			cod.alterarDados(alt, marca);
			
		}
		
		@SuppressWarnings("unused")
		public void venderSkate() throws SQLException {
			System.out.println("Digite qual o ID do skate será vendido");
			int alt = ler.nextInt();
			cod.excluirDados(alt);
		}
}
