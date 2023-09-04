package miPack;

public class Contador {

	private int cuenta;
	
	public void contar() {
		this.cuenta++;
	}
	
	public int mostrar() {
		return this.cuenta;
	}
	
	public void resetear() {
		this.cuenta = 0;
	}
}
