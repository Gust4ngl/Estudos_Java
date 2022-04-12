package modelo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class LojaSkate {

	private LojaSkate(){}
	
	private static final LojaSkate instancia = new LojaSkate();
	private final List<MemoriaObserver> observadores = new ArrayList<>();
	private ComandosBD cod = new ComandosBD();

	private String marca = null;
	private int op;
	private int qtde = 0;
	private int id = 0;


	public static LojaSkate getInstancia() {
		return instancia;
	}

	public void addObservador(MemoriaObserver observador) {
		observadores.add(observador);
	}

	//Métodos que vão interagir com a parte visual
	//
	private Funcao detectarFuncao(String texto) {
		if ("Adicionar".equals(texto)) {
			return Funcao.ADICIONAR;
		} else if ("Consultar".equals(texto)) {
			return Funcao.CONSULTAR;
		} else if ("Alterar".equals(texto)) {
			return Funcao.ALTERAR;
		} else if ("Vender".equals(texto)) {
			return Funcao.VENDER;
		}
		return null;
	}//DetectarFuncao
	
	public void processarFuncao(String texto) throws SQLException {

		Funcao funcao = detectarFuncao(texto);

		if (funcao == Funcao.ADICIONAR) {
			marca = JOptionPane.showInputDialog(null, "Digite a marca do skate para registrar");
			qtde = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de produtos a serem registrados"));
			new Skate(id, marca, qtde);
			cod.inserirDados(marca, qtde);
			
		} else if (funcao == Funcao.CONSULTAR) {
			cod.consultarDados();
			
		} else if (funcao == Funcao.ALTERAR) {
			cod.consultarDados();
			id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID do skate:"));
			marca = JOptionPane.showInputDialog(null, "Digite a nova marca do skate:");
			qtde = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a nova quantidade de itens que ainda existem:"));
			cod.alterarDados(id, marca, qtde);
			
		} else if (funcao == Funcao.VENDER) {
			cod.excluirDados();
			
		}
	}//ProcessarFuncao
	//
	//Fim dos métodos que interagem com a parte visual
}
