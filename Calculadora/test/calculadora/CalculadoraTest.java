package calculadora;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	
	private Calculadora calculadora;
	
	@Before
	public void before() {
		calculadora = new Calculadora();
	}
	
	@After
	public void after() {
		calculadora.clear();
	}

	@Test
	public void testAdd() {
		Assert.assertEquals(5, calculadora.add(3, 2));
	}
	
	@Test
	public void testSub() {
		Assert.assertEquals(1, calculadora.sub(3, 2));
	}
	
	@Test
	public void testMul() {
		Assert.assertEquals(6, calculadora.mul(3, 2));
	}

	@Test
	public void testDiv() {
		Assert.assertEquals(3, calculadora.div(6, 2));
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDiv0() {
		calculadora.div(5, 0);
	}
	
}
