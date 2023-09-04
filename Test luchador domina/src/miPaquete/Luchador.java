package miPaquete;

public class Luchador {

	private double peso;
	private double altura;
	
	public Luchador() {
		this.peso = 0;
		this.altura = 0;
	}
	
	public Luchador(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}
	
	public boolean domina(Luchador luchador) {
		if (this.peso > luchador.peso && this.altura > luchador.altura)
			return true;
		else if (this.peso > luchador.peso && !(this.altura > luchador.altura))
			return true;
		else if (!(this.peso > luchador.peso) && this.altura > luchador.altura)
			return true;
		else
			return false;
	}
}
