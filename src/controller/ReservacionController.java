package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Aplicacion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ReservacionController {
	Aplicacion aplicacion;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void mostrarVentanaDisponibilidad(ActionEvent event) {
    	aplicacion.abrirVentanaHabitacionesDisponibles();
    }

    @FXML
    void mostrarVentanaLogin(ActionEvent event) {
    	aplicacion.abrirLoginCliente();
    }

	public void setAplicacion(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;
	}

    @FXML
    void initialize() {

    }
}
