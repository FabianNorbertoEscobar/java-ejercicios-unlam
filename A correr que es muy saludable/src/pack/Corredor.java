package pack;

public class Corredor {

	private int edad;
	private char sexo;
	private int numeroCorredor;
	private int numeroCategoria;
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public int getNumeroCorredor() {
		return numeroCorredor;
	}
	public void setNumeroCorredor(int numeroCorredor) {
		this.numeroCorredor = numeroCorredor;
	}
	
	public int getNumeroCategoria() {
		return numeroCategoria;
	}
	public void setNumeroCategoria(int numeroCategoria) {
		this.numeroCategoria = numeroCategoria;
	}
	
	public Corredor(int edad, char sexo, int numeroCorredor, int numeroCategoria) {
		super();
		this.edad = edad;
		this.sexo = sexo;
		this.numeroCorredor = numeroCorredor;
		this.numeroCategoria = numeroCategoria;
	}
	
}
