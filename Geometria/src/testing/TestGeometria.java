package testing;

import org.junit.Assert;
import org.junit.Test;

import geometria.Circulo;
import geometria.Punto;

public class TestGeometria {

	@Test
	public void testDistanciaHasta() {
		Punto p1 = new Punto(3, 0);
		Punto p2 = new Punto(5, 0);
		Assert.assertTrue(p1.distanciaHasta(p2) == 2);
	}

	@Test
	public void testContiene() {
		Circulo c = new Circulo(new Punto(5, 5), 5);
		Punto p = new Punto(3, 3);
		Assert.assertTrue(c.contiene(p));
	}
}
