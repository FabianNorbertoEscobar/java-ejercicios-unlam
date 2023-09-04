package miPackage;

import java.util.LinkedList;
import java.util.List;

/**
 * Clase Autobus, hereda de la clase abstracta Vehiculo. 
 * Tiene como atributo a una lista de pasajeros. 
 * Tiene como m�todos a un constructor parametrizado, la sobreescritura del m�todo abstracto cambiarChofer, el m�todo agregarPasajero y la sobreescritura del m�todo toString. 
 * @author Fabian
 *
 */
public class Autobus extends Vehiculo {

	/**
	 * pasajeros es una lista de Personas
	 */
	private List<Persona> pasajeros;
	
	/**
	 * Constructor parametrizado de la clase Autobus, con dos argumentos
	 * @param chofer es una Persona
	 * @param kmRecorridos es la cantidad de kil�metros recorridos
	 */
	public Autobus(Persona chofer, double kmRecorridos) {
		super(chofer,kmRecorridos);
		pasajeros = new LinkedList<Persona>();
	}

	/**
	 * Si no hay pasajeros en el autob�s, se cambia al chofer. 
	 */
	@Override
	public boolean cambiarChofer(Persona chofer) {
		if (pasajeros.isEmpty()) {
			this.chofer = chofer;
			return true;
		}
		return false;
	}
	
	/**
	 * M�todo agregar Pasajero. 
	 * Agrega un pasajero a la lista de pasajeros. 
	 * @param pasajero es una lista enlazada de Personas
	 */
	public void agregarPasajero(Persona pasajero) {
		pasajeros.add(pasajero);
	}

	/**
	 * Se concatena al String retornado con el atributo pasajeros. 
	 */
	@Override
	public String toString() {
		return super.toString() + " Autobus [pasajeros=" + pasajeros + "]";
	}

}
