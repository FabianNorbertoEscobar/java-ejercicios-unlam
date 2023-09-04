package miPackage;

public class Derringer extends Arma {

	private static final int balas = 2;
	private static final int cargador = 2;
	private static final int daño = 1;
	private static final double alcance = 1.5;
	private static final String tipoArma = "Derringer";
	
	public Derringer() {
		super(balas, cargador, daño, alcance);
	}

	@Override
	public String tipoArma() {
		return tipoArma;
	}
}
