package model;

import java.util.ArrayList;
import java.util.Date;

public class Reserva {
	private Integer codigo_reserva;
	private Date dia_inicio;
	private Integer numero_dias;

	private ArrayList<Habitacion> listaHabitacionesReservadas;

	public Reserva(Integer codigo_reserva, Date dia_inicio, Integer numero_dias) {
		super();
		this.codigo_reserva = codigo_reserva;
		this.dia_inicio = dia_inicio;
		this.numero_dias = numero_dias;
	}

	public Integer getCodigo_reserva() {
		return codigo_reserva;
	}

	public void setCodigo_reserva(Integer codigo_reserva) {
		this.codigo_reserva = codigo_reserva;
	}

	public Date getDia_inicio() {
		return dia_inicio;
	}

	public void setDia_inicio(Date dia_inicio) {
		this.dia_inicio = dia_inicio;
	}

	public Integer getNumero_dias() {
		return numero_dias;
	}

	public void setNumero_dias(Integer numero_dias) {
		this.numero_dias = numero_dias;
	}

	public ArrayList<Habitacion> getListaHabitacionesReservadas() {
		return listaHabitacionesReservadas;
	}

	public void setListaHabitacionesReservadas(ArrayList<Habitacion> listaHabitacionesReservadas) {
		this.listaHabitacionesReservadas = listaHabitacionesReservadas;
	}
}
