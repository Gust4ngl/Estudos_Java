package layout;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Quadrado extends Rectangle {

	private static int i = 0;
	private String[] cores = {
		"c33c5e", "39aac6"
	};
	
	public Quadrado() {
		this(100, 100);
	}
	
	public Quadrado(int altura, int largura) {
		
		setHeight(altura);
		setWidth(largura);
		
		setFill(Color.web(cores[i]));
		i++;
		if(i == 2) i = 0;
	}
		
}
