package model;

import java.util.ArrayList;

public class Habitacion {
	private Integer codigo_habitacion;
	private String estado_habitacion;
	private String tipo_habitacion;
	private String estado_baño;
	private String telefono;
	private String estado_telefono;
	private String estado_internet;
	private Integer codigo_parqueadero;

	private ArrayList<Cama> listaCamas;
	private Cama camaExtra;

	public Habitacion(Integer codigo_habitacion, String estado_habitacion, String tipo_habitacion, String estado_baño,
			String telefono, String estado_telefono, String estado_internet, Integer codigo_parqueadero) {
		super();
		this.codigo_habitacion = codigo_habitacion;
		this.estado_habitacion = estado_habitacion;
		this.tipo_habitacion = tipo_habitacion;
		this.estado_baño = estado_baño;
		this.telefono = telefono;
		this.estado_telefono = estado_telefono;
		this.estado_internet = estado_internet;
		this.codigo_parqueadero = codigo_parqueadero;
	}

	public Integer getCodigo_habitacion() {
		return codigo_habitacion;
	}

	public void setCodigo_habitacion(Integer codigo_habitacion) {
		this.codigo_habitacion = codigo_habitacion;
	}

	public String getEstado_habitacion() {
		return estado_habitacion;
	}

	public void setEstado_habitacion(String estado_habitacion) {
		this.estado_habitacion = estado_habitacion;
	}

	public String getTipo_habitacion() {
		return tipo_habitacion;
	}

	public void setTipo_habitacion(String tipo_habitacion) {
		this.tipo_habitacion = tipo_habitacion;
	}

	public String getEstado_baño() {
		return estado_baño;
	}

	public void setEstado_baño(String estado_baño) {
		this.estado_baño = estado_baño;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEstado_telefono() {
		return estado_telefono;
	}

	public void setEstado_telefono(String estado_telefono) {
		this.estado_telefono = estado_telefono;
	}

	public String getEstado_internet() {
		return estado_internet;
	}

	public void setEstado_internet(String estado_internet) {
		this.estado_internet = estado_internet;
	}

	public Integer getCodigo_parqueadero() {
		return codigo_parqueadero;
	}

	public void setCodigo_parqueadero(Integer codigo_parqueadero) {
		this.codigo_parqueadero = codigo_parqueadero;
	}

	public ArrayList<Cama> getListaCamas() {
		return listaCamas;
	}

	public void setListaCamas(ArrayList<Cama> listaCamas) {
		this.listaCamas = listaCamas;
	}

	public Cama getCamaExtra() {
		return camaExtra;
	}

	public void setCamaExtra(Cama camaExtra) {
		this.camaExtra = camaExtra;
	}


}
