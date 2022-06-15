package telalogin.controle;

import java.util.List;

import telalogin.infra.UsuarioDAO;
import telalogin.modelo.Usuario;

public class Comandos {

	private UsuarioDAO dao = new UsuarioDAO();
	private List<Usuario> usuarios;
	private Usuario usuario;
	private String user;
	private String senha;
	
	public void registrarUsuario(String nome, String senha) {
		this.user = nome;
		this.senha = senha;
		usuario = new Usuario(nome, senha);
		
		dao.incluirTudo(usuario);
	}
	
	public void fazerLogin(String nome, String senha) {
		try {
			nome = nome.toLowerCase();
			usuario = dao.consultarUm(nome);
			if (nome.equals(usuario.getUser()) && senha.equals(usuario.getSenha())) {
				System.out.println("foi");
			} else if (nome.equals(usuario.getUser()) && senha.equals(usuario.getSenha()) == false) {
				System.out.println("Senha inválida");
			}
		} catch (Exception e) {
			System.out.println("Usuário ou senha inválidos!!!");
		}
	}
	
}
