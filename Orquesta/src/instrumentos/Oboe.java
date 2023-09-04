package instrumentos;

import afinador.Afinable;

public class Oboe extends InstrumentoDeViento implements Afinable {

	@Override
	public void afinar() {
		System.out.println("afinando oboe");
	}

	@Override
	public void tocar() {
		System.out.println("tocando oboe");
	}

}
