package principalPackage;

public class Main {

	public static void main(String[] args) {
		System.out.println("ALGORITMOS DE B�SQUEDA");
		int posicion;
		
		System.out.println("En el vector:");
		int[] v1 = { 15, 3, 19, 7, 11, 4, 20, 6, 1, 16, 18, 9, 2, 8, 17, 5, 14, 12, 10, 13 };
		for (int i = 0; i < v1.length; i++) {
			System.out.print(v1[i] + " ");
		}
		System.out.println();
		
		System.out.print("B�squeda secuencial ");
		posicion = Busqueda.secuencial(v1, 12);
		if (posicion != -1) {
			System.out.println("encontr� el 12 en la posici�n " + (posicion + 1));
		} else {
			System.out.println("no encontr� el 12");
		}
		
		System.out.println("En el vector:");
		int[] v2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		for (int i = 0; i < v2.length; i++) {
			System.out.print(v2[i] + " ");
		}
		System.out.println();
		
		System.out.print("B�squeda binaria ");
		posicion = Busqueda.binaria(v2, 12);
		if (posicion != -1) {
			System.out.println("encontr� el 12 en la posici�n " + (posicion + 1));
		} else {
			System.out.println("no encontr� el 12");
		}
	}

}
