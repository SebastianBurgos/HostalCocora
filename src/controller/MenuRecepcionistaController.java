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
    	aplicacion.mostrarVentanaHabitaciones();
    }

    @FXML
    void mostrarReservas(ActionEvent event) {
    	aplicacion.mostrarVentanaReservas();
    }

    @FXML
    void mostrarCamas(ActionEvent event) {
    	aplicacion.mostrarVentanaCamas();
    }

    @FXML
    void mostrarClientes(ActionEvent event) {
    	aplicacion.mostrarVentanaClientes();
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
