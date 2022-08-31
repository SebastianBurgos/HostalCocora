package model;

import java.util.ArrayList;

public class Hostal {
	private String nombre_hostal;

	private ArrayList<Cliente> listaClientes;
	private ArrayList<Habitacion> listaHabitaciones;
	private ArrayList<Reserva> listaReservas;
	private ArrayList<Cama> listaCamas;

	public Hostal(String nombre_hostal) {
		super();
		this.nombre_hostal = nombre_hostal;
	}

	public String getNombre_hostal() {
		return nombre_hostal;
	}

	public void setNombre_hostal(String nombre_hostal) {
		this.nombre_hostal = nombre_hostal;
	}

	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public ArrayList<Habitacion> getListaHabitaciones() {
		return listaHabitaciones;
	}

	public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
		this.listaHabitaciones = listaHabitaciones;
	}

	public ArrayList<Reserva> getListaReservas() {
		return listaReservas;
	}

	public void setListaReservas(ArrayList<Reserva> listaReservas) {
		this.listaReservas = listaReservas;
	}

	public ArrayList<Cama> getListaCamas() {
		return listaCamas;
	}

	public void setListaCamas(ArrayList<Cama> listaCamas) {
		this.listaCamas = listaCamas;
	}


}
