package testing;

import java.io.File;
import java.io.IOException;
import org.junit.Test;
import principalPackage.NombresRepetidos;

public class TestNombesRepetidos {

	@Test
	public void testCaso01() throws IOException {
		File entrada = new File("Lote de Prueba/Entrada/01_MásNombresQueLosMásRepetidosBuscados.in");
		File salida = new File("Ejecución de Prueba/Salida Producida/01_MásNombresQueLosMásRepetidosBuscados.out");
		NombresRepetidos campamento = new NombresRepetidos(entrada, salida);
		campamento.resolver();
	}

	@Test
	public void testCaso02() throws IOException {
		File entrada = new File("Lote de Prueba/Entrada/02_MenosNombresQueLosMásRepetidosBuscados.in");
		File salida = new File("Ejecución de Prueba/Salida Producida/02_MenosNombresQueLosMásRepetidosBuscados.out");
		NombresRepetidos campamento = new NombresRepetidos(entrada, salida);
		campamento.resolver();
	}

	@Test
	public void testCaso03() throws IOException {
		File entrada = new File("Lote de Prueba/Entrada/03_MenosNombresDiferentesQueLosMásRepetidosBuscados.in");
		File salida = new File(
				"Ejecución de Prueba/Salida Producida/03_MenosNombresDiferentesQueLosMásRepetidosBuscados.out");
		NombresRepetidos campamento = new NombresRepetidos(entrada, salida);
		campamento.resolver();
	}

	@Test
	public void testCaso04() throws IOException {
		File entrada = new File("Lote de Prueba/Entrada/04_DosChicos.in");
		File salida = new File("Ejecución de Prueba/Salida Producida/04_DosChicos.out");
		NombresRepetidos campamento = new NombresRepetidos(entrada, salida);
		campamento.resolver();
	}

	@Test
	public void testCaso05() throws IOException {
		File entrada = new File("Lote de Prueba/Entrada/05_TodosLosNombresEstánEntreLosMásRepetidos.in");
		File salida = new File("Ejecución de Prueba/Salida Producida/05_TodosLosNombresEstánEntreLosMásRepetidos.out");
		NombresRepetidos campamento = new NombresRepetidos(entrada, salida);
		campamento.resolver();
	}

	@Test
	public void testCaso06() throws IOException {
		File entrada = new File("Lote de Prueba/Entrada/06_TodosLosChicosTienenElMismoNombre.in");
		File salida = new File("Ejecución de Prueba/Salida Producida/06_TodosLosChicosTienenElMismoNombre.out");
		NombresRepetidos campamento = new NombresRepetidos(entrada, salida);
		campamento.resolver();
	}

	@Test
	public void testCaso07() throws IOException {
		File entrada = new File("Lote de Prueba/Entrada/07_Fatiga.in");
		File salida = new File("Ejecución de Prueba/Salida Producida/07_Fatiga.out");
		NombresRepetidos campamento = new NombresRepetidos(entrada, salida);
		campamento.resolver();
	}

}
