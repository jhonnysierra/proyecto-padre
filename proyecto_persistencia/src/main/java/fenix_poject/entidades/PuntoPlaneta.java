package fenix_poject.entidades;

import java.io.Serializable;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.IdClass;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * Clase encargada de representar un punto en el planeta
 * @author Jhonny_Jorge_Javier
 * @version 1.0 16-agosto-2018
 *
 */

@Entity
@IdClass(Llave.class)
public class PuntoPlaneta implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Permite identificar de forma unica un punto en el planeta
	 */

	/**
	 * Longitud de un punto en el planeta
	 */
	@Id
	private double longitud;

	/**
	 * Latitud de un punto en el planeta
	 */
	@Id
	private double latitud;

	/**
	 * Nombre de un punto en el planeta
	 */
	@Column(name = "UBICACION", length = 150, unique = true)
	@NotNull
	@NotBlank
	private String nombre;

	/**
	 * Metodo get atributo longitud clase PuntoPlaneta
	 * 
	 * @return
	 */
	public double getLongitud() {
		return longitud;
	}

	/**
	 * Metodo set atributo longitud clase PuntoPlaneta
	 * 
	 * @param longitud
	 */
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	/**
	 * Metodo get atributo latitud clase PuntoPlaneta
	 * 
	 * @return latitud
	 */
	public double getLatitud() {
		return latitud;
	}

	/**
	 * Metodo set atributo latitud clase PuntoPlaneta
	 * 
	 * @param latitud
	 */
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	/**
	 * Metodo get atributo nombre clase PuntoPlaneta
	 * 
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo set atributo nombre clase PuntoPlaneta
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo hashcode clase PuntoPlaneta
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(latitud);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(longitud);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	/**
	 * Metodo equals clase PuntoPlaneta
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PuntoPlaneta other = (PuntoPlaneta) obj;
		if (Double.doubleToLongBits(latitud) != Double.doubleToLongBits(other.latitud))
			return false;
		if (Double.doubleToLongBits(longitud) != Double.doubleToLongBits(other.longitud))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

}
