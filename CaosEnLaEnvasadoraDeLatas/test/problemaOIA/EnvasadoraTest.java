package problemaOIA;

import java.io.File;

import org.junit.Test;

public class EnvasadoraTest {

	@Test
	public void caso01() {
		File entrada = new File(
				"preparación de prueba/lote de prueba/entrada/01_MasDeDosSecuenciasDeLatasBienEtiquetadasDeDistintaLongitud.in");
		File salida = new File(
				"ejecución de prueba/salida obtenida/01_MasDeDosSecuenciasDeLatasBienEtiquetadasDeDistintaLongitud.out");
		new EnvasadoraDeLatas(entrada, salida).resolver();
	}

	@Test
	public void caso02() {
		File entrada = new File(
				"preparación de prueba/lote de prueba/entrada/02_SoloDosSecuenciasDeLatasBienEtiquetadasDeDistintaLongitud.in");
		File salida = new File(
				"ejecución de prueba/salida obtenida/02_SoloDosSecuenciasDeLatasBienEtiquetadasDeDistintaLongitud.out");
		new EnvasadoraDeLatas(entrada, salida).resolver();
	}

	@Test
	public void caso03() {
		File entrada = new File(
				"preparación de prueba/lote de prueba/entrada/03_UnaSolaSecuenciaDeLatasBienEtiquetadas.in");
		File salida = new File("ejecución de prueba/salida obtenida/03_UnaSolaSecuenciaDeLatasBienEtiquetadas.out");
		new EnvasadoraDeLatas(entrada, salida).resolver();
	}

	@Test
	public void caso04() {
		File entrada = new File("preparación de prueba/lote de prueba/entrada/04_TodasLasLatasBienEtiquetadas.in");
		File salida = new File("ejecución de prueba/salida obtenida/04_TodasLasLatasBienEtiquetadas.out");
		new EnvasadoraDeLatas(entrada, salida).resolver();
	}

	@Test
	public void caso05() {
		File entrada = new File("preparación de prueba/lote de prueba/entrada/05_UnaSolaLataBienEtiquetada.in");
		File salida = new File("ejecución de prueba/salida obtenida/05_UnaSolaLataBienEtiquetada.out");
		new EnvasadoraDeLatas(entrada, salida).resolver();
	}

	@Test
	public void caso06() {
		File entrada = new File(
				"preparación de prueba/lote de prueba/entrada/06_LaHileraTieneSoloUnaLataYBienEtiquetada.in");
		File salida = new File("ejecución de prueba/salida obtenida/06_LaHileraTieneSoloUnaLataYBienEtiquetada.out");
		new EnvasadoraDeLatas(entrada, salida).resolver();
	}

	@Test
	public void caso07() {
		File entrada = new File("preparación de prueba/lote de prueba/entrada/07_LaHileraTiene5000Latas.in");
		File salida = new File("ejecución de prueba/salida obtenida/07_LaHileraTiene5000Latas.out");
		new EnvasadoraDeLatas(entrada, salida).resolver();
	}
}
