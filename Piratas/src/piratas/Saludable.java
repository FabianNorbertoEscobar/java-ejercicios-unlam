package piratas;

public class Saludable extends Estado {

	private static final int ATAQUE = 5;
	private static final int DEFENSA = 2;

	private static final int CANTIDAD_MAXIMA_GROGS = 3;
	private int cantidadGrogs;

	public Saludable() {
		this.estadoPirata = EstadoPirata.SALUDABLE;
		this.cantidadGrogs = 0;
	}

	@Override
	public Estado beberGrog() {
		this.cantidadGrogs++;
		if (this.cantidadGrogs == Saludable.CANTIDAD_MAXIMA_GROGS) {
			this.cantidadGrogs = 0;
			return new Escorbuto();
		} else {
			return this;
		}
	}

	@Override
	public Estado beberJugo() {
		this.cantidadGrogs = 0;
		return new HiperSaludable();
	}

	@Override
	public int getAtaque() {
		return ATAQUE;
	}

	@Override
	public int getDefensa() {
		return DEFENSA;
	}

}
