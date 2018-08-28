package fenix_poject.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Max;


/**
 * Clase encargada de representar la informacion de una persona
 * @author Jhonny_Jorge_Javier
 * @version 1.0 16-agosto-2018
 *
 */

@Entity
public class Persona implements Serializable {

	/**
	 * Permite identificar de forma unica a la persona
	 */
	
	/**
	 * Permite identificar una persona
	 */
	@Id
	@Column (name="CC", length=15)
	private String cedula;
	
	/**
	 * Nombre una persona
	 */
	@Column(length=30)
	private String nombre;
	/**
	 * Apellido de una persona
	 */
	@Column(length=30)
	private String apellido;
	/**
	 * Edad de una persona
	 */
	@Max(50)
	private int edad;
	
	/**
	 * Lista que contiene los telefonos asociados a una persona
	 */
	
	@Column(length=10)
	@ElementCollection
	private List<String> telefonos;
	/*private Map<Integer,String> telefonos;*/
	
	/**
	 * Genero de una persona 
	 */
	@Column (length=9)
	@Enumerated(EnumType.STRING)
	private Genero genero;
	
	/**
	 * Fecha de nacimiento de una persona 
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * Clase enumeracion que contiene las opciones para genero de una persona 
	 *
	 */
	private enum Genero{
		masculino, femenino;
	}

	/**
	 * Metodo constructor de la clase Persona 
	 */
	public Persona() {
		super();
	}  
	
	/**
	 * Metodo get de cedula 
	 */
	public String getCedula() {
		return this.cedula;
	}

	/**
	 * Metodo get de cedula 
	 */
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	/**
	 * Metodo get de nombre 
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Metodo set de nombre 
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Metodo get de apellido 
	 */	
	public String getApellido() {
		return this.apellido;
	}

	/**
	 * Metodo set de apellido 
	 */	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	/**
	 * Metodo get de edad 
	 */	
	public int getEdad() {
		return this.edad;
	}

	/**
	 * Metodo set de edad 
	 */	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/**
	 * Metodo get de fecha 
	 */	
	public Date getFecha() {
		return this.fecha;
	}

	/**
	 * Metodo set de fecha 
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	/**
	 * Metodo hashCode cedula 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + ((cedula == null) ? 0 : cedula.hashCode());
		return result;
	}
	
	/**
	 * Metodo equals Persona 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (cedula == null) {
			if (other.cedula != null)
				return false;
		} else if (!cedula.equals(other.cedula))
			return false;
		if (edad != other.edad)
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
	
   
}
