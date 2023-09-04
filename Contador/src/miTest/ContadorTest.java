package miTest;

import org.junit.Assert;
import org.junit.Test;

import miPack.Contador;

public class ContadorTest {

	@Test
	public void queSeCrea() {
		@SuppressWarnings("unused")
		Contador contador = new Contador();
	}
	
	@Test
	public void queCuenta() {
		Contador contador = new Contador();
		contador.contar();
		Assert.assertEquals(1, contador.mostrar());
	}
	
	@Test
	public void queSeResetea() {
		Contador contador = new Contador();
		contador.contar();
		contador.resetear();
		Assert.assertEquals(0, contador.mostrar());
	}
	
	@Test
	public void queSeReseteaYVuelveAContar() {
		Contador contador = new Contador();
		contador.contar();
		contador.resetear();
		contador.contar();
		contador.contar();
		contador.contar();
		Assert.assertEquals(3, contador.mostrar());
	}
}
