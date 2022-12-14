package controller;

import javax.swing.JOptionPane;

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
    private PasswordField contraseņa;

	public void setAplicacion(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;
	}

    @FXML
    void iniciarSesion(ActionEvent event) {
    	JOptionPane.showMessageDialog(null, "INICIO DE SESION EXITOSO");
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
