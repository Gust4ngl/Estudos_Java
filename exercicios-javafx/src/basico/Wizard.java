package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Wizard extends Application {
	
	private Stage janela;
	private Scene cena1;
	private Scene cena2;
	private Scene cena3;
	
	public void start(Stage primaryStage) throws Exception {
		
		janela = primaryStage;
		
		criarCena1();
		criarCena2();
		criarCena3();
		
		primaryStage.setScene(cena1);
		primaryStage.setTitle("Wizard");
		primaryStage.show();
		
	}
	
	private void criarCena1() {
		Button proximaCena = new Button(">");
		proximaCena.setOnAction(e -> {
			janela.setScene(cena2);
		});
		
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER_RIGHT);
		box.getChildren().add(proximaCena);
		cena1 = new Scene(box, 400, 400);
		
	}
	
	private void criarCena2() {
		Button proximaCena = new Button(">");
		proximaCena.setOnAction(e -> {
			janela.setScene(cena3);
			});
		Button cenaAnterior = new Button("<");
		cenaAnterior.setOnAction(e -> {
			janela.setScene(cena1);
		});
		
		HBox box = new HBox();
		box.setSpacing(350);
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(cenaAnterior);
		box.getChildren().add(proximaCena);
		cena2 = new Scene(box, 400, 400);
		
	}
	
	private void criarCena3() {
		Button cenaAnterior = new Button("<");
		cenaAnterior.setOnAction(e -> {
			janela.setScene(cena2);
		});
		
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER_LEFT);
		box.getChildren().add(cenaAnterior);
		cena3 = new Scene(box, 400, 400);
		
	}

	public static void main(String[] args) {
		launch(args);
	}
	
}
