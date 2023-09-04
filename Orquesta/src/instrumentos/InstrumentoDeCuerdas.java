package instrumentos;

public abstract class InstrumentoDeCuerdas extends Instrumento {

protected int cantidadCuerdas;
	
	public int getCantidadCuerdas() {
		return cantidadCuerdas;
	}

	public void setCantidadCuerdas(int cantidadCuerdas) {
		this.cantidadCuerdas = cantidadCuerdas;
	}

}
