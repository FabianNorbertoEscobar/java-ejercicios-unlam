package miPackage;

public class Winchester extends Arma {

	private static final int balas = 2;
	private static final int cargador = 2;
	private static final int da�o = 3;
	private static final double alcance = 4;
	private static final String tipoArma = "Winchester";
	
	public Winchester() {
		super(balas, cargador, da�o, alcance);
	}

	@Override
	public String tipoArma() {
		return tipoArma;
	}
}
