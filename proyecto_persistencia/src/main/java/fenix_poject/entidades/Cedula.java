/**
 * 
 */
package fenix_poject.entidades;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Clase que representa un documento de identidad de una persona
 * 
 * @author Jhonny_Jorge_Javier
 * @version 1.0 23-agosto-2018
 */
@Entity
public class Cedula implements Serializable {

	/**
	 * SerialVersion Clase Cedula
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Numero de la cedula de una persona
	 */
	@Id
	@Column(length = 10, unique = true)
	@NotNull
	@NotBlank
	@Size(max = 10)
	private String numero;

	/**
	 * Apellidos de una persona
	 */
	@Column(length = 80,nullable=false)
	@NotNull
	@NotBlank
	@Size(max = 80)
	private String apellidos;

	/**
	 * Nombres de una persona
	 */
	@Column(length = 80,nullable=false)
	@NotNull
	@NotBlank
	@Size(max = 80)
	private String nombres;

	/**
	 * Fecha de nacimiento de una persona
	 */
	@Temporal(TemporalType.DATE)
	@NotNull
	@NotBlank
	@Column(name = "FECHA_NACI")
	private Date fecha_nacimiento;

	/**
	 * Lugar de nacimiento de una persona
	 */
	@Column(name = "CIUDAD_NACI", length = 50)
	@Size(max = 50)
	@NotNull
	@NotBlank
	private String lugar_nacimiento;

	/**
	 * Estatura de una persona
	 */
	@Column(length = 3)
	@NotNull
	@NotBlank
	private double estatura;

	/**
	 * Tipo de sangre de una persona
	 */
	@Column(name="TI_SANGRE",length = 2)
	@Size(min = 2, max = 2)
	@NotNull
	@NotBlank
	private char tipo_sangre;
	
	
	
	/**
	 * Clase enumeracion que contiene las opciones para genero de una persona 
	 *
	 */
	private enum Genero{
		masculino, femenino;
	}
	
	
	/**
	 * Genero de una persona
	 */
	private Genero genero;
	

	
	/**
	 * Fecha de expediccion de la cedula
	 */

	@Temporal(TemporalType.DATE)
	@NotNull
	@NotBlank
	@Column(name = "FECHA_EXPE")
	private Date fecha_expediccion;
	
	/**
	 * Lugar de expediccion de la cedula
	 */
	@Column(name = "LUGAR_EXPE")
	@NotNull
	@NotBlank
	private String lugar_expediccion;
	
	
	/**
	 * Fotografia de la cedula de un persona
	 * ¿Como poner el tipo de dato medium?
	 */
	@Size
	private Byte[] foto;


	/**
	 * Metodo get numero de la Cedula
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}


	/**
	 * Metodo set numero de la Cedula
	 * @param numero
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}


	/**
	 * Metodo get apellidos de la Persona
	 * @return apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}


	/**
	 * Metodo set apellidos de la Persona
	 * @param apellidos
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	/**
	 * Metodo get nombres de la Persona
	 * @return nombres
	 */
	public String getNombres() {
		return nombres;
	}


