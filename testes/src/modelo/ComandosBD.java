package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import javax.swing.JOptionPane;

import com.mysql.cj.util.StringUtils;

public class ComandosBD {

	@SuppressWarnings("unused")
	private Skate s;
	private List<Skate> lista = new ArrayList<>();
	private Connection conexao = ConexaoBD.getConexao();

	// Comandos que serão usados no banco de dados
	private String add = "INSERT INTO skates (nome, quantidade)" + "VALUES (?, ?)";
	private String consulta = "SELECT * FROM skates";
	private String consultarComID = "SELECT * FROM skates WHERE id = ?";
	private String update = "UPDATE skates SET nome = ?, quantidade = ? WHERE id = ?";
	private String vender = "UPDATE skates SET quantidade = ? WHERE id = ?";
	// Fim dos comandos

	// Variáveis que serão usadas dentro da classe
	private String marca;
	private int id;
	private int qtde;
	private int novaQtde;
	// Fim das variáveis

	// Métodos criados para conectar o java com o banco de dados
	//
	public void inserirDados(String valor, int qtde) throws SQLException {
		PreparedStatement stmt = conexao.prepareStatement(add);
		stmt.setString(1, valor);
		stmt.setInt(2, qtde);
		stmt.execute();
		stmt.close();
	}// InserirDados

	public void consultarDados() throws SQLException {
		PreparedStatement stmt = conexao.prepareStatement(consulta);
		ResultSet resultado = stmt.executeQuery();

		while (resultado.next()) {
			this.marca = resultado.getString("nome");
			this.id = resultado.getInt("id");
			this.qtde = resultado.getInt("quantidade");

			lista.add(new Skate(id, marca, qtde));
		}
		String info = "";
		for (Skate skt : lista) {
			info += " || ID: " + skt.getId() + "  ||  Marca: " + skt.getMarca() + "||  Quantidade: "
					+ skt.getQuantidade() + "\n";
		}
		JOptionPane.showMessageDialog(null, info);
		lista.removeAll(lista);
		stmt.close();
	}// consultar dados

	public void alterarDados(int id, String nome, int quantidade) throws SQLException {
		PreparedStatement stmt = conexao.prepareStatement(consultarComID);
		stmt.setInt(1, id);
		ResultSet resultado = stmt.executeQuery();

		if (resultado.next()) {
			stmt.close();
			stmt = conexao.prepareStatement(update);
			stmt.setString(1, nome);
			stmt.setInt(2, quantidade);
			stmt.setInt(3, id);
			stmt.execute();
		} // if
		stmt.close();
	}// alterar dados

	public void excluirDados() throws SQLException {
		
		id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite qual o ID do skate será vendido"));
		
		PreparedStatement stmt = conexao.prepareStatement(consultarComID);
		stmt.setInt(1, id);
		ResultSet resultado = stmt.executeQuery();
		
		while (resultado.next()) {
			novaQtde = resultado.getInt("quantidade");
		}
		
		qtde = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite qual a quantidade de skates que serão vendidos:"));
		
		if (novaQtde > 0) {
			novaQtde -= qtde;
			
			stmt = conexao.prepareStatement(vender);
			stmt.setInt(1,novaQtde);
			stmt.setInt(2, id);
			stmt.execute();
			stmt.close();
		} else {
			JOptionPane.showMessageDialog(null, "Não é possível vender mais skates!");
		}
		
	}
	//
	//Fim dos métodos para java e bd

	@Override
	public String toString() {
		return "ID: " + this.id + " Marca: " + this.marca + " Quantidade: " + this.qtde;
	}

}
