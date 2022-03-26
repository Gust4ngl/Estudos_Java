package lojaSkate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ComandosParaBancoDeDados {

	@SuppressWarnings("unused")
	private Skate s;
	private Consumer<Skate> imprimir = i -> System.out.println(" || ID: " + i.getId() + "  ||  Marca: " + i.getMarca());
	private List<Skate> lista = new ArrayList<>();
	private Connection conexao = ConexaoBD.getConexao();
	
	
	private String add = "INSERT INTO skates (nome)"
				+ "VALUES (?)";
	private String consulta = "SELECT * FROM skates";
	private String consultarComID = "SELECT * FROM skates WHERE id = ?";
	private String update = "UPDATE skates SET nome = ? WHERE id = ?";
	private String excluir = "DELETE FROM skates WHERE id = ?";
	
	public void inserirDados(String valor) throws SQLException{
		PreparedStatement stmt = conexao.prepareStatement(add);
		stmt.setString(1, valor);
		stmt.execute();
		stmt.close();
	}//inserir dados
	
	public void consultarDados() throws SQLException{
		PreparedStatement stmt = conexao.prepareStatement(consulta);
		ResultSet resultado = stmt.executeQuery();
		
		while (resultado.next()) {
			String marca = resultado.getString("nome");
			int id = resultado.getInt("id");
			
			lista.add(new Skate(id, marca));
		}
		
		System.out.println("\n");
		lista.forEach(imprimir);
		lista.removeAll(lista);
		System.out.println("\n");
		stmt.close();
	}//consultar dados
	
	public void alterarDados(int id, String nome) throws SQLException {
		PreparedStatement stmt = conexao.prepareStatement(consultarComID);
		stmt.setInt(1, id);
		ResultSet resultado = stmt.executeQuery();
		
		if(resultado.next()) {
			stmt.close();
			stmt = conexao.prepareStatement(update);
			stmt.setString(1, nome);
			stmt.setInt(2, id);
			stmt.execute();
		}//if
		
		stmt.close();
		
	}//alterar dados
	
	public void excluirDados(int id) throws SQLException {
		PreparedStatement stmt = conexao.prepareStatement(excluir);
		stmt.setInt(1, id);
		stmt.execute();
	}
}
