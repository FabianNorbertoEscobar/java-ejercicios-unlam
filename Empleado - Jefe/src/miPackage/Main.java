package miPackage;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("CLASE EMPLEADO Y CLASE JEFE");

		Empleado[] misEmpleados = new Empleado[4];
		Jefe jefe = new Jefe("Jorge Rojas",90000,1000);
		
		misEmpleados[0] = new Empleado("Pablo López",9999999);
		misEmpleados[1] = new Empleado("Rigoberto Uriarte",100);
		misEmpleados[2] = new Empleado("José Marmol",15000);
		misEmpleados[3] = jefe; 
		
		for(Empleado e : misEmpleados) {
			System.out.println(e.dameNombre());
			System.out.println(e.dameSueldo());
			System.out.println(e.dameId());
		}
		
	}

}
