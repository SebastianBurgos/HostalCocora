package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Aplicacion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegistroClienteController {
	Aplicacion aplicacion;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private PasswordField contrase�a1111;

    @FXML
    private PasswordField contrase�a1;

    @FXML
    private PasswordField contrase�a11;

    @FXML
    private TextField nombreUsuario;

    @FXML
    private PasswordField contrase�a111;

    @FXML
    private PasswordField contrase�a;

    @FXML
    void mensajeRegistro(ActionEvent event) {
    	aplicacion.abrirLoginCliente();
    }

    @FXML
    void mostrarVentanaLoginCliente(ActionEvent event) {
    	aplicacion.abrirLoginCliente();
    }

    @FXML
    void initialize() {

    }

	public void setAplicacion(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;
	}
}
