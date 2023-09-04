package collections;

public class Empleado implements Comparable<Empleado> {

	private String nombre;
	private int edad;
	private double salario;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Empleado(String nombre, int edad, double salario) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + "]";
	}

	@Override
	public int compareTo(Empleado empleado) {
		if(this.nombre.equals(empleado.nombre)){
			if(this.edad == empleado.edad){
				if(this.salario == empleado.salario){
					return 0;
				}else{
					return (int)(this.salario - empleado.salario);
				}
			}else{
				return this.edad - empleado.edad;
			}
		}else{
			return this.nombre.compareTo(empleado.nombre);
		}
	}
	
}
