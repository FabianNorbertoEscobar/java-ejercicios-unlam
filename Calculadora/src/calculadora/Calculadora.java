package calculadora;

public class Calculadora {

	private int ans;
	
	public Calculadora() {
		ans = 0;
	}
	
	public int add(int a, int b) {
		ans = a + b;
		return ans;
	}
	
	public int add(int v) {
		ans += v;
		return ans;
	}
	
	public int sub(int a, int b) {
		ans = a - b;
		return ans;
	}
	
	public int sub(int v) {
		ans -= v;
		return ans;
	}
	
	public int mul(int a, int b) {
		ans = a * b;
		return ans;
	}
	
	public int mul(int v) {
		ans *= v;
		return ans;
	}
	
	public int div(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("La divisi�n entre cero es una indeterminaci�n matem�tica");
		}
		ans = a / b;
		return ans;
	}
	
	public int div(int v) {
		ans /= v;
		return ans;
	}
	
	public int ans() {
		return ans;
	}
	
	public void clear() {
		ans = 0;
	}

}
