package ejercito;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NiñoTest {

	private Niño niño;
	
	@Before
	public void instancia() {
		niño = new Niño();
	}
	
	@Test
	public void puedeAtacar() {
		Objetivo target = new Objetivo(1000);
		Assert.assertTrue(niño.atacar(target));
	}

	@Test
	public void puedeEquipar() {
		Armamento armamento = new Armamento(150, 0.2);
		Assert.assertFalse(niño.equipar(armamento));
	}

}
