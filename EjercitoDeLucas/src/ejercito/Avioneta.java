package ejercito;

import java.util.ArrayList;

public class Avioneta extends Unidad {

	private static final double PESOMAXIMO = 3000;
	private static final double DISTANCIAATAQUEMINIMA = 500;
	private static final double DISTANCIAATAQUEMAXIMA = 1700;
	private static final double VOLUMENMAXIMO = 500;

	private ArrayList<Armamento> armamentos;

	public Avioneta() {
		this.armamentos = new ArrayList<Armamento>();
	}

	@Override
	protected void cargar(Armamento armamento) {
		this.armamentos.add(armamento);
		this.peso += armamento.getPeso();
		this.volumen += armamento.getVolumen();
	}

	@Override
	protected boolean puedeCargar(Armamento armamento) {
		return (this.peso + armamento.getPeso()) <= PESOMAXIMO
				&& (this.volumen + armamento.getVolumen()) <= VOLUMENMAXIMO;
	}

	@Override
	protected boolean puedeAtacarA(Objetivo objetivo) {
		return objetivo.getDistancia() >= DISTANCIAATAQUEMINIMA && objetivo.getDistancia() <= DISTANCIAATAQUEMAXIMA;
	}

}
