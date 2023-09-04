package ejercito;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ViejaTest {

	private Vieja vieja;

	@Before
	public void instancia() {
		vieja = new Vieja();
	}

	@Test
	public void puedeAtacar() {
		Objetivo target = new Objetivo(1000);
		Assert.assertFalse(vieja.atacar(target));
	}

	@Test
	public void puedeEquipar() {
		Armamento armamento = new Armamento(150, 0.2);
		Assert.assertTrue(vieja.equipar(armamento));
	}

}
