package miPackage;

/**
 * Clase Persona. 
 * Esta implementación de la clase Persona es muy sencilla. 
 * Tiene como atributos al nombre (String) y al dni (int). 
 * Tiene como métodos a los getters y setters de sus atributos, un constructor parametrizado con sus dos argumentos y la sobreescritura de la clase toString. 
 * @author Fabian
 *
 */
public class Persona {

	/**
	 * nombre es el nombre de la persona
	 */
	private String nombre;
	
	/**
	 * dni es el dni de la persona
	 */
	private int dni;
	
	/**
	 * Getter del atributo nombre
	 * @return Se retorna el atributo nombre (String). 
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Setter del atributo nombre
	 * @param nombre nombre es el nombre de la persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Getter del atributo dni
	 * @return Se retorna el atributo dni (int). 
	 */
	public int getDni() {
		return dni;
	}
	/**
	 * Setter del atributo dni
	 * @param dni dni es el dni de la persona
	 */
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	/**
	 * Constructor parametrizado de la clase Persona.
	 * @param nombre es el nombre de la persona
	 * @param dni es el dni de la persona
	 */
	public Persona(String nombre, int dni) {
		this.nombre = nombre;
		this.dni = dni;
	}
	
	/**
	 * Sobreescritura del método toString de la clase Object
	 * @return Se retorna un String con los atributos del vehículo
	 */
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + "]";
	}

}
