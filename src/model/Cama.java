package model;

public class Cama {
	private Integer codigo_cama;
	private String disponibilidad;
	private String tipo_cama;
	private String estado_cama;

	public Cama(Integer codigo_cama, String disponibilidad, String tipo_cama, String estado_cama) {
		super();
		this.codigo_cama = codigo_cama;
		this.disponibilidad = disponibilidad;
		this.tipo_cama = tipo_cama;
		this.estado_cama = estado_cama;
	}

	public Integer getCodigo_cama() {
		return codigo_cama;
	}

	public void setCodigo_cama(Integer codigo_cama) {
		this.codigo_cama = codigo_cama;
	}

	public String getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public String getTipo_cama() {
		return tipo_cama;
	}

	public void setTipo_cama(String tipo_cama) {
		this.tipo_cama = tipo_cama;
	}

	public String getEstado_cama() {
		return estado_cama;
	}

	public void setEstado_cama(String estado_cama) {
		this.estado_cama = estado_cama;
	}

}
