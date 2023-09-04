package miPackage;

public abstract class Pistolero {

	private String nombre;
	private Punto posicion;

	private int salud;
	private Arma arma;

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Punto getPosicion() {
		return posicion;
	}
	public void setPosicion(Punto posicion) {
		this.posicion = posicion;
	}

	public int getSalud() {
		return salud;
	}
	public void setSalud(int salud) {
		this.salud = salud;
	}

	public Arma getArma() {
		return arma;
	}
	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public Pistolero(String nombre, Punto posicion, int salud, Arma arma) {
		this.nombre = nombre;
		this.posicion = posicion;
		this.salud = salud;
		this.arma = arma;
	}

	public Pistolero(String nombre, Punto posicion, int salud) {
		this.nombre = nombre;
		this.posicion = posicion;
		this.salud = salud;
		this.arma = null;
	}
	
	public abstract String tipoPistolero();

	public boolean estaVivo() {
		return this.salud > 0;
	}

	public boolean tieneArma() {
		return this.arma != null;
	}

	public void recargarArma() {
		if (this.estaVivo()) {
			if (this.tieneArma()) {
				this.arma.recargar();
			}
		}
	}

	public void cambiarArma(String tipoArma) {
		switch (tipoArma) {
		case "Derringer":
			this.setArma(new Derringer());
			break;
		case "Winchester":
			this.setArma(new Winchester());
			break;
		case "Colt45":
			this.setArma(new Colt45());
			break;
		}
	}

	public double distancia(Pistolero atacado) {
		return Math.sqrt(Math.pow(this.posicion.getX() - atacado.posicion.getX(), 2)
				+ Math.pow(this.posicion.getY() - atacado.posicion.getY(), 2));
	}

	public void recibeDaño(int daño) {
		if (this.estaVivo()) {
			if (this.salud <= daño) {
				this.salud -= daño;
			} else {
				this.salud = 0;
			}
		}
	}

	public void dispara(Pistolero atacado) {
		if (this.estaVivo()) {
			if (this.tieneArma()) {
				if (this.arma.estaRota()) {
					this.cambiarArma(this.arma.tipoArma());
				}
				if (!this.arma.tieneBalas()) {
					this.arma.recargar();
				}
				if (!this.arma.pierdeTurno()) {
					this.arma.dispara();
					if (this.distancia(atacado) <= this.arma.getAlcance()) {
						if (atacado.estaVivo()) {
							atacado.recibeDaño(this.arma.getDaño());
						}
					}
				} else {
					this.arma.turnoPerdido();
				}
			}
		}
	}
}
