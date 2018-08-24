package fenix_poject.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Max;


/**
 * Clase encargada de representar un programa
 * @author Jhonny_Jorge
 * @version 1.0 16-agosto-2018
 *
 */

@Entity
public class Programa implements Serializable{
	/**
	 * Permite identificar de forma unica un programa
	 */
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Identificador de un programa
	 * */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private int identificador;
	
	/**
	 * nombre de un programa
	 * */
	private String nombre;
	
	/**
	 * descripcion de un programa
	 * */
	private String descripcion;
	
	/**
	 * version de un programa
	 * */
	private String version;
	
	/**
	 * Metodo constructor de la clase Programa 
	 */
	public Programa() {
		super();
	} 
	
	
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
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
		Programa other = (Programa) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		return true;
	}
	
	
	
	
}
