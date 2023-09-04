package myPackage;

/**
 * La clase casitas contiene distintas implementaciones de un mismo m�todo
 * est�tico casitaBalanceada. <br />
 * El m�todo casitaBalanceadaDe trabaja con una sucesi�n de casitas. <br />
 * Las casitas se encuentran numeradas con n�meros naturales, de 1 a n. <br />
 * El m�todo calcula de qu� casita hay que salir para que la suma entre los
 * n�meros de casa, sea id�ntica hacia ambos lados de la casita elegida. <br />
 * No se cuenta el �ndice de la casa escogida. <br />
 * Si la casa buscada no existe, se retorna -1.
 * 
 * @author Fabian
 *
 */
public abstract class Casitas {

	/**
	 * M�todo implementado con una complejidad computacional de O(n^2)
	 * 
	 * @param n
	 *            es el n�mero de casitas de la sucesi�n
	 * @return Se retorna el n�mero de la casita escogida si existe, sino -1
	 */
	public static int casitaBalanceada1(int n) {
		if (n <= 3) {
			return -1;
		}
		for (int i = 2; i <= n - 1; i++) {
			int sumaIzq = 0;
			for (int j = 1; j < i; j++) {
				sumaIzq += j;
			}
			int sumaDer = 0;
			for (int j = i + 1; j <= n; j++) {
				sumaDer += j;
			}
			if (sumaIzq == sumaDer) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * M�todo implementado con una complejidad computacional de O(n)
	 * 
	 * @param n
	 *            es el n�mero de casitas de la sucesi�n
	 * @return Se retorna el n�mero de la casita escogida si existe, sino -1
	 */
	public static int casitaBalanceada2(int n) {
		if (n <= 3) {
			return -1;
		}
		for (int i = 2; i <= n - 1; i++) {
			int sumaIzq = i * (i - 1) / 2;
			int sumaDer = n * (n + 1) / 2 - sumaIzq - i;
			if (sumaIzq == sumaDer) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * M�todo implementado con una complejidad computacional de O(1)
	 * 
	 * @param n
	 *            es el n�mero de casitas de la sucesi�n
	 * @return Se retorna el n�mero de la casita escogida si existe, sino -1
	 */

	/*
	public static int casitaBalanceada3(int n) {
		if (n <= 3) {
			return -1;
		}
		int i = (int) Math.sqrt((n * (n + 1)) / 2);
		if (i % 1 == 0) {
			return i;
		} else {
			return -1;
		}
	}
	*/
}
