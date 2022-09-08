package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Aplicacion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class HabitacionesController {
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
    void abrirHabitacion(){
    	aplicacion.abrirVentanaHabitacionEjemplo();
    }

    @FXML
    void initialize() {

    }

	public void setAplicacion(Aplicacion aplicacion) {
		// TODO Auto-generated method stub
		this.aplicacion = aplicacion;
	}
}

