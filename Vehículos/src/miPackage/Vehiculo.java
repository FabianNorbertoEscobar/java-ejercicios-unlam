package miPackage;

/**
 * Clase abstracta Vehiculo. 
 * Tiene como atributos a un chofer (Persona) y a los kmRecorridos (double). 
 * Tiene como m�todos a un contructor parametrizado con ambos atributos, el m�todo abstracto cambiarChofer y la sobreescritura del m�todo toString. 
 * @author Fabian
 *
 */
public abstract class Vehiculo {

	/**
	 * chofer es una Persona
	 */
	protected Persona chofer;
	
	/**
	 * kmRecorridos es la cantidad de kil�metros recorridos
	 */
	protected double kmRecorridos;
	
	/**
	 * Constructor parametrizado de la clase abstracta Vehiculo
	 * @param chofer es una Persona
	 * @param kmRecorridos es la cantidad de kil�metros recorridos
	 */
	public Vehiculo(Persona chofer, double kmRecorridos) {
		this.chofer = chofer;
		this.kmRecorridos = kmRecorridos;
	}
	
	/**
	 * M�todo abstracto cambiarChofer
	 * @param chofer es una Persona
	 * @return Se retorna un valor booleano cuyo valor indica si se cambia el chofer
	 */
	public abstract boolean cambiarChofer(Persona chofer);

	/**
	 * Sobreescritura del m�todo toString de la clase Object
	 * @return Se retorna un String con los atributos del veh�culo
	 */
	@Override
	public String toString() {
		return "Vehiculo [chofer=" + chofer + ", kmRecorridos=" + kmRecorridos + "]";
	}
}
