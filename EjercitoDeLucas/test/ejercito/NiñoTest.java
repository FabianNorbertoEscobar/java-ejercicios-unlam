package ejercito;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Ni�oTest {

	private Ni�o ni�o;
	
	@Before
	public void instancia() {
		ni�o = new Ni�o();
	}
	
	@Test
	public void puedeAtacar() {
		Objetivo target = new Objetivo(1000);
		Assert.assertTrue(ni�o.atacar(target));
	}

	@Test
	public void puedeEquipar() {
		Armamento armamento = new Armamento(150, 0.2);
		Assert.assertFalse(ni�o.equipar(armamento));
	}

}
