package oo.heran�a;

public class Jogo {
	public static void main(String[] args) {
		Personagens hero = new Hero();
		Personagens enemy = new Enemy();
		
		hero.x = 0;
		hero.y = 1;
		
		enemy.x = 1;
		enemy.y = 0;
		
		System.out.println("A vida inicial de hero �: " + hero.hp);
		System.out.println("A vida inicial de enemy �: " + enemy.hp);
		
		hero.atacar(enemy);// o personagem hero vai atacar enemy ja que os dois estao lado a lado
		System.out.println("A vida de enemy �: " + enemy.hp);//mostrando a vida(HP) do personagem atacado
		
		enemy.atacar(hero);// o personagem enemy vai atacar hero ja que os dois estao lado a lado
		System.out.println("A vida de hero �: " + hero.hp);//mostrando a vida(HP) do personagem atacado
		
	}
	
}
