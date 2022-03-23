package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AterarPessoas {

	public static void main(String[] args) throws SQLException{

		Scanner ler = new Scanner(System.in);
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoas WHERE codigo = ?";
		
		System.out.println("Informe um codigo para buscar");
		int valor = ler.nextInt();
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, valor);
		ResultSet resultado = stmt.executeQuery();
		
		List<Pessoa> pessoas = new ArrayList<>();
			
		if(resultado.next()) {
			Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2));
			System.out.println(p.getNome());
			
			System.out.println("digite o novo nome: ");
			String novoNome = ler.next();
			
			sql = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
			
			stmt.close();
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, novoNome);
			stmt.setInt(2, valor);
			stmt.execute();
		}
		
		stmt.close();
		conexao.close();

	}

}
