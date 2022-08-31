package application;

import controller.BienvenidaController;
import controller.ConfirmacionPagoController;
import controller.HabitacionesDisponiblesController;
import controller.LoginClienteController;
import controller.MenuRecepcionistaController;
import controller.ReservacionController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import model.Hostal;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class Aplicacion extends Application {
	private Stage primaryStage;
	Hostal hostal = new Hostal("Hostels Cocora");

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Hostels Cocora");
		this.primaryStage.setResizable(false);
		mostrarVentanaBienvenida();

	}

	public void mostrarVentanaBienvenida() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Aplicacion.class.getResource("/view/BienvenidaView.fxml"));

			AnchorPane rootLayout = (AnchorPane)loader.load();

			BienvenidaController bienvenidaController = loader.getController();
			bienvenidaController.setAplicacion(this);

			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}


	public void abrirLoginCliente() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Aplicacion.class.getResource("/view/LoginClienteView.fxml"));

			AnchorPane rootLayout = (AnchorPane)loader.load();

			LoginClienteController loginClienteController = loader.getController();
			loginClienteController.setAplicacion(this);

			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void abrirMenuRecepcionista() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Aplicacion.class.getResource("/view/MenuRecepcionistaView.fxml"));

			AnchorPane rootLayout = (AnchorPane)loader.load();

			MenuRecepcionistaController menuRecepcionistaController = loader.getController();
			menuRecepcionistaController.setAplicacion(this);

			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void mostrarVentanaReservacion() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Aplicacion.class.getResource("/view/ReservacionView.fxml"));

			AnchorPane rootLayout = (AnchorPane)loader.load();

			ReservacionController reservacionController = loader.getController();
			reservacionController.setAplicacion(this);

			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void abrirVentanaHabitacionesDisponibles() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Aplicacion.class.getResource("/view/HabitacionesDisponiblesView.fxml"));

			AnchorPane rootLayout = (AnchorPane)loader.load();

			HabitacionesDisponiblesController habitacionesDisponiblesController = loader.getController();
			habitacionesDisponiblesController.setAplicacion(this);

			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void mostrarVentanaConfirmacionCompra() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Aplicacion.class.getResource("/view/ConfirmacionPagoView.fxml"));

			AnchorPane rootLayout = (AnchorPane)loader.load();

			ConfirmacionPagoController confirmacionPagoController = loader.getController();
			confirmacionPagoController.setAplicacion(this);

			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
