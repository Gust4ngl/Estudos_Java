package game;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		int hpPlayer = 100, hpInimigo = 50;
		int corteHorizontal = 10, corteVertical = 25;
		String armaPlayer = "Espada";
		int ataquePlayer = 0;
		int op = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Seja bem vindo jogador!");
		System.out.println("Oque voc� deseja fazer?");
		System.out.println(
				"1 -Ir para tutorial\t 2 - Ir para o campo de batalha\t 3 - Ir para a lojinha do seu z�\t 4 - Ver suas estatisticas");
		op = scan.nextInt();

		switch (op) {
		case 1:
			System.out.println("Bem vindo ao tutorial, bem primeiro vamos come�ar explicando como voc� ira atacar os mobs que vierem em sua dire��o");
			System.out.println("Quando um inimigo aparecer, um contador com a sua vida e a vida do inimigo aparecera na sua tela");
			System.out.println("logo em seguida � s� escolher qual dos ataques voc� quer executar e pronto.");

			while (hpPlayer > 0 && hpInimigo > 0) {
				System.out.println("================================================");
				System.out.println("HP player: " + hpPlayer + "\nHP inimigo: " + hpInimigo);
				System.out.println("================================================");
				System.out.println("Ataques: 1 - Corte horizontal 2 - Corte vertical");
				System.out.println("================================================");
				ataquePlayer = scan.nextInt();

				switch (ataquePlayer) {
				case 1:
					System.out.println("Voc� usou corte horizontal, o dano foi de" + corteHorizontal);
					hpInimigo -= corteHorizontal;
					break;
				case 2:
					System.out.println("Voc� usou corte horizontal, o dano foi de" + corteVertical);
					hpInimigo -= corteVertical;
					break;
				default:
					break;
				}// switch
			} // while (turorial de combate)
			System.out.println("Inimigo derrotado! parab�ns");
			break;

		default:
			break;
		}
	}// public static void

}// public class
