package fxml;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {

	@FXML
	private TextField EmailField;
	@FXML
	private PasswordField SenhaField;
	
	public void entrar() {
		System.out.println(EmailField.getText());
		System.out.println(SenhaField.getText());
	}
	
}
