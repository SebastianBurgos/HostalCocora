package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private SplitMenuButton tipoUsuario;

    @FXML
    private TextField nombreUsuario;

    @FXML
    private PasswordField contraseña;


    @FXML
    void iniciarSesion(ActionEvent event) {

    }


    @FXML
    void initialize() {
        assert tipoUsuario != null : "fx:id=\"tipoUsuario\" was not injected: check your FXML file 'LoginView.fxml'.";
        assert nombreUsuario != null : "fx:id=\"nombreUsuario\" was not injected: check your FXML file 'LoginView.fxml'.";
        assert contraseña != null : "fx:id=\"contraseña\" was not injected: check your FXML file 'LoginView.fxml'.";

    }
}
