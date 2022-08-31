package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Aplicacion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MenuRecepcionistaController {
	Aplicacion aplicacion;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void mostrarHabitaciones(ActionEvent event) {

    }

    @FXML
    void mostrarReservas(ActionEvent event) {

    }

    @FXML
    void mostrarCamas(ActionEvent event) {

    }

    @FXML
    void mostrarClientes(ActionEvent event) {

    }

    @FXML
    void mostrarVentanaBienvenida(ActionEvent event) {
    	aplicacion.mostrarVentanaBienvenida();
    }

    @FXML
    void initialize() {

    }

	public void setAplicacion(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;
	}
}
