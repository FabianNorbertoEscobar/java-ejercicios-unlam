package miPackage;

/**
 * Clase Motocicleta, hereda de la clase abstracta Vehiculo. 
 * Tiene como atributo a un acompa�ante (Persona). 
 * Tiene como m�todos a dos constructores parametrizados, la sobreescritura del m�todo abstracto cambiarChofer, el m�todo agregarAcompa�ante y la sobreescritura del m�todo toString. 
 * @author Fabian
 *
 */
public class Motocicleta extends Vehiculo {

	/**
	 * acompa�ante es una Persona
	 */
	private Persona acompa�ante;
	
	/**
	 * Constructor parametrizado de la clase Motocicleta, con dos argumentos
	 * @param chofer es una Persona
	 * @param kmRecorridos es la cantidad de kil�metros recorridos
	 */
	public Motocicleta(Persona chofer, double kmRecorridos) {
		super(chofer,kmRecorridos);
	}
	
	/**
	 * Constructor parametrizado de la clase Motocicleta, con tres argumentos
	 * @param chofer es una Persona
	 * @param kmRecorridos es la cantidad de kil�metros recorridos
	 * @param acompa�ante es una Persona
	 */
	public Motocicleta(Persona chofer, double kmRecorridos, Persona acompa�ante) {
		super(chofer,kmRecorridos);
		this.acompa�ante = acompa�ante;
	}
	
	/**
	 * Si no hay un acompa�ante en la moto, se cambia el chofer. 
	 */
	@Override
	public boolean cambiarChofer(Persona chofer) {
		if (acompa�ante == null) {
			this.chofer = chofer;
			return true;
		}
		return false;
	}
	
	/**
	 * M�todo agregar acompa�ante. 
	 * Si no hay un acompa�ante en la motocicleta, se agrega el acompa�ante. 
	 * @param acompa�ante es una Persona
	 * @return Se retorna un valor booleano que indica si el acompa�ante fue agregado
	 */
	public boolean agregarAcompa�ante(Persona acompa�ante) {
		if (this.acompa�ante == null) {
			this.acompa�ante = acompa�ante;
			return true;
		}
		return false;
	}

	/**
	 * Se concatena al String retornado con el atributo acompa�ante. 
	 */
	@Override
	public String toString() {
		return super.toString() + " Motocicleta [acompa�ante=" + acompa�ante + "]";
	}
	
}
