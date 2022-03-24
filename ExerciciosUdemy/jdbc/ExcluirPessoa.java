package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException{

		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o código da pessoa a ser excluida");
		int codigo = ler.nextInt();
		
		Connection conexao = FabricaConexao.getConexao();
		String excluirSQL = "DELETE FROM pessoas WHERE codigo = ?";
	
		PreparedStatement stmt = conexao.prepareStatement(excluirSQL);
		stmt.setInt(1, codigo);
		
		if (stmt.executeUpdate() > 0) {
			System.out.println("Pessoa excluida com sucesso!!!");
		} else {
			System.out.println("Nada aconteceu");
		}
		
		
		ler.close();
		conexao.close();
	}

}
