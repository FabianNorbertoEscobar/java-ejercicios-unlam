package orquesta;

import afinador.Afinador;
import instrumentos.Banjo;
import instrumentos.Flauta;
import instrumentos.Guitarra;
import instrumentos.Oboe;
import instrumentos.Piano;
import instrumentos.Saxofon;

public class Main {

	public static void main(String[] args) {
		Orquesta orquesta = new Orquesta();

		Oboe oboe = new Oboe();
		Saxofon saxofon = new Saxofon();
		Flauta flauta = new Flauta();

		Guitarra guitarra = new Guitarra();
		Piano piano = new Piano();
		Banjo banjo = new Banjo();

		orquesta.addInstrumentoDeViento(oboe);
		orquesta.addInstrumentoDeViento(saxofon);
		orquesta.addInstrumentoDeViento(flauta);

		orquesta.addInstrumentosDeCuerdas(guitarra);
		orquesta.addInstrumentosDeCuerdas(piano);
		orquesta.addInstrumentosDeCuerdas(banjo);
		
		orquesta.tocarInstrumentosDeViento();
		orquesta.tocarInstrumentosDeCuerdas();

		Afinador afinador = new Afinador();
		afinador.afinar(oboe);
		afinador.afinar(piano);
	}
}
