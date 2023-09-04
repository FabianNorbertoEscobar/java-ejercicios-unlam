package geometria;

public class Circulo {

	private Punto punto;
	private double radio;

	public Circulo(Punto punto, double radio) {
		super();
		this.punto = punto;
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "(" + this.punto.getX() + ", " + this.punto.getY() + ") , R = " + this.radio;	
	}
	
	public boolean contiene(Punto P) {
		return this.punto.distanciaHasta(P) < this.radio;
	}
}
