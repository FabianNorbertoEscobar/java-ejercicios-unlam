package ejercito;

public class Armamento {

	private double peso;
	private double volumen;

	public Armamento() {
		this.peso = 0;
		this.volumen = 0;
	}

	public Armamento(double peso, double volumen) {
		this.peso = peso;
		this.volumen = volumen;
	}

	public double getPeso() {
		return peso;
	}

	public double getVolumen() {
		return volumen;
	}

}
