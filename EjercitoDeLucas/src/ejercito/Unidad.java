package ejercito;

public abstract class Unidad {

	protected int cantidadArmamentos;
	protected double peso;
	protected double volumen;

	public final boolean equipar(Armamento armamento) {
		if (puedeCargar(armamento)) {
			this.cargar(armamento);
			return true;
		}
		return false;
	}

	public final boolean atacar(Objetivo objetivo) {
		return puedeAtacarA(objetivo);
	}

	protected abstract void cargar(Armamento armamento);

	protected abstract boolean puedeCargar(Armamento armamento);

	protected abstract boolean puedeAtacarA(Objetivo objetivo);

}
