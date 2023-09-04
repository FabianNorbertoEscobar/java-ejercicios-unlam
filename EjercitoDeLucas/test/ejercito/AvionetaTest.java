package ejercito;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AvionetaTest {

	private Avioneta avioneta;

	@Before
	public void instancia() {
		avioneta = new Avioneta();
	}

	@Test
	public void puedeAtacar() {
		Objetivo target = new Objetivo(1000);
		Assert.assertTrue(avioneta.atacar(target));
	}

	@Test
	public void puedeEquipar() {
		Armamento armamento = new Armamento(150, 0.2);
		Assert.assertTrue(avioneta.equipar(armamento));
	}
}
