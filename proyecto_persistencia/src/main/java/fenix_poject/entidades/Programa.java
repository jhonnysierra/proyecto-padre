package fenix_poject.entidades;

import java.io.Serializable;



import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * Clase encargada de representar un programa
 * @author Jhonny_Jorge_Javier
 * @version 1.0 16-agosto-2018
 *
 */

@Entity
public class Programa implements Serializable {
	/**
	 * Permite identificar de forma unica un programa
	 */

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Identificador de un programa
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	private int identificador;

	/**
	 * nombre de un programa
	 */
	@Column(name = "APLICACION", length = 100, unique=true)
	@NotNull
	@NotBlank
	private String nombre;

	/**
	 * descripcion de un programa
	 */
	@Column(name = "FUNCIONAMIENTO")
	private String descripcion;

	/**
	 * version de un programa
	 */
	private String version;

	/**
	 * Metodo constructor de la clase Programa
	 */
	public Programa() {
		super();
	}

	/**
	 * Metodo get atributo identificador clase Programa
	 */
	public int getIdentificador() {
		return identificador;
	}

	/**
	 * Metodo set atributo identificador clase Programa
	 * 
	 * @param identificador
	 */
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	/**
	 * Metodo get atributo nombre clase Programa
	 * 
	 * @return nombre de un programa
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo set atributo nombre clase Programa
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo get atributo descripcion clase Programa
	 * 
	 * @return descripcion de un programa
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Metodo set atributo descripcion clase Programa
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Metodo get atributo version clase Programa
	 * 
	 * @return version de un programa
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Metodo set atributo version clase Programa
	 * 
	 * @param version
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/*
	 * Metodo hashcode clase Programa
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + identificador;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
		return result;
	}

	/*
	 * Metodo equals clase Programa
	 * 
	 */
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
		if (identificador != other.identificador)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (version == null) {
			if (other.version != null)
				return false;
		} else if (!version.equals(other.version))
			return false;
		return true;
	}

}
