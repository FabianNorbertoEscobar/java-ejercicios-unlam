package instrumentos;

import afinador.Afinable;

public class Piano extends InstrumentoDeCuerdas implements Afinable {

	@Override
	public void tocar() {
		System.out.println("tocando piano");
	}

	@Override
	public void afinar() {
		System.out.println("afinando piano");
	}

}
