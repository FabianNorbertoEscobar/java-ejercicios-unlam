package piratas;

public class Pirata {

	private Estado estado;
	private int ataque;
	private int defensa;
	private int puntos;

	public Pirata() {
		this.puntos = 0;
		this.estado = new Saludable();
		this.ataque = this.estado.getAtaque();
		this.defensa = this.estado.getDefensa();
	}

	public Estado getEstado() {
		return estado;
	}

	public int getAtaque() {
		return ataque;
	}
	
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}
	
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public int getPuntos() {
		return puntos;
	}

	public void beberGrog() {
		Estado estadoAnterior = this.estado;
		this.estado = this.estado.beberGrog();
		if (this.estado.getEstadoPirata() != estadoAnterior.getEstadoPirata()) {
			this.ataque = this.estado.getAtaque();
			this.defensa = this.estado.getDefensa();
		}
	}

	public void beberJugo() {
		Estado estadoAnterior = this.estado;
		this.estado = this.estado.beberJugo();
		if (this.estado.getEstadoPirata() != estadoAnterior.getEstadoPirata()) {
			this.ataque = this.estado.getAtaque();
			this.defensa = this.estado.getDefensa();
		}
	}

	public void atacar(Pirata pirata) {
		this.puntos += this.ataque - pirata.defensa;
	}

}
