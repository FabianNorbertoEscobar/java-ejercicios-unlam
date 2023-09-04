package principalPackage;

public class Busqueda {

	public static int secuencial(int[] v, int dato) {
		int posicion = -1;
		for (int i = 0; i < v.length; i++) {
			if (v[i] == dato) {
				posicion = i;
				break;
			}
		}
		return posicion;
	}
	
	public static int binaria(int[] v, int dato) {
		int centro, inf = 0, sup = v.length - 1;
		while (inf <= sup) {
			centro = (sup + inf) / 2;
			if (v[centro] == dato) {
				return centro;
			} else if (dato < v[centro]) {
				sup = centro - 1;
			} else {
				inf = centro + 1;
			}
		}
		return -1;
	}
}
