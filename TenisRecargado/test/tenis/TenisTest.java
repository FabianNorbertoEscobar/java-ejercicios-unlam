package tenis;

import java.io.File;

import org.junit.Test;

public class TenisTest {

	@Test
	public void caso_01() {
		File entrada = new File("preparación de prueba/lote de prueba/entrada/01_AGanaTodosLosJuegos.in");
		File salida = new File("ejecución de prueba/salida obtenida/01_AGanaTodosLosJuegos.out");
		new TenisRecargado(entrada, salida).resolver();
	}

	@Test
	public void caso_02() {
		File entrada = new File("preparación de prueba/lote de prueba/entrada/02_BGanaTodosLosJuegos.in");
		File salida = new File("ejecución de prueba/salida obtenida/02_BGanaTodosLosJuegos.out");
		new TenisRecargado(entrada, salida).resolver();
	}

	@Test
	public void caso_03() {
		File entrada = new File("preparación de prueba/lote de prueba/entrada/03_AGanaTodosLosSetsPerdiendoJuegos.in");
		File salida = new File("ejecución de prueba/salida obtenida/03_AGanaTodosLosSetsPerdiendoJuegos.out");
		new TenisRecargado(entrada, salida).resolver();
	}

	@Test
	public void caso_04() {
		File entrada = new File("preparación de prueba/lote de prueba/entrada/04_BGanaTodosLosSetsPerdiendoJuegos.in");
		File salida = new File("ejecución de prueba/salida obtenida/04_BGanaTodosLosSetsPerdiendoJuegos.out");
		new TenisRecargado(entrada, salida).resolver();
	}

	@Test
	public void caso_05() {
		File entrada = new File("preparación de prueba/lote de prueba/entrada/05_AGana.in");
		File salida = new File("ejecución de prueba/salida obtenida/05_AGana.out");
		new TenisRecargado(entrada, salida).resolver();
	}

	@Test
	public void caso_06() {
		File entrada = new File("preparación de prueba/lote de prueba/entrada/06_BGana.in");
		File salida = new File("ejecución de prueba/salida obtenida/06_BGana.out");
		new TenisRecargado(entrada, salida).resolver();
	}

	@Test
	public void caso_07() {
		File entrada = new File("preparación de prueba/lote de prueba/entrada/07_FatigaNJuegos.in");
		File salida = new File("ejecución de prueba/salida obtenida/07_FatigaNJuegos.out");
		new TenisRecargado(entrada, salida).resolver();
	}

	@Test
	public void caso_08() {
		File entrada = new File("preparación de prueba/lote de prueba/entrada/08_FatigaNJuegosV2.in");
		File salida = new File("ejecución de prueba/salida obtenida/08_FatigaNJuegosV2.out");
		new TenisRecargado(entrada, salida).resolver();
	}

}
