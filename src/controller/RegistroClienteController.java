package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

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
    private PasswordField contraseņa1111;

    @FXML
    private PasswordField contraseņa1;

    @FXML
    private PasswordField contraseņa11;

    @FXML
    private TextField nombreUsuario;

    @FXML
    private PasswordField contraseņa111;

    @FXML
    private PasswordField contraseņa;

    @FXML
    void mensajeRegistro(ActionEvent event) {
    	JOptionPane.showMessageDialog(null, "REGISTRADO CON EXITO");
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
