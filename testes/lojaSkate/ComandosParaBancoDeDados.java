package lojaSkate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.mysql.cj.protocol.Resultset;

public class ComandosParaBancoDeDados {

	@SuppressWarnings("unused")
	private Skate s;
	private Consumer<Skate> imprimir = i -> System.out.println(" || ID: " + i.getId() + "  ||  Marca: " + i.getMarca() + "||  Quantidade: " + i.getQuantidade());
	private List<Skate> lista = new ArrayList<>();
	private Connection conexao = ConexaoBD.getConexao();
	
	
	private String add = "INSERT INTO skates (nome, quantidade)"
				+ "VALUES (?, ?)";
	private String consulta = "SELECT * FROM skates";
	private String consultarComID = "SELECT * FROM skates WHERE id = ?";
	private String update = "UPDATE skates SET nome = ?, quantidade = ? WHERE id = ?";
	private String vender = "UPDATE skates SET quantidade = ? WHERE id = ?";
	
	private String marca;
	private int id;
	private int qtde;
	private int novaQtde;
	
	public void inserirDados(String valor, int qtde) throws SQLException{
		PreparedStatement stmt = conexao.prepareStatement(add);
		stmt.setString(1, valor);
		stmt.setInt(2, qtde);
		stmt.execute();
		stmt.close();
	}//inserir dados
	
	public void consultarDados() throws SQLException{
		PreparedStatement stmt = conexao.prepareStatement(consulta);
		ResultSet resultado = stmt.executeQuery();
		
		while (resultado.next()) {
			this.marca = resultado.getString("nome");
			this.id = resultado.getInt("id");
			this.qtde = resultado.getInt("quantidade");
			
			lista.add(new Skate(id, marca, qtde));
		}
		
		System.out.println("\n");
		lista.forEach(imprimir);
		lista.removeAll(lista);
		System.out.println("\n");
		stmt.close();
	}//consultar dados
	
	public void alterarDados(int id, String nome, int quantidade) throws SQLException {
		PreparedStatement stmt = conexao.prepareStatement(consultarComID);
		stmt.setInt(1, id);
		ResultSet resultado = stmt.executeQuery();
		
		if(resultado.next()) {
			stmt.close();
			stmt = conexao.prepareStatement(update);
			stmt.setString(1, nome);
			stmt.setInt(2, quantidade);
			stmt.setInt(3, id);
			stmt.execute();
		}//if
		
		stmt.close();
		
	}//alterar dados
	
	public void excluirDados(int id, int qtde) throws SQLException {
		PreparedStatement stmt = conexao.prepareStatement(consultarComID);
		stmt.setInt(1, id);
		ResultSet resultado = stmt.executeQuery();
		
		while (resultado.next()) {
			novaQtde = resultado.getInt("quantidade");
		}
		
		if (novaQtde > qtde) {
			novaQtde -= qtde;
			stmt = conexao.prepareStatement(vender);
			stmt.setInt(1,novaQtde);
			stmt.setInt(2, id);
			stmt.execute();
		} else {
			System.out.println("Não é possivel vender mais skates do que possui!\n");
		}
		
		stmt.close();
		
	}
}
