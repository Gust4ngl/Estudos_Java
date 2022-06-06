package fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {

	@FXML
	private TextField EmailField;
	@FXML
	private PasswordField SenhaField;
	
	public void entrar() {
		boolean emailValido = EmailField.getText().equals("Testes");
		boolean senhaValida = SenhaField.getText().equals("1234");
		
		if(emailValido && senhaValida) {
			Notifications.create().
			position(Pos.TOP_RIGHT).
			title("Login FXML").
			text("Sucesso").
			showInformation();;
				
		} else {
			Notifications.create().
			position(Pos.TOP_RIGHT).
			title("Login FXML").
			text("Falha").
			showError();;
		}
		
	}
	
}
