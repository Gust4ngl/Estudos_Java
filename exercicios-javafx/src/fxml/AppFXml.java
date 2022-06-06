package fxml;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AppFXml extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
	
		String arquivoCSS = getClass().getResource("/fxml/Login.css").toExternalForm();
		
		URL arquivoFXml = getClass().getResource("/fxml/Login.fxml");
		GridPane raiz = FXMLLoader.load(arquivoFXml);
		
		Scene cena = new Scene(raiz, 350, 350);
		cena.getStylesheets().add(arquivoCSS);
		
		primaryStage.setResizable(false);
		primaryStage.setTitle("Tela de login");
		primaryStage.setScene(cena);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}


}
