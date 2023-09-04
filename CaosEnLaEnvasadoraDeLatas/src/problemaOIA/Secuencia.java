package problemaOIA;

public class Secuencia {

	private int longitud;
	private int posicionInicio;
	private int posicionFin;

	public Secuencia(int longitud, int posicionInicio, int posicionFin) {
		this.longitud = longitud;
		this.posicionInicio = posicionInicio;
		this.posicionFin = posicionFin;
	}

	public int getLongitud() {
		return longitud;
	}

	public int getPosicionInicio() {
		return posicionInicio;
	}

	public int getPosicionFin() {
		return posicionFin;
	}

}
