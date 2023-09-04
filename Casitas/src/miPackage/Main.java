package miPackage;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Casitas");
		
		int casitasBalanceadas = 0;
		for (int i = 1; i <= 300; i++) {
			int respuesta1 = Casitas.casitaBalanceada1(i);
			if (respuesta1 != -1) {
				casitasBalanceadas++;
			}
			int respuesta2 = Casitas.casitaBalanceada2(i);
			//int respuesta3 = Casitas.casitaBalanceada3(i);
			System.out.print("Casita balanceada de " + i + " casitas: ");
			System.out.print("\t rta1: " + respuesta1);
			System.out.print("\t rta2: " + respuesta2);
			//System.out.print("\t rta3: " + respuesta3);
			System.out.println();
		}
		
		System.out.println("Total de casitas balanceadas: " + casitasBalanceadas);
	}

}
