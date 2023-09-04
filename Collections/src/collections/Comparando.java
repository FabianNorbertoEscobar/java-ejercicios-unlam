package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Comparando {

	public static void main(String[] args) {
		ComparadorEmpleados comparador = new ComparadorEmpleados();
		
		TreeSet<Empleado> empleados = new TreeSet<Empleado>(comparador);
		empleados.add(new Empleado("Dar�o", 26, 23000.00));
		empleados.add(new Empleado("Brenda", 24, 21000.00));
		empleados.add(new Empleado("Alejandro", 23, 20000.00));
		empleados.add(new Empleado("Esteban", 27, 24000.00));
		empleados.add(new Empleado("Candela", 25, 22000.00));
		
		Iterator<Empleado> iterator = empleados.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next().toString());
		}
	}
}
