package monjes;

/**
 * La clase Meditación hereda de la clase Estado. <br>
 * Meditación es uno de los estados de un monje vikingo. <br>
 * Su ataque es menor, pero su defensa se quintuplica. Si lo hieren en un 5%, vuelve a estado Natural.
 * @author Fabian
 *
 */
public class Meditacion extends Estado {

	public Meditacion() {
		this.estadoActual = EstadoVikingo.MEDITACION;
	}
	
	@Override
	public Estado meditar() {
		return this;
	}

	@Override
	public Estado recibirAtaque(double porcentajeDeAtaque) {
		if (porcentajeDeAtaque > 5) {
			return new Natural();
		} else {
			return this;
		}
	}

}
