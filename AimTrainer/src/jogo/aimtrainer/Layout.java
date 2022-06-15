package jogo.aimtrainer;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Layout extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		Scene principal = new Scene(new PainelAlvos());
		
		primaryStage.setScene(principal);
		primaryStage.setTitle("Treino de Mira");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	
}
