package testPackage;

import java.io.IOException;

import org.junit.Test;

import myPackage.PlanElectrico;

public class TestPlanElectrico {

	@Test
	public void testCaso01() throws IOException {
		PlanElectrico pe = new PlanElectrico("lote de prueba/entradas/01_VariosTendidosDeMenorCosto.in");
		pe.resolver();
		pe.grabarRecorridoEnArchivo("lote de prueba/salidas producidas/01_VariosTendidosDeMenorCosto.out");
	}
	
	@Test
	public void testCaso02() throws IOException {
		PlanElectrico pe = new PlanElectrico("lote de prueba/entradas/02_ÚnicoTendidoDeMenorCosto.in");
		pe.resolver();
		pe.grabarRecorridoEnArchivo("lote de prueba/salidas producidas/02_ÚnicoTendidoDeMenorCosto.out");
	}
	
	@Test
	public void testCaso03() throws IOException {
		PlanElectrico pe = new PlanElectrico("lote de prueba/entradas/03_SoloUnaCiudadConCentralEléctrica.in");
		pe.resolver();
		pe.grabarRecorridoEnArchivo("lote de prueba/salidas producidas/03_SoloUnaCiudadConCentralEléctrica.out");
	}
	
	@Test
	public void testCaso04() throws IOException {
		PlanElectrico pe = new PlanElectrico("lote de prueba/entradas/04_SoloUnaCiudadSinCentralEléctrica.in");
		pe.resolver();
		pe.grabarRecorridoEnArchivo("lote de prueba/salidas producidas/04_SoloUnaCiudadSinCentralEléctrica.out");
	}
	
	@Test
	public void testCaso05() throws IOException {
		PlanElectrico pe = new PlanElectrico("lote de prueba/entradas/05_TodasLasCiudadesTienenCentralesEléctricas.in");
		pe.resolver();
		pe.grabarRecorridoEnArchivo("lote de prueba/salidas producidas/05_TodasLasCiudadesTienenCentralesEléctricas.out");
	}
	
	@Test
	public void testCaso06() throws IOException {
		PlanElectrico pe = new PlanElectrico("lote de prueba/entradas/06_NingunaCiudadTieneCentralEléctrica.in");
		pe.resolver();
		pe.grabarRecorridoEnArchivo("lote de prueba/salidas producidas/06_NingunaCiudadTieneCentralEléctrica.out");
	}
}
