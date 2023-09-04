package fibonacci;

/**
 * Serie de Fibonacci implementada mediante Programación Dinámica. <br>
 * Con la programación dinámica reducimos el tiempo de ejecución del algoritmo pero aumentamos el uso de memoria.
 * @author Fabian
 *
 */
public class Fibonacci {

	private long vectorTopUp[];
	private long vectorTopDown[];

	public Fibonacci(int n) {
		this.vectorTopUp = new long[n + 1];
		this.vectorTopDown = new long[n + 1];
	}

	public long TopUpDe(int n) {
		this.vectorTopUp[0] = 1;
		this.vectorTopUp[1] = 1;
		
		for (int i = 2; i <= n; i++) {
			this.vectorTopUp[i] = this.vectorTopUp[i - 1] + this.vectorTopUp[i - 2];
		}
		return this.vectorTopUp[n];
	}

	public long TopDownDe(int n) {
		if (n == 0 || n == 1) {
			this.vectorTopDown[0] = 1;
			this.vectorTopDown[1] = 1;
			return this.vectorTopDown[n];
		} else if (this.vectorTopDown[n]!=0) {
			return this.vectorTopDown[n];
		} else {
			this.vectorTopDown[n] = TopDownDe(n - 1) + TopDownDe(n - 2);
			return this.vectorTopDown[n];
		}
	}
}
