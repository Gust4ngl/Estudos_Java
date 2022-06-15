package basico;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PrimeiroFX extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {

		Button botaoA = new Button("A");
		Button botaoB = new Button("B");
		Button botaoC = new Button("C");
		
		botaoC.setOnAction(e -> System.exit(0));
		botaoB.setOnAction(e -> System.out.println("B"));
		botaoA.setOnAction(e -> System.out.println("A"));
		
		HBox vbox = new HBox();
		vbox.setSpacing(5);
		vbox.setAlignment(Pos.CENTER);
		vbox.getChildren().add(botaoA);
		vbox.getChildren().add(botaoB);
		vbox.getChildren().add(botaoC);
		
		Scene principal = new Scene(vbox, 100, 150);
		
		primaryStage.setScene(principal);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	
}
