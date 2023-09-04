package miPackage;

public class Empleado {

	private final String nombre;
	private double sueldo;
	private static int id;
	
	public Empleado() {
		this.nombre = null;
		this.sueldo = 0;
		id++;
	}
	
	public Empleado(String nombre, double sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
		id++;
	}
	
	public String dameNombre() {
		return this.nombre;
	}
	
	public double dameSueldo() {
		return this.sueldo;
	}
	
	public int dameId() {
		return id;
	}
}
