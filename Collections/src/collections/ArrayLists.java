package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists {

	public static void main(String[] args) {

		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		empleados.add(new Empleado("Darío", 26, 23000.00));
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
