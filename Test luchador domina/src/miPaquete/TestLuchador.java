package miPaquete;

import org.junit.Assert;
import org.junit.Test;

public class TestLuchador {

	@Test
	public void queSeCrea() {
		@SuppressWarnings("unused")
		Luchador luchador = new Luchador();
	}
	
	@Test
	public void queDomina() {
		Luchador luchador1 = new Luchador(650,1500);
		Luchador luchador2 = new Luchador(600,1200);
		
		Assert.assertTrue(luchador1.domina(luchador2));
	}
}
