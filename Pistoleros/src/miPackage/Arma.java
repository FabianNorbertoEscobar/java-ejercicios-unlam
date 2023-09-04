package miPackage;

public abstract class Arma {

	private int balas;
	private int cargador;
	private int daño;
	private double alcance;

	private boolean estado;
	private boolean turno;
	private int tiros;

	public int getBalas() {
		return balas;
	}

	public void setBalas(int balas) {
		this.balas = balas;
	}

	public int getCargador() {
		return cargador;
	}

	public void setCargador(int cargador) {
		this.cargador = cargador;
	}

	public int getDaño() {
		return daño;
	}

	public void setDaño(int daño) {
		this.daño = daño;
	}

	public double getAlcance() {
		return alcance;
	}

	public void setAlcance(double alcance) {
		this.alcance = alcance;
	}

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public boolean getTurno() {
		return turno;
	}

	public void setTurno(boolean turno) {
		this.turno = turno;
	}

	public int getTiros() {
		return tiros;
	}

	public void setTiros(int tiros) {
		this.tiros = tiros;
	}
	
	public Arma(int balas, int cargador, int daño, double alcance) {
		this.balas = balas;
		this.cargador = cargador;
		this.daño = daño;
		this.alcance = alcance;
		this.estado = true;
		this.turno = true;
		this.tiros = 0;
	}
	
	public abstract String tipoArma();

	public boolean estaRota() {
		return !getEstado();
	}

	public boolean tieneBalas() {
		return this.balas > 0;
	}

	public void recargar() {
		this.balas = this.cargador;
		if (this.tipoArma() == "Winchester") {
			this.turno = false;
		}
	}

	public boolean pierdeTurno() {
		return !this.turno;
	}

	public void turnoPerdido() {
		this.turno = true;
	}

	public void dispara() {
		if (!this.estaRota()) {
			if (this.tieneBalas()) {
				this.balas--;
				this.tiros++;
				if (this.tipoArma() == "Derringer") {
					if (this.tiros == 8) {
						this.estado = false;
					}
				}
			}
		}
	}
}
