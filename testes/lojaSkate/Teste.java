package lojaSkate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Teste {

	public static void main(String[] args) throws SQLException {
		
			final String url = "jdbc:mysql://localhost/teste?verifyServerCertificate=false&useSSL=true";
			final String usuario = "root";
			final String senha = "12345678";
			
			Connection conexao = DriverManager
					.getConnection(url, usuario, senha);
			
			System.out.println("Conexão executada com sucesso");
			conexao.close();
		
	}

}
