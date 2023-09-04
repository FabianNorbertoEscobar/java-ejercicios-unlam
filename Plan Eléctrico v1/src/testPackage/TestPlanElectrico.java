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
		PlanElectrico pe = new PlanElectrico("lote de prueba/entradas/02_�nicoTendidoDeMenorCosto.in");
		pe.resolver();
		pe.grabarRecorridoEnArchivo("lote de prueba/salidas producidas/02_�nicoTendidoDeMenorCosto.out");
	}
	
	@Test
	public void testCaso03() throws IOException {
		PlanElectrico pe = new PlanElectrico("lote de prueba/entradas/03_SoloUnaCiudadConCentralEl�ctrica.in");
		pe.resolver();
		pe.grabarRecorridoEnArchivo("lote de prueba/salidas producidas/03_SoloUnaCiudadConCentralEl�ctrica.out");
	}
	
	@Test
	public void testCaso04() throws IOException {
		PlanElectrico pe = new PlanElectrico("lote de prueba/entradas/04_SoloUnaCiudadSinCentralEl�ctrica.in");
		pe.resolver();
		pe.grabarRecorridoEnArchivo("lote de prueba/salidas producidas/04_SoloUnaCiudadSinCentralEl�ctrica.out");
	}
	
	@Test
	public void testCaso05() throws IOException {
		PlanElectrico pe = new PlanElectrico("lote de prueba/entradas/05_TodasLasCiudadesTienenCentralesEl�ctricas.in");
		pe.resolver();
		pe.grabarRecorridoEnArchivo("lote de prueba/salidas producidas/05_TodasLasCiudadesTienenCentralesEl�ctricas.out");
	}
	
	@Test
	public void testCaso06() throws IOException {
		PlanElectrico pe = new PlanElectrico("lote de prueba/entradas/06_NingunaCiudadTieneCentralEl�ctrica.in");
		pe.resolver();
		pe.grabarRecorridoEnArchivo("lote de prueba/salidas producidas/06_NingunaCiudadTieneCentralEl�ctrica.out");
	}
}
