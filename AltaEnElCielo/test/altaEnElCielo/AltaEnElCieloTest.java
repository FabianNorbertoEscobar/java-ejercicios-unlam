package altaEnElCielo;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Test;

public class AltaEnElCieloTest {

	private File entrada;
	private File salida;

	@Test
	public void caso00() {
		this.entrada = new File("Preparaci�n de Prueba/Lote de Prueba/Entrada/00_CasoTrivial.in");
		this.salida = new File("Ejecuci�n de Prueba/Salida Producida/00_CasoTrivial.out");
	}

	@Test
	public void caso01() {
		this.entrada = new File("Preparaci�n de Prueba/Lote de Prueba/Entrada/01_RecibenSoloElRetazoInicial.in");
		this.salida = new File("Ejecuci�n de Prueba/Salida Producida/01_RecibenSoloElRetazoInicial.out");
	}

	@Test
	public void caso02() {
		this.entrada = new File("Preparaci�n de Prueba/Lote de Prueba/Entrada/02_ElRolloQuedaVac�o.in");
		this.salida = new File("Ejecuci�n de Prueba/Salida Producida/02_ElRolloQuedaVac�o.out");
	}

	@Test
	public void caso03() {
		this.entrada = new File("Preparaci�n de Prueba/Lote de Prueba/Entrada/03_SoloUnaBanderaTieneCosturas.in");
		this.salida = new File("Ejecuci�n de Prueba/Salida Producida/03_SoloUnaBanderaTieneCosturas.out");
	}

	@Test
	public void caso04() {
		this.entrada = new File("Preparaci�n de Prueba/Lote de Prueba/Entrada/04_TodasTienenCosturaMenosUna.in");
		this.salida = new File("Ejecuci�n de Prueba/Salida Producida/04_TodasTienenCosturaMenosUna.out");
	}

	@Test
	public void caso05() {
		this.entrada = new File("Preparaci�n de Prueba/Lote de Prueba/Entrada/05_TodasLasBanderasQuedanIgualDeLargas.in");
		this.salida = new File("Ejecuci�n de Prueba/Salida Producida/05_TodasLasBanderasQuedanIgualDeLargas.out");
	}

	@Test
	public void caso06() {
		this.entrada = new File("Preparaci�n de Prueba/Lote de Prueba/Entrada/06_NoHaySecuenciaCom�n.in");
		this.salida = new File("Ejecuci�n de Prueba/Salida Producida/06_NoHaySecuenciaCom�n.out");
	}

	@Test
	public void caso07() {
		this.entrada = new File("Preparaci�n de Prueba/Lote de Prueba/Entrada/07_SecuenciaCom�nDeLongitudUno.in");
		this.salida = new File("Ejecuci�n de Prueba/Salida Producida/07_SecuenciaCom�nDeLongitudUno.out");
	}

	@Test
	public void caso08() {
		this.entrada = new File("Preparaci�n de Prueba/Lote de Prueba/Entrada/08_TodosTienenLaSecuenciaCom�n.in");
		this.salida = new File("Ejecuci�n de Prueba/Salida Producida/08_TodosTienenLaSecuenciaCom�n.out");
	}

	@Test
	public void caso09() {
		this.entrada = new File("Preparaci�n de Prueba/Lote de Prueba/Entrada/09_Fatiga.in");
		this.salida = new File("Ejecuci�n de Prueba/Salida Producida/09_Fatiga.out");
	}

	@After
	public void resolver() throws IOException {
		AltaEnElCielo alta = new AltaEnElCielo(this.entrada, this.salida);
		alta.resolver();
	}
}
