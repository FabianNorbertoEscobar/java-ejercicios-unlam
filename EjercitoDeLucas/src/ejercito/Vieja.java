package ejercito;

public class Vieja extends Unidad {

	private static final double VOLUMENMAXIMO = 1;
	private static final double DISTANCIAATAQUEMAXIMA = 700;

	@Override
	protected void cargar(Armamento armamento) {
		this.volumen += armamento.getVolumen();
	}

	@Override
	protected boolean puedeCargar(Armamento armamento) {
		return this.volumen + armamento.getVolumen() <= VOLUMENMAXIMO;
	}

	@Override
	protected boolean puedeAtacarA(Objetivo objetivo) {
		return objetivo.getDistancia() <= DISTANCIAATAQUEMAXIMA;
	}

}
