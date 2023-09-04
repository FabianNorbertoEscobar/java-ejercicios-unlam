package orquesta;

import java.util.ArrayList;

import instrumentos.InstrumentoDeCuerdas;
import instrumentos.InstrumentoDeViento;

public class Orquesta {

	private ArrayList<InstrumentoDeViento> instrumentosDeViento;
	private ArrayList<InstrumentoDeCuerdas> instruementosDeCuerdas;

	public Orquesta() {
		this.instrumentosDeViento = new ArrayList<InstrumentoDeViento>();
		this.instruementosDeCuerdas = new ArrayList<InstrumentoDeCuerdas>();
	}

	public void tocar() {
		this.tocarInstrumentosDeViento();
		this.tocarInstrumentosDeCuerdas();
	}

	public void tocarInstrumentosDeViento() {
		for (InstrumentoDeViento instrumento : this.instrumentosDeViento) {
			instrumento.tocar();
		}
	}

	public void tocarInstrumentosDeCuerdas() {
		for (InstrumentoDeCuerdas instrumento : this.instruementosDeCuerdas) {
			instrumento.tocar();
		}
	}

	public boolean addInstrumentoDeViento(InstrumentoDeViento instrumento) {
		return this.instrumentosDeViento.add(instrumento);
	}

	public boolean addInstrumentosDeCuerdas(InstrumentoDeCuerdas instrumento) {
		return this.instruementosDeCuerdas.add(instrumento);
	}

}
