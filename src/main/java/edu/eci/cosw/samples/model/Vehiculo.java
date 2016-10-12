package edu.eci.cosw.samples.model;

// Generated Feb 5, 2013 5:52:11 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * AlmVehiculos generated by hbm2java
 */
@Entity
@Table(name = "ALM_VEHICULOS" )
public class Vehiculo implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 328754985741161521L;
	private String placa;
	private int capacidad;	

	public Vehiculo() {
	}

	public Vehiculo(String placa, int capacidad) {
		this.placa = placa;
		this.capacidad = capacidad;
	}

	@Id
	@Column(name = "placa", unique = true, nullable = false, length = 6)
	public String getPlaca() {
		return this.placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@Column(name = "capacidad", nullable = false)
	public int getCapacidad() {
		return this.capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

}
