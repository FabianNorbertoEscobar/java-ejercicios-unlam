package pack;

public class Main {

	public static void main(String[] args) {
		System.out.println("En sus marcas... Listos... Fuera!!!");
		Carrera carrera = new Carrera("carrera.in");
		carrera.armarPodiosPorCategoria("carrera.out");
	}

}
