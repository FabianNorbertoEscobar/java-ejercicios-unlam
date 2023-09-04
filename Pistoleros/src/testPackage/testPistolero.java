package testPackage;

import org.junit.Assert;
import org.junit.Test;

import miPackage.*;

public class testPistolero {

	@Test
	public void testSheriff() {
		Sheriff sheriff1 = new Sheriff("Alberto", new Punto(4, 2), new Derringer());
		Assert.assertTrue(sheriff1.tipoPistolero() == "Sheriff");
		Assert.assertTrue(sheriff1.estaVivo());
		Assert.assertTrue(sheriff1.tieneArma());
		Assert.assertTrue(sheriff1.getSalud() == 10);

		Sheriff sheriff2 = new Sheriff("Roberto", new Punto(3, 5), new Winchester());
		Assert.assertTrue(sheriff2.tipoPistolero() == "Sheriff");
		Assert.assertTrue(sheriff2.estaVivo());
		Assert.assertTrue(sheriff2.tieneArma());
		Assert.assertTrue(sheriff2.getSalud() == 10);

		Sheriff sheriff3 = new Sheriff("Eduardo", new Punto(7, 6), new Colt45());
		Assert.assertTrue(sheriff3.tipoPistolero() == "Sheriff");
		Assert.assertTrue(sheriff3.estaVivo());
		Assert.assertTrue(sheriff3.tieneArma());
		Assert.assertTrue(sheriff3.getSalud() == 10);
	}

	@Test
	public void testAlguacil() {
		Alguacil alguacil1 = new Alguacil("Pedro", new Punto(4, 2), new Derringer());
		Assert.assertTrue(alguacil1.tipoPistolero() == "Alguacil");
		Assert.assertTrue(alguacil1.estaVivo());
		Assert.assertTrue(alguacil1.tieneArma());
		Assert.assertTrue(alguacil1.getSalud() == 6);

		Alguacil alguacil2 = new Alguacil("Juliano", new Punto(3, 5), new Winchester());
		Assert.assertTrue(alguacil2.tipoPistolero() == "Alguacil");
		Assert.assertTrue(alguacil2.estaVivo());
		Assert.assertTrue(alguacil2.tieneArma());
		Assert.assertTrue(alguacil2.getSalud() == 6);

		Alguacil alguacil3 = new Alguacil("Teodoro", new Punto(7, 6), new Colt45());
		Assert.assertTrue(alguacil3.tipoPistolero() == "Alguacil");
		Assert.assertTrue(alguacil3.estaVivo());
		Assert.assertTrue(alguacil3.tieneArma());
		Assert.assertTrue(alguacil3.getSalud() == 6);
	}

	@Test
	public void testRenegado() {
		Renegado renegado1 = new Renegado("Ruben", new Punto(4, 2), new Derringer());
		Assert.assertTrue(renegado1.tipoPistolero() == "Renegado");
		Assert.assertTrue(renegado1.estaVivo());
		Assert.assertTrue(renegado1.tieneArma());
		Assert.assertTrue(renegado1.getSalud() == 9);

		Renegado renegado2 = new Renegado("Lorenza", new Punto(3, 5), new Winchester());
		Assert.assertTrue(renegado2.tipoPistolero() == "Renegado");
		Assert.assertTrue(renegado2.estaVivo());
		Assert.assertTrue(renegado2.tieneArma());
		Assert.assertTrue(renegado2.getSalud() == 9);

		Renegado renegado3 = new Renegado("Ernesto", new Punto(7, 6), new Colt45());
		Assert.assertTrue(renegado3.tipoPistolero() == "Renegado");
		Assert.assertTrue(renegado3.estaVivo());
		Assert.assertTrue(renegado3.tieneArma());
		Assert.assertTrue(renegado3.getSalud() == 9);
	}
}
