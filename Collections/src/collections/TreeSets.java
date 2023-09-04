package collections;

import java.util.HashMap;
import java.util.Map;

public class TreeSets {

	public static void main(String[] args) {
		
		HashMap<String, Empleado> empleados = new HashMap<String, Empleado>();
		empleados.put("8235", new Empleado("Darío", 26, 23000.00));
		empleados.put("1465", new Empleado("Brenda", 24, 21000.00));
		empleados.put("7486", new Empleado("Alejandro", 23, 20000.00));
		empleados.put("5484", new Empleado("Esteban", 27, 24000.00));
		empleados.put("6354", new Empleado("Candela", 25, 22000.00));
		
		System.out.println(empleados);
		
		empleados.replace("6354", new Empleado("Candela", 25, 25000.00));
		
		System.out.println(empleados);
		
		for(Map.Entry<String, Empleado> empleado : empleados.entrySet()){
			String clave = empleado.getKey();
			Empleado valor = empleado.getValue();
			System.out.println("Clave = " + clave + ", Valor = " + valor);
		}
	}
}
