package monjes;

/**
 * La clase Berserker hereda de la clase Estado. <br>
 * Berserker es uno de los estados de un monje Vikingo. <br>
 * Su defensa es menor pero su ataque se triplica. Si se calma tres veces, regresa a estado Natural.
 * @author Fabian
 *
 */
public class Berserker extends Estado {

	private int cantidadDeCalmas;
	
	public Berserker() {
		this.cantidadDeCalmas = 0;
		this.estadoActual = EstadoVikingo.BERSERKER;
	}
	
	@Override
	public Estado meditar() {
		this.cantidadDeCalmas++;
		if (this.cantidadDeCalmas == 3) {
			return new Natural();
		} else {
			return this;
		}
	}

	@Override
	public Estado recibirAtaque(double porcentajeDeAtaque) {
		this.cantidadDeCalmas = 0;
		return this;
	}

}
