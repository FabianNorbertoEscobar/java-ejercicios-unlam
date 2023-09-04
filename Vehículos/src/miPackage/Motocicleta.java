package miPackage;

/**
 * Clase Motocicleta, hereda de la clase abstracta Vehiculo. 
 * Tiene como atributo a un acompañante (Persona). 
 * Tiene como métodos a dos constructores parametrizados, la sobreescritura del método abstracto cambiarChofer, el método agregarAcompañante y la sobreescritura del método toString. 
 * @author Fabian
 *
 */
public class Motocicleta extends Vehiculo {

	/**
	 * acompañante es una Persona
	 */
	private Persona acompañante;
	
	/**
	 * Constructor parametrizado de la clase Motocicleta, con dos argumentos
	 * @param chofer es una Persona
	 * @param kmRecorridos es la cantidad de kilómetros recorridos
	 */
	public Motocicleta(Persona chofer, double kmRecorridos) {
		super(chofer,kmRecorridos);
	}
	
	/**
	 * Constructor parametrizado de la clase Motocicleta, con tres argumentos
	 * @param chofer es una Persona
	 * @param kmRecorridos es la cantidad de kilómetros recorridos
	 * @param acompañante es una Persona
	 */
	public Motocicleta(Persona chofer, double kmRecorridos, Persona acompañante) {
		super(chofer,kmRecorridos);
		this.acompañante = acompañante;
	}
	
	/**
	 * Si no hay un acompañante en la moto, se cambia el chofer. 
	 */
	@Override
	public boolean cambiarChofer(Persona chofer) {
		if (acompañante == null) {
			this.chofer = chofer;
			return true;
		}
		return false;
	}
	
	/**
	 * Método agregar acompañante. 
	 * Si no hay un acompañante en la motocicleta, se agrega el acompañante. 
	 * @param acompañante es una Persona
	 * @return Se retorna un valor booleano que indica si el acompañante fue agregado
	 */
	public boolean agregarAcompañante(Persona acompañante) {
		if (this.acompañante == null) {
			this.acompañante = acompañante;
			return true;
		}
		return false;
	}

	/**
	 * Se concatena al String retornado con el atributo acompañante. 
	 */
	@Override
	public String toString() {
		return super.toString() + " Motocicleta [acompañante=" + acompañante + "]";
	}
	
}
