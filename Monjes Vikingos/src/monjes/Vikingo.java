package monjes;

/**
 * Los Monjes Vikingos eran una raza formidable de luchadores que mantenían en secreto su existencia. <br>
 * Tenían cierto poder de ataque y una determinada capacidad de defensa. <br>
 * Si los herían moderadamente, entraban en trance, un estado conocido como Berserker.
 * En estado Berseker, su poder de ataque se triplicaba y su defensa se anulaba casi completamente. <br>
 * Si el monje se calmaba, pasaba a un estado de meditación.
 * En estado Meditación, su defensa se quintupplicaba pero su ataque se volvía ínfimo. <br>
 * Un Monje Vikingo no podía pasar de estado Berseker a Meditación, ni viceversa, sin pasar por su estado Natural.
 * @author Fabian
 *
 */
public class Vikingo {

	private Estado estado;

	private int ataque;
	private int defensa;
	private int salud;

	private final int ataqueBase;
	private final int defensaBase;

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
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

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	public int getAtaqueBase() {
		return ataqueBase;
	}

	public int getDefensaBase() {
		return defensaBase;
	}

	public Vikingo(int ataque, int defensa, int salud) {
		this.ataque = ataque;
		this.defensa = defensa;
		this.salud = salud;
		this.estado = new Natural();

		this.ataqueBase = ataque;
		this.defensaBase = defensa;
	}

	public void meditar() {
		this.estado = this.estado.meditar();
		this.modificarAtributos();
	}

	public void recibirAtaque(int ataque) {
		this.estado = this.estado.recibirAtaque((ataque * 100) / this.salud);
		this.modificarAtributos();
	}

	private void modificarAtributos() {
		if (this.estado.getEstadoActual() == EstadoVikingo.BERSERKER) {
			this.setAtaque(this.getAtaqueBase() * 3);
			this.setDefensa(1);
		} else if (this.estado.getEstadoActual() == EstadoVikingo.MEDITACION) {
			this.setAtaque(1);
			this.setDefensa(this.getDefensaBase() * 5);
		} else {
			this.setAtaque(this.getAtaqueBase());
			this.setDefensa(this.getDefensaBase());
		}
	}
	
	public void mostrar() {
		System.out.println("Vikingo");
		System.out.println("Estado actual: " + this.estado.getEstadoActual());
		System.out.println("Ataque: " + this.getAtaque());
		System.out.println("Defensa: " + this.getDefensa());
	}

}
