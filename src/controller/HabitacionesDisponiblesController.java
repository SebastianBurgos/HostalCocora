package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Aplicacion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class HabitacionesDisponiblesController {
	Aplicacion aplicacion;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void reservarHabitacion(ActionEvent event) {
    	aplicacion.mostrarVentanaConfirmacionCompra();
    }

    @FXML
    void mostrarVentanaReserva(ActionEvent event) {
    	aplicacion.mostrarVentanaReservacion();
    }

    @FXML
    void initialize() {

    }

	public void setAplicacion(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;
	}
}
