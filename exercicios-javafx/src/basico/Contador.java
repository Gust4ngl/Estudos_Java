package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {

	private int contador = 0;
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		Label labelTitulo = new Label("Contador");
		labelTitulo.getStyleClass().add("titulo");
		Label labelNumero = new Label("0");
		labelNumero.getStyleClass().add("numero");
		
		Button botaoIncremento = new Button("+");
		botaoIncremento.setOnAction(e -> {
			contador++;
			atualizarCorContador(labelNumero);
		});
		botaoIncremento.getStyleClass().add("botaoIncremento");
		
		Button botaoDecremento = new Button("-");
		botaoDecremento.setOnAction(e -> {
			contador--;
			atualizarCorContador(labelNumero);
		});
		botaoDecremento.getStyleClass().add("botaoDecremento");
		
		
		
		HBox boxBotoes = new HBox();
		boxBotoes.setAlignment(Pos.CENTER);
		boxBotoes.setSpacing(10);
		boxBotoes.getChildren().add(botaoIncremento);
		boxBotoes.getChildren().add(botaoDecremento);
		
		
		VBox boxPrincipal = new VBox();
		boxPrincipal.setAlignment(Pos.CENTER);
		boxPrincipal.getStyleClass().add("conteudo");
		boxPrincipal.getChildren().add(labelTitulo);
		boxPrincipal.getChildren().add(labelNumero);
		boxPrincipal.getChildren().add(boxBotoes);
		
		String css = getClass().getResource("/basico/Contador.css").toExternalForm();
		Scene cenaPrincipal = new Scene(boxPrincipal, 400, 400);
		cenaPrincipal.getStylesheets().add(css);
		cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css2?family=Bebas+Neue");

		primaryStage.setScene(cenaPrincipal);
		primaryStage.show();
		
	}
	
	private void atualizarCorContador(Label label) {
		
		label.setText(Integer.toString(contador));
		
		label.getStyleClass().remove("numeroPositivo");
		label.getStyleClass().remove("numeroNegativo");
		
		if (contador > 0) {
			label.getStyleClass().add("numeroPositivo");
			
		} else if (contador < 0) {
			label.getStyleClass().add("numeroNegativo");
		}
		
	}

	public static void main(String[] args) {
		
		launch(args);
		
	}
	
}
