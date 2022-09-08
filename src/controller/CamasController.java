package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Aplicacion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class CamasController {
	Aplicacion aplicacion;

	   @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

    @FXML
    void mostrarMenuRecepcionista(ActionEvent event) {
    	aplicacion.abrirMenuRecepcionista();
    }

	public void setAplicacion(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;
	}
}
