package collections;

import java.util.Comparator;

public class ComparadorEmpleados implements Comparator<Empleado> {

	@Override
	public int compare(Empleado empleado1, Empleado empleado2) {
		if(empleado1.getNombre().equals(empleado2.getNombre())){
			if(empleado1.getEdad() == empleado2.getEdad()){
				if(empleado1.getSalario() == empleado2.getSalario()){
					return 0;
				}else{
					return (int)(empleado1.getSalario() - empleado2.getSalario());
				}
			}else{
				return empleado1.getEdad() - empleado2.getEdad();
			}
		}else{
			return empleado1.getNombre().compareTo(empleado2.getNombre());
		}
	}

}
