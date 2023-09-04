package piratas;

public class Escorbuto extends Estado {

	private static final int ATAQUE = 2;
	private static final int DEFENSA = 0;

	public Escorbuto() {
		this.estadoPirata = EstadoPirata.ESCORBUTO;
	}

	@Override
	public Estado beberGrog() {
		return this;
	}

	@Override
	public Estado beberJugo() {
		return new Saludable();
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