	/**
	 * Metodo set nombres Persona
	 * @param nombres
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	/**
	 * Metodo get Fecha de nacimiento 
	 * @return fecha_nacimiento
	 */
	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}


	/**
	 * Metodo set fecha de nacimiento de la Persona
	 * @param fecha_nacimiento
	 */
	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}


	/**
	 * Metodo get Lugar de nacimiento de una Persona
	 * @return the lugar_nacimiento
	 */
	public String getLugar_nacimiento() {
		return lugar_nacimiento;
	}


	/**
	 * Metodo set Lugar de nacimiento de una Persona
	 * @param lugar_nacimiento
	 */
	public void setLugar_nacimiento(String lugar_nacimiento) {
		this.lugar_nacimiento = lugar_nacimiento;
	}


	/**
	 * Metodo get estatura de una persona
	 * @return estatura
	 */
	public double getEstatura() {
		return estatura;
	}


	/**
	 * Metodo set estatura de una persona
	 * @param estatura
	 */
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}


	/**
	 * Metodo get tipo de sangre de una persona
	 * @return tipo_sangre
	 */
	public char getTipo_sangre() {
		return tipo_sangre;
	}


	/**
	 * Metodo set tipo de sangre de una persona
	 * @param tipo_sangre
	 */
	public void setTipo_sangre(char tipo_sangre) {
		this.tipo_sangre = tipo_sangre;
	}


	/**
	 * Metodo get Genero de una persona
	 * @return genero
	 */
	public Genero getGenero() {
		return genero;
	}


	/**
	 * Metodo set Genero de una persona
	 * @param genero
	 */
	public void setGenero(Genero genero) {
		this.genero = genero;
	}


	/**
	 * Metodo get fecha de expediccion de la cedula
	 * @returnfecha_expediccion
	 */
	public Date getFecha_expediccion() {
		return fecha_expediccion;
	}


	/**
	 * Metodo set fecha de expediccion de la cedula
	 * @param fecha_expediccion
	 */
	public void setFecha_expediccion(Date fecha_expediccion) {
		this.fecha_expediccion = fecha_expediccion;
	}


	/**
	 * Metodo get lugar de expediccion de la cedula
	 * @return the lugar_expediccion
	 */
	public String getLugar_expediccion() {
		return lugar_expediccion;
	}


	/**
	 * Metodo set lugar de expediccion de la cedula
	 * @param lugar_expediccion
	 */
	public void setLugar_expediccion(String lugar_expediccion) {
		this.lugar_expediccion = lugar_expediccion;
	}


	/**
	 * Metodo get foto de la cedula de la persona
	 * @return foto
	 */
	public Byte[] getFoto() {
		return foto;
	}


	/**
	 * Metodo set foto de la cedula de la persona
	 * @param foto
	 */
	public void setFoto(Byte[] foto) {
		this.foto = foto;
	}


	/**
	 * Metodo hashcode clase Cedula
	 * 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		long temp;
		temp = Double.doubleToLongBits(estatura);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((fecha_expediccion == null) ? 0 : fecha_expediccion.hashCode());
		result = prime * result + ((fecha_nacimiento == null) ? 0 : fecha_nacimiento.hashCode());
		result = prime * result + Arrays.hashCode(foto);
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + ((lugar_expediccion == null) ? 0 : lugar_expediccion.hashCode());
		result = prime * result + ((lugar_nacimiento == null) ? 0 : lugar_nacimiento.hashCode());
		result = prime * result + ((nombres == null) ? 0 : nombres.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + tipo_sangre;
		return result;
	}


	/** 
	 * Metodo equals clase Cedula
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
		Cedula other = (Cedula) obj;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (Double.doubleToLongBits(estatura) != Double.doubleToLongBits(other.estatura))
			return false;
		if (fecha_expediccion == null) {
			if (other.fecha_expediccion != null)
				return false;
		} else if (!fecha_expediccion.equals(other.fecha_expediccion))
			return false;
		if (fecha_nacimiento == null) {
			if (other.fecha_nacimiento != null)
				return false;
		} else if (!fecha_nacimiento.equals(other.fecha_nacimiento))
			return false;
		if (!Arrays.equals(foto, other.foto))
			return false;
		if (genero != other.genero)
			return false;
		if (lugar_expediccion == null) {
			if (other.lugar_expediccion != null)
				return false;
		} else if (!lugar_expediccion.equals(other.lugar_expediccion))
			return false;
		if (lugar_nacimiento == null) {
			if (other.lugar_nacimiento != null)
				return false;
		} else if (!lugar_nacimiento.equals(other.lugar_nacimiento))
			return false;
		if (nombres == null) {
			if (other.nombres != null)
				return false;
		} else if (!nombres.equals(other.nombres))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (tipo_sangre != other.tipo_sangre)
			return false;
		return true;
	}
	
	
}
