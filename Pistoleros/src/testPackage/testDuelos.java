package testPackage;

import java.util.Random;

import org.junit.Test;

import junit.framework.Assert;
import miPackage.*;

@SuppressWarnings("deprecation")
public class testDuelos {

	@Test
	public void testDueloSheriffVsSheriff() {
		Sheriff sheriff1 = new Sheriff("Marcos", new Punto(4, 5), new Derringer());
		Sheriff sheriff2 = new Sheriff("Omar", new Punto(4, 4), new Winchester());

		Random rand = new Random();
		while (sheriff1.estaVivo() && sheriff2.estaVivo()) {
			if (rand.nextInt() % 2 == 0) {
				sheriff1.dispara(sheriff2);
			} else {
				sheriff2.dispara(sheriff1);
			}
		}

		Assert.assertTrue(sheriff1.estaVivo());
	}

	@Test
	public void testDueloSheriffVsAlguacil() {
		Sheriff sheriff1 = new Sheriff("Marcos", new Punto(4, 5), new Colt45());
		Alguacil alguacil1 = new Alguacil("Omar", new Punto(4, 4), new Derringer());

		Random rand = new Random();
		while (sheriff1.estaVivo() && alguacil1.estaVivo()) {
			if (rand.nextInt() % 2 == 0) {
				sheriff1.dispara(alguacil1);
			} else {
				alguacil1.dispara(sheriff1);
			}
		}

		Assert.assertTrue(sheriff1.estaVivo());
	}

	@Test
	public void testDueloSheriffVsRenegado() {
		Sheriff sheriff1 = new Sheriff("Marcos", new Punto(4, 5), new Winchester());
		Renegado renegado1 = new Renegado("Omar", new Punto(4, 4), new Derringer());

		Random rand = new Random();
		while (sheriff1.estaVivo() && renegado1.estaVivo()) {
			if (rand.nextInt() % 2 == 0) {
				sheriff1.dispara(renegado1);
			} else {
				renegado1.dispara(sheriff1);
			}
		}

		Assert.assertTrue(sheriff1.estaVivo());
	}

	@Test
	public void testDueloAlguacilVsAlguacil() {
		Alguacil alguacil1 = new Alguacil("Marcos", new Punto(4, 5), new Colt45());
		Alguacil alguacil2 = new Alguacil("Omar", new Punto(4, 4), new Winchester());

		Random rand = new Random();
		while (alguacil1.estaVivo() && alguacil2.estaVivo()) {
			if (rand.nextInt() % 2 == 0) {
				alguacil1.dispara(alguacil2);
			} else {
				alguacil2.dispara(alguacil1);
			}
		}

		Assert.assertTrue(alguacil1.estaVivo());
	}

	@Test
	public void testDueloAlguacilVsRenegado() {
		Alguacil alguacil1 = new Alguacil("Marcos", new Punto(4, 5), new Derringer());
		Renegado renegado1 = new Renegado("Omar", new Punto(4, 4), new Colt45());

		Random rand = new Random();
		while (alguacil1.estaVivo() && renegado1.estaVivo()) {
			if (rand.nextInt() % 2 == 0) {
				alguacil1.dispara(renegado1);
			} else {
				renegado1.dispara(alguacil1);
			}
		}

		Assert.assertTrue(alguacil1.estaVivo());
	}

	@Test
	public void testDueloRenegadoVsRenegado() {
		Renegado renegado1 = new Renegado("Marcos", new Punto(4, 5), new Derringer());
		Renegado renegado2 = new Renegado("Omar", new Punto(4, 4), new Winchester());

		Random rand = new Random();
		while (renegado1.estaVivo() && renegado2.estaVivo()) {
			if (rand.nextInt() % 2 == 0) {
				renegado1.dispara(renegado2);
			} else {
				renegado2.dispara(renegado1);
			}
		}

		Assert.assertTrue(renegado1.estaVivo());
	}

	@Test
	public void testDueloTriple() {
		Sheriff sheriff = new Sheriff("Marcos", new Punto(4, 5), new Winchester());
		Alguacil alguacil = new Alguacil("Omar", new Punto(4, 4), new Winchester());
		Renegado renegado = new Renegado("Antonio", new Punto(4, 4), new Winchester());

		Random rand = new Random();
		int sobrevivientes = 3;
		while (sobrevivientes > 1) {
			switch (Math.abs(rand.nextInt() % 6) + 1) {
			case 1:
				renegado.dispara(sheriff);
				break;
			case 2:
				sheriff.dispara(alguacil);
				break;
			case 3:
				alguacil.dispara(sheriff);
				break;
			case 4:
				alguacil.dispara(renegado);
				break;
			case 5:
				sheriff.dispara(renegado);
				break;
			case 6:
				renegado.dispara(alguacil);
				break;
			}

			if (!sheriff.estaVivo()) {
				sobrevivientes--;
			}
			if (!alguacil.estaVivo()) {
				sobrevivientes--;
			}
			if (!renegado.estaVivo()) {
				sobrevivientes--;
			}
		}

		if (sheriff.estaVivo()) {
			System.out.println("Sheriff gana");
		} else if (alguacil.estaVivo()) {
			System.out.println("Alguacil gana");
		} else {
			System.out.println("Renegado gana");
		}
	}
}
