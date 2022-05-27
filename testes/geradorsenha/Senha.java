package br.com.gust4.geradorsenha;

public class Senha {

	private String[] caracteres = {"0", "1", "b", "2", "4", "5", "6", "7", "8",
            "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
            "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w",
            "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I",
            "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U",
            "V", "W", "X", "Y", "Z", "!", "@", "#", "$", "%", "&", "*",
            "(", ")", "-", "=", "_", "+"};
	
	private StringBuilder senha = new StringBuilder();
	private int tamanho = 15;
	
	private String gerarSenha() {
		for (int i = 0; i < tamanho; i++) {
			int posicao = (int) (Math.random() * caracteres.length);
			senha.append(caracteres[posicao]);
		}
		return senha.toString();
	}
	
	public static void main(String[] args) {

		Senha password = new Senha();
		System.out.println(password.gerarSenha());
		
	}

}
