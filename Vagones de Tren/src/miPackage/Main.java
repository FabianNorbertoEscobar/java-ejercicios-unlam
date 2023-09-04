package miPackage;

public class Main {

	public static void main(String[] args) {
		
		Tren tren = new Tren("vagones.in");
		tren.separarAnimalesEnVagones("vagones.out");
		System.out.println("Vagones de Tren");

		System.out.println("Cantidad de vagones: " + tren.getVagonesNecesarios());
		System.out.println("Agresividad total del tren: " + tren.getAgresividadTotal());
	}

}
