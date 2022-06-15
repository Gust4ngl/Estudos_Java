package jogo.aimtrainer;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Caixa extends HBox {

	private static int i = 0;
	private String[] cores = {
		"c33c5e", "39aac6"
	};
	
	public Caixa() {
		this(100, 100);
	}
	
	public Caixa(int altura, int largura) {
		setAlignment(Pos.CENTER);
		
		setMinHeight(altura);
		setMinWidth(largura);
		
		BackgroundFill fill = new BackgroundFill(Color.web(cores[i]), CornerRadii.EMPTY, Insets.EMPTY);
		setBackground(new Background(fill));
		
		i++;
		if (i == 2) i = 0;
	}
	
	public Caixa comTexto(String texto) {
		Label label = new Label(texto);
		label.setFont(new Font(30));
		getChildren().add(label);
		return this;
	}
	
}
