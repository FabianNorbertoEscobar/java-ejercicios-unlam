package piratas;

public abstract class Estado {

	protected EstadoPirata estadoPirata;

	public abstract Estado beberGrog();

	public abstract Estado beberJugo();

	public EstadoPirata getEstadoPirata() {
		return this.estadoPirata;
	}

	public abstract int getAtaque();
	
	public abstract int getDefensa();
	
}
