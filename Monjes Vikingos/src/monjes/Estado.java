package monjes;

/**
 * Estado es una abstracci�n del estado del monje vikingo. <br>
 * Contiene un estado actual, y los comportamientos de meditar y recibir un ataque.
 * @author Fabian
 *
 */
public abstract class Estado {

	protected EstadoVikingo estadoActual;
	
	public abstract Estado meditar();
	public abstract Estado recibirAtaque(double porcentajeDeAtaque);
	
	public EstadoVikingo getEstadoActual() {
		return estadoActual;
	}
}
