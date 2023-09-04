package ejercito;

import java.util.ArrayList;

public class Niño extends Unidad {

	private static final int CANTIDADARMAMENTOSMAXIMA = 2;
	private static final double PESOMAXIMO = 120;
	
	private ArrayList<Armamento> armamentos;

	public Niño() {
		this.armamentos = new ArrayList<Armamento>();
	}

	@Override
	protected void cargar(Armamento armamento) {
		this.armamentos.add(armamento);
		this.peso += armamento.getPeso();
		this.cantidadArmamentos++;
	}

	@Override
	protected boolean puedeCargar(Armamento armamento) {
		return this.cantidadArmamentos < CANTIDADARMAMENTOSMAXIMA && this.peso + armamento.getPeso() < PESOMAXIMO;
	}

	@Override
	protected boolean puedeAtacarA(Objetivo objetivo) {
		return true;
	}

}
