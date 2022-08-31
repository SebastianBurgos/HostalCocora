package model;

import java.util.ArrayList;

public class Cliente {
	private String cedula;
	private String telefono;
	private String email;

	private ArrayList<Reserva> listaReservas;

	public Cliente(String cedula, String telefono, String email) {
		super();
		this.cedula = cedula;
		this.telefono = telefono;
		this.email = email;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<Reserva> getListaReservas() {
		return listaReservas;
	}

	public void setListaReservas(ArrayList<Reserva> listaReservas) {
		this.listaReservas = listaReservas;
	}


}
