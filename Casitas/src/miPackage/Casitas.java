package miPackage;

/**
 * La clase casitas contiene distintas implementaciones de un mismo método
 * estático casitaBalanceada. <br />
 * El método casitaBalanceadaDe trabaja con una sucesión de casitas. <br />
 * Las casitas se encuentran numeradas con números naturales, de 1 a n. <br />
 * El método calcula de qué casita hay que salir para que la suma entre los
 * números de casa, sea idéntica hacia ambos lados de la casita elegida. <br />
 * No se cuenta el índice de la casa escogida. <br />
 * Si la casa buscada no existe, se retorna -1.
 * 
 * @author Fabian
 *
 */
public abstract class Casitas {

	/**
	 * Método implementado con una complejidad computacional de O(n^2)
	 * 
	 * @param n
	 *            es el número de casitas de la sucesión
	 * @return Se retorna el número de la casita escogida si existe, sino -1
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
	 * Método implementado con una complejidad computacional de O(n)
	 * 
	 * @param n
	 *            es el número de casitas de la sucesión
	 * @return Se retorna el número de la casita escogida si existe, sino -1
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
	
//	Ésta implementación falla	
//
//	/**
//	 * Método implementado con una complejidad computacional de O(1)
//	 * 
//	 * @param n
//	 *            es el número de casitas de la sucesión
//	 * @return Se retorna el número de la casita escogida si existe, sino -1
//	 */
//	public static int casitaBalanceada3(int n) {
//		if (n <= 3) {
//			return -1;
//		}
//		return (int) Math.sqrt((n * (n + 1)) / 2);
//	}
}
