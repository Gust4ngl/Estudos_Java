package br.com.gusta.cm.visao;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import br.com.gusta.cm.excecao.ExplosaoException;
import br.com.gusta.cm.excecao.SairException;
import br.com.gusta.cm.modelo.Tabuleiro;

public class TabuleiroConsole {

	private Tabuleiro tabuleiro;
	private Scanner ler = new Scanner(System.in);

	public TabuleiroConsole(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;

		executarJogo();
	}// construtor

	private void executarJogo() {
		try {
			boolean continuar = true;

			while (continuar) {
				cicloDoJogo();

				System.out.println("Jogar Novamente? S/n");
				String resposta = ler.next();

				if ("n".equalsIgnoreCase(resposta)) {
					continuar = false;
				} else {
					tabuleiro.reiniciar();
				}
			} /// while
		} catch (SairException e) {
			System.out.println("Você saiu do jogo");
		} finally {
			ler.close();
		} // try, catch, finally

	}// executarJogo

	private void cicloDoJogo() {

		try {

			while (!tabuleiro.objetivoAlcancado()) {
				System.out.println(tabuleiro);

				String digitado = capturarValorDigitado("Digite (x, y): ");
				Iterator<Integer> xy = Arrays.stream(digitado.split(","))
					.map(e -> Integer.parseInt(e.trim())).iterator();
				
				digitado = capturarValorDigitado("1 - abrir 2 - (Des)marcar: ");
				
				if ("1".equals(digitado)) {
					tabuleiro.abrir(xy.next(), xy.next());
				} else if ("2".equals(digitado)) {
					tabuleiro.alternarMarcacao(xy.next(), xy.next());
					
				}
			
			}
			
			System.out.println(tabuleiro);
			System.out.println("Você venceu");
		} catch (ExplosaoException e) {
			System.out.println(tabuleiro);
			System.out.println("Fim de Jogo");
		}

	}// ciclo do jogo

	private String capturarValorDigitado(String texto) {
		System.out.print(texto);
		String digitado = ler.next();

		if ("sair".equalsIgnoreCase(digitado)) {
			throw new SairException();
		}
		return digitado;
	}// capturar Valor Digitado

}
