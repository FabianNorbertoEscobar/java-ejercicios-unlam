package monjes;

/**
 * La clase Natural hereda de la clase Estado. <br>
 * Natural es el estado normal de los monjes vikingos. <br>
 * Si lo hieren en más de un 15%, se vuelve Berserker. Si se calma pasa a estado de Meditación.
 * @author Fabian
 *
 */
public class Natural extends Estado {

	public Natural() {
		this.estadoActual = EstadoVikingo.NATURAL;
	}
	
	@Override
	public Estado meditar() {
		return new Meditacion();
	}

	@Override
	public Estado recibirAtaque(double porcentajeDeAtaque) {
		if (porcentajeDeAtaque > 15) {
			return new Berserker();
		} else {
			return this;
		}
	}

}
