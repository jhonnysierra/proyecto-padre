package fenix_poject.entidades;

import java.io.Serializable;

/**
 * Clase que contiene los atributos que son llave compuesta de la clase PuntoPlaneta
 * @author Jhonny_Jorge
 * @version 1.0 16-agosto-2018
 *
 */
public class Llave implements Serializable{

	/**
	 * Atributo Serial para clase Llave
	 */
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * longitud de un punto en el planeta
	 * */
	private double longitud;
	
	/**
	 * Latitud de un punto en el planeta
	 * */
	private double latitud;
	
	/**
	 * Metodo constructor clase Llave 
	 */
	public Llave() {
		super();
	} 

	/**
	 * Metodo get atributo longitud clase Llave
	 * @return longitud
	 */
	public double getLongitud() {
		return longitud;
	}

	/**
	 * Metodo set atributo longitud clase Llave
	 * @param longitud
	 */
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	/**
	 * Metodo get atributo latitud clase Llave
	 * @return latitud
	 */
	public double getLatitud() {
		return latitud;
	}

	/**
	 * Metodo set atributo latitud clase Llave
	 * @param latitud
	 */
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	/**
	 * Metodo get atributo serialVersionUID clase Llave
	 * @return serialVersionUID
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * Metodo hashcode clase Llave
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
		return result;
	}
	
	/**
	 * Metodo equals clase Llave
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Llave other = (Llave) obj;
		if (Double.doubleToLongBits(latitud) != Double.doubleToLongBits(other.latitud))
			return false;
		if (Double.doubleToLongBits(longitud) != Double.doubleToLongBits(other.longitud))
			return false;
		return true;
	}

	
	
}
