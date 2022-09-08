package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import application.Aplicacion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ClientesController {
	Aplicacion aplicacion;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void mostrarMenuRecepcionista(ActionEvent event) {
    	aplicacion.abrirMenuRecepcionista();
    }

    @FXML
    void registrarCliente(ActionEvent event) {
    	JOptionPane.showMessageDialog(null, "CLIENTE REGISTRADO CON EXITO");
    }

    @FXML
    void initialize() {

    }

	public void setAplicacion(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;
	}
}
