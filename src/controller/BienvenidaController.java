package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Aplicacion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class BienvenidaController {
	Aplicacion aplicacion = new Aplicacion();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void ingresarLogin(ActionEvent event) {
    	aplicacion.abrirLogin();
    }

    @FXML
    void initialize() {

    }
}
