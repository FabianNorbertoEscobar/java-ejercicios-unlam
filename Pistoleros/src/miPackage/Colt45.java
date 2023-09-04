package miPackage;

public class Colt45 extends Arma {

	private static final int balas = 6;
	private static final int cargador = 6;
	private static final int daño = 2;
	private static final double alcance = 10;
	private static final String tipoArma = "Colt45";
	
	public Colt45() {
		super(balas, cargador, daño, alcance);
	}

	@Override
	public String tipoArma() {
		return tipoArma;
	}
}
