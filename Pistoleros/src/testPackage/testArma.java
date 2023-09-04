package testPackage;

import org.junit.Assert;
import org.junit.Test;

import miPackage.*;

public class testArma {

	@Test
	public void testDerringer() {
		Derringer derringer = new Derringer();
		Assert.assertTrue(derringer.tipoArma() == "Derringer");
		Assert.assertFalse(derringer.estaRota());
		Assert.assertTrue(derringer.getEstado());
		Assert.assertTrue(derringer.getTurno());
		Assert.assertTrue(derringer.tieneBalas());
		Assert.assertTrue(derringer.getAlcance() == 1.5);
		Assert.assertTrue(derringer.getBalas() == 2);
		Assert.assertTrue(derringer.getCargador() == 2);
		Assert.assertTrue(derringer.getDaño() == 1);
		Assert.assertTrue(derringer.getTiros() == 0);
	}

	@Test
	public void testWinchester() {
		Winchester winchester = new Winchester();
		Assert.assertTrue(winchester.tipoArma() == "Winchester");
		Assert.assertFalse(winchester.estaRota());
		Assert.assertTrue(winchester.getEstado());
		Assert.assertTrue(winchester.getTurno());
		Assert.assertTrue(winchester.tieneBalas());
		Assert.assertTrue(winchester.getAlcance() == 4);
		Assert.assertTrue(winchester.getBalas() == 2);
		Assert.assertTrue(winchester.getCargador() == 2);
		Assert.assertTrue(winchester.getDaño() == 3);
		Assert.assertTrue(winchester.getTiros() == 0);
	}

	@Test
	public void testColt45() {
		Colt45 colt45 = new Colt45();
		Assert.assertTrue(colt45.tipoArma() == "Colt45");
		Assert.assertFalse(colt45.estaRota());
		Assert.assertTrue(colt45.getEstado());
		Assert.assertTrue(colt45.getTurno());
		Assert.assertTrue(colt45.tieneBalas());
		Assert.assertTrue(colt45.getAlcance() == 10);
		Assert.assertTrue(colt45.getBalas() == 6);
		Assert.assertTrue(colt45.getCargador() == 6);
		Assert.assertTrue(colt45.getDaño() == 2);
		Assert.assertTrue(colt45.getTiros() == 0);
	}
}
