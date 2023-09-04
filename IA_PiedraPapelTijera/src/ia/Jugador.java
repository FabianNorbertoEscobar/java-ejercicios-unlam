package ia;

import juego.Forma;
import juego.Resultado;

/**
 * La interfaz jugador establece los comportamientos de un jugador de piedra,
 * papel o tijera
 * 
 */
public interface Jugador {

	/**
	 * El jugador juega una mano en una partida
	 * 
	 * @return la forma con la que se juega
	 */
	public Forma jugar();

	/**
	 * El jugador obtiene un resultado al jugar
	 * 
	 * @param resultado
	 *            es el resultado tras jugar
	 * @param formaDelOtro
	 *            es la forma de la otra mano, contra la que se obtuvo ese
	 *            resultado
	 */
	public void resultado(Resultado resultado, Forma formaDelOtro);

	/**
	 * Getter del nombre del jugador
	 * 
	 * @return el nombre del jugador
	 */
	public String getNombre();

}
