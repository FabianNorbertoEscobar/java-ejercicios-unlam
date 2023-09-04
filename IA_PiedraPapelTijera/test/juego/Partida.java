package juego;

import org.junit.Assert;
import org.junit.Test;

public class Partida {

	@Test
	public void queSpockVaporizaPiedra() {
		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.PIEDRA);
		Assert.assertEquals(Resultado.GANA, jugadorUno.jugarCon(jugadorDos));
	}

}
