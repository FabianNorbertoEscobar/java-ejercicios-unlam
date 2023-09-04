package fibonacci;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class TestsFibonacci {

	@Test
	public void testFibonacciTopUp() {
		Fibonacci fibo = new Fibonacci(10);
		Assert.assertEquals(fibo.TopUpDe(0), 1);
		Assert.assertEquals(fibo.TopUpDe(1), 1);
		Assert.assertEquals(fibo.TopUpDe(2), 2);
		Assert.assertEquals(fibo.TopUpDe(3), 3);
		Assert.assertEquals(fibo.TopUpDe(4), 5);
		Assert.assertEquals(fibo.TopUpDe(5), 8);
		Assert.assertEquals(fibo.TopUpDe(6), 13);
		Assert.assertEquals(fibo.TopUpDe(7), 21);
		Assert.assertEquals(fibo.TopUpDe(8), 34);
		Assert.assertEquals(fibo.TopUpDe(9), 55);
		Assert.assertEquals(fibo.TopUpDe(10), 89);
	}

	@Test
	public void testFibonacciTopDown() {
		Fibonacci fibo = new Fibonacci(10);
		Assert.assertEquals(fibo.TopDownDe(0), 1);
		Assert.assertEquals(fibo.TopDownDe(1), 1);
		Assert.assertEquals(fibo.TopDownDe(2), 2);
		Assert.assertEquals(fibo.TopDownDe(3), 3);
		Assert.assertEquals(fibo.TopDownDe(4), 5);
		Assert.assertEquals(fibo.TopDownDe(5), 8);
		Assert.assertEquals(fibo.TopDownDe(6), 13);
		Assert.assertEquals(fibo.TopDownDe(7), 21);
		Assert.assertEquals(fibo.TopDownDe(8), 34);
		Assert.assertEquals(fibo.TopDownDe(9), 55);
		Assert.assertEquals(fibo.TopDownDe(10), 89);
	}

}
