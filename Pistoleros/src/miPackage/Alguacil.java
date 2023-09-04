package miPackage;

public class Alguacil extends Pistolero {
	
	private static final int salud = 6;
	private static final String tipoPistolero = "Alguacil";

	public Alguacil(String nombre, Punto posicion, Arma arma) {
		super(nombre, posicion, salud, arma);
	}
	
	public Alguacil(String nombre, Arma arma) {
		super(nombre, new Punto(), salud, arma);
	}
	
	public Alguacil(String nombre, Punto posicion) {
		super(nombre, posicion, salud);
	}
	
	@Override
	public String tipoPistolero() {
		return tipoPistolero;
	}
}
