package controller;

import application.Aplicacion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginClienteController {
	Aplicacion aplicacion;

    @FXML
    private TextField nombreUsuario;

    @FXML
    private PasswordField contraseña;

	public void setAplicacion(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;
	}

    @FXML
    void iniciarSesion(ActionEvent event) {
    	aplicacion.mostrarVentanaReservacion();
    }


    @FXML
    void iniciarRegistro(ActionEvent event) {
    	aplicacion.mostrarVentanaRegistroCliente();
    }

    @FXML
    void mostrarVentanaBienvenida(ActionEvent event) {
    	aplicacion.mostrarVentanaBienvenida();
    }





}
