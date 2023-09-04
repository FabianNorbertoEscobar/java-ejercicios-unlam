package ia;

import java.util.concurrent.ThreadLocalRandom;

import juego.Forma;
import juego.Resultado;

/**
 * Inteligencia artificial RenataSalva.<br>
 * Esta IA sabe jugar a Piedra, Papel o Tijera
 *
 */
public class RenataSalva implements Jugador {

	private String nombreJugador = "Renata Salva";

	private Resultado ultimoResultado = Resultado.EMPATA;
	private Forma ultimaForma = Forma.PAPEL;

	/**
	 * El jugador juega una mano en una partida
	 * 
	 * @return la forma con la que se juega
	 */
	@Override
	public Forma jugar() {

		if (this.ultimoResultado == Resultado.GANA || this.ultimoResultado == Resultado.PIERDE) {
			if (this.ultimaForma == Forma.PIEDRA) {
				this.ultimaForma = Forma.TIJERA;
				return Forma.TIJERA;

			} else if (this.ultimaForma == Forma.PAPEL) {
				this.ultimaForma = Forma.PIEDRA;
				return Forma.PIEDRA;
			}
			this.ultimaForma = Forma.PAPEL;
			return Forma.PAPEL;

		} else {
			int numero = ThreadLocalRandom.current().nextInt(1, 3 + 1);
			if (numero == 1) {
				this.ultimaForma = Forma.PAPEL;
				return Forma.PAPEL;
			} else if (numero == 2) {
				this.ultimaForma = Forma.PIEDRA;
				return Forma.PIEDRA;
			} else {
				this.ultimaForma = Forma.TIJERA;
				return Forma.TIJERA;
			}
		}
	}

	/**
	 * El jugador obtiene un resultado al jugar
	 * 
	 * @param resultado
	 *            es el resultado tras jugar
	 * @param formaDelOtro
	 *            es la forma de la otra mano, contra la que se obtuvo ese
	 *            resultado
	 */
	@Override
	public void resultado(Resultado resultado, Forma formaDelOtro) {
		this.ultimoResultado = resultado;
	}

	/**
	 * Getter del nombre del jugador
	 * 
	 * @return el nombre del jugador
	 */
	@Override
	public String getNombre() {
		return this.nombreJugador;
	}

}
