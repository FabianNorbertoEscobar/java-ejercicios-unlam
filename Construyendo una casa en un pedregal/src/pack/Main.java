package pack;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("CONSTRUYENDO UNA CASA EN EL PEDREGAL");
		Pedregal pedregal = new Pedregal("pedregal.in");
		pedregal.resolucion("pedregal.out");
		pedregal.mostrarTerreno();
	}
}
