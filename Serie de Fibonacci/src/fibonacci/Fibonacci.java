package fibonacci;

public class Fibonacci {

	/**
	 * Calcula el en�simo t�rmino de la serie de Fibonacci. <br>
	 * Implementaci�n recursiva. Complejidad Computacional: O(2^n).
	 * @param n es el �ndice de la serie de Fibonacci
	 * @return el en�simo t�rmino de la serie de Fibonacci
	 * @throws ArithmeticException
	 */
	public static int recursivoDe(int n) throws ArithmeticException {
		if (n < 0) {
			throw new ArithmeticException("La serie de Fibonacci est� definida para n�meros naturales");
		} else if (n == 0) {
			return 0;
		} else if (n <= 2) {
			return 1;
		} else {
			return recursivoDe(n - 1) + recursivoDe(n - 2);
		}
	}

	/**
	 * Calcula el en�simo t�rmino de la serie de Fibonacci. <br>
	 * Implementaci�n iterativa. Complejidad Computacional: O(n).
	 * @param n es el �ndice de la serie de Fibonacci
	 * @return el en�simo t�rmino de la serie de Fibonacci
	 * @throws ArithmeticException
	 */
	public static int iterativoDe(int n) throws ArithmeticException {
		if (n < 0) {
			throw new ArithmeticException("La serie de Fibonacci est� definida para n�meros naturales");
		} else if (n == 0) {
			return 0;
		} else if (n <= 2) {
			return 1;
		}

		int primero = 1;
		int segundo = 1;
		int fibonacci = 0;

		while (n > 2) {
			fibonacci = primero + segundo;
			primero = segundo;
			segundo = fibonacci;
			n--;
		}
		return fibonacci;
	}

	/**
	 * Calcula el en�simo t�rmino de la serie de Fibonacci. <br>
	 * Implementaci�n matricial. Complejidad Computacional: O(log(n)).
	 * @param n es el �ndice de la serie de Fibonacci
	 * @return el en�simo t�rmino de la serie de Fibonacci
	 * @throws ArithmeticException
	 */
	public static int matricialDe(int n) throws ArithmeticException {
		if (n < 0) {
			throw new ArithmeticException("La serie de Fibonacci est� definida para n�meros naturales");
		}
		double[][] fibonacci = { { 1, 1 }, { 1, 0 } };
		MatrizMath matriz = new MatrizMath(2, 2, fibonacci);
		MatrizMath potencia = matriz.potencia(n);
		return (int) potencia.getValor(0, 1);
	}

	/**
	 * Indica si un n�mero pertenece a la serie de Fibonacci.
	 * @param n es el n�mero a buscar
	 * @return true or false
	 */
	public static boolean incluyeA(int n) {
		if (n < 0) {
			return false;
		} else if (n <= 2) {
			return true;
		}

		int primero = 0;
		int segundo = 1;
		int fibonacci = 0;

		do {
			fibonacci = primero + segundo;
			primero = segundo;
			segundo = fibonacci;
		} while (fibonacci < n);
		return fibonacci == n;
	}
}
