
/**
 * 
 * @author Blanca 
 *
 */
public class Alumno {
private String nombre;
private String edad;
private String telefono; 
private String apellidoPaterno; 
private String apellidoMaterno; 
private String direccion; 
private String escuela; 
private String estadoCivil;
private String municipio; 
private String estado; 

/**
 * metodo vacio por seguridad
 */
	public Alumno(){}
/**
 * Constructor que recibe 10 parametros
 * @param nombre tipo String
 * @param edad tipo String
 * @param telefono tipo String
 * @param apellidoPaterno tipo String
 * @param apellidoMaterno tipo String
 * @param direccion tipo String
 * @param escuela tipo String
 * @param estadoCivil tipo String 
 * @param municipio tipo String
 * @param estado tipo String 
 */
	public Alumno(String nombre, String edad, String telefono,String apellidoPaterno, String apellidoMaterno, String direccion, String escuela, String estadoCivil,
			String municipio, String estado) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.telefono = telefono;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.direccion = direccion;
		this.escuela = escuela;
		this.estadoCivil = estadoCivil;
		this.municipio = municipio;
		this.estado = estado;
	}

	/**
	 * 
	 * @param Introduce el nombre de la persona en formato String
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * 
	 * @param Introduce la edad de la persona en formato String
	 */
	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}
	/**
	 * 
	 * @param Introduce el teléfono de la persona en formato String
	 */
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	/**
	 * 
	 * @param Introduce el apellido paterno de la persona en formato String
	 */

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	/**
	 * 
	 * @param Introduce el apellido materno de la persona en formato String
	 */

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	/**
	 * 
	 * @param Introduce la dirección de la persona en formato String
	 */
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * 
	 * @param Introduce el nombre de la escuela de la persona en formato String
	 */

	public String getEscuela() {
		return escuela;
	}

	public void setEscuela(String escuela) {
		this.escuela = escuela;
	}
	/**
	 * 
	 * @param Introduce el estado civil de la persona en formato String
	 */
	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	/**
	 * 
	 * @param Introduce el nombre del municipio de la persona en formato String
	 */

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
/**
 * 
 * @param Introduce el estado de la persona en formato String
 */
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	


}
