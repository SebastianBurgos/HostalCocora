package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Aplicacion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ReservasController {
	Aplicacion aplicacion;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void abrirHabitacion(ActionEvent event) {
    	aplicacion.abrirVentanaHabitacionEjemplo();
    }

    @FXML
    void mostrarMenuRecepcionista(ActionEvent event) {
    	aplicacion.abrirMenuRecepcionista();
    }

    @FXML
    void initialize() {

    }

	public void setAplicacion(Aplicacion aplicacion) {
		// TODO Auto-generated method stub
		this.aplicacion = aplicacion;
	}
}
