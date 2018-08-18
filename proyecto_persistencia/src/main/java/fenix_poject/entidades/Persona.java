package fenix_poject.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Clase encargada de representar la informacion de una persona
 * @author Jhonny_Jorge
 * @version 1.0 16-agosto-2018
 *
 */
@Entity

public class Persona implements Serializable {

	/**
	 * Permite identificar de forma unica a la persona
	 */   
	@Id
	/**
	 * Permite identificar una persona
	 */
	private String cedula;
	/**
	 * Nombre una persona
	 */
	private String nombre;
	/**
	 * Apellido de una persona
	 */
	private String apellido;
	/**
	 * Edad de una persona
	 */
	private int edad;
	
	@ElementCollection
	private List<String> telefonos;
	
	private Date fecha;
	private static final long serialVersionUID = 1L;

	public Persona() {
		super();
	}   
	public String getCedula() {
		return this.cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}   
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}   
	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}   
	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}   
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + ((cedula == null) ? 0 : cedula.hashCode());
		return result;
	}
	
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
