package oo.herança;

public class Personagens {
	int hp = 100;
	int x;
	int y;

	boolean andar(Direcao d) {

		switch (d) {
		case NORTE:
			y++;
			break;
		case SUL:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case OESTE:
			x--;
			break;
		default:
			break;
		}

		return true;
	}// andar

	boolean atacar(Personagens oponente) {
		int deltaX = x;
		int deltaY = y;

		if (deltaX == 0 && deltaY == 1) {
			oponente.hp -= 10;
			return true;
		} else if (deltaX == 1 && deltaY == 0) {
			oponente.hp -= 10;
			return true;
		} else {
			return false;
		}

	}// atacar
}
