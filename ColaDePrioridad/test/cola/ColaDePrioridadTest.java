package cola;

import java.util.Random;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ColaDePrioridadTest {

	private ColaDePrioridad cola;
	
	@Before
	public void queSeInstancia() {
		cola = new ColaDePrioridad(10);
	}
	
	@Test
	public void estaLlena() {
		Assert.assertFalse(this.cola.estaLlena());
	}
	
	@Test
	public void estaVacio() {
		Assert.assertTrue(this.cola.estaVacia());
	}
	
	@Test
	public void tamañoMaximo() {
		Assert.assertEquals(10, this.cola.getTamañoMaximo());
	}
	
	@Test
	public void cantidadDeElementos() {
		Assert.assertEquals(0, this.cola.getCantidadDeElementos());
	}
	
	@Test
	public void queInserta() {
		this.cola.insertar(5);
		Assert.assertEquals(1, this.cola.getCantidadDeElementos());
	}
	
	@Test
	public void queElimina() {
		this.cola.insertar(5);
		Assert.assertEquals(5, this.cola.eliminar());
		Assert.assertEquals(0, this.cola.getCantidadDeElementos());
	}
	
	@Test
	public void quePispea() {
		this.cola.insertar(5);
		Assert.assertEquals(5, this.cola.pispear());
		Assert.assertEquals(1, this.cola.getCantidadDeElementos());
	}
	
	@Test
	public void queSeRespetaLaPrioridad() {
		this.cola.insertar(5);
		this.cola.insertar(2);
		this.cola.insertar(4);
		this.cola.insertar(1);
		this.cola.insertar(3);
		Assert.assertEquals(1, this.cola.eliminar());
		Assert.assertEquals(2, this.cola.eliminar());
		Assert.assertEquals(3, this.cola.eliminar());
		Assert.assertEquals(4, this.cola.eliminar());
		Assert.assertEquals(5, this.cola.eliminar());
	}
	
	@Test(expected = IllegalStateException.class)
	public void queSeLLena() {
		Random rand = new Random();
		while (true) {
			this.cola.insertar(rand.nextInt(100));
		}
	}
	
	@Test(expected = IllegalStateException.class)
	public void queSeVacia() {
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			this.cola.insertar(rand.nextInt(100));
		}
		while (true) {
			this.cola.eliminar();
		}
	}
}
