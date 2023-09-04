package miPackage;

public class Jefe extends Empleado {

	private double incentivo;
	
	public Jefe(String nombre, double sueldo, double incentivo) {
		super(nombre, sueldo);
		this.incentivo = incentivo;
	}
	
	public double dameSueldo() {
		return super.dameSueldo() + this.incentivo;
	}
}
