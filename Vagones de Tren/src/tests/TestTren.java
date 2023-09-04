package tests;

import org.junit.Test;

import miPackage.Tren;

public class TestTren {

	@Test
	public void testCaso00() {
		Tren tren = new Tren("LoteDePrueba/00_CasoEjemplo/entrada/vagones.in");
		tren.separarAnimalesEnVagones("LoteDePrueba/00_CasoEjemplo/salida producida/vagones.out");
	}
	
	@Test
	public void testCaso01() {
		Tren tren = new Tren("LoteDePrueba/01_VanTodosSolos/entrada/vagones.in");
		tren.separarAnimalesEnVagones("LoteDePrueba/01_VanTodosSolos/salida producida/vagones.out");
	}
	
	@Test
	public void testCaso02() {
		Tren tren = new Tren("LoteDePrueba/02_SoloHayUnaEspecie/entrada/vagones.in");
		tren.separarAnimalesEnVagones("LoteDePrueba/02_SoloHayUnaEspecie/salida producida/vagones.out");
	}
	
	@Test
	public void testCaso03() {
		Tren tren = new Tren("LoteDePrueba/03_SoloHayUnAnimal/entrada/vagones.in");
		tren.separarAnimalesEnVagones("LoteDePrueba/03_SoloHayUnAnimal/salida producida/vagones.out");
	}
	
	@Test
	public void testCaso04() {
		Tren tren = new Tren("LoteDePrueba/04_AnimalesDistintosAgresividadesIguales/entrada/vagones.in");
		tren.separarAnimalesEnVagones("LoteDePrueba/04_AnimalesDistintosAgresividadesIguales/salida producida/vagones.out");
	}
	
	@Test
	public void testCaso05() {
		Tren tren = new Tren("LoteDePrueba/05_AnimalesConAgresividadNula/entrada/vagones.in");
		tren.separarAnimalesEnVagones("LoteDePrueba/05_AnimalesConAgresividadNula/salida producida/vagones.out");
	}
	
	@Test
	public void testCaso06() {
		Tren tren = new Tren("LoteDePrueba/06_FatigaDeAgresividadM�ximaAdmisibleEnTren/entrada/vagones.in");
		tren.separarAnimalesEnVagones("LoteDePrueba/06_FatigaDeAgresividadM�ximaAdmisibleEnTren/salida producida/vagones.out");
	}
	
	@Test
	public void testCaso07() {
		Tren tren = new Tren("LoteDePrueba/07_FatigaDeAgresividadM�ximaAdmisibleEnAnimales/entrada/vagones.in");
		tren.separarAnimalesEnVagones("LoteDePrueba/07_FatigaDeAgresividadM�ximaAdmisibleEnAnimales/salida producida/vagones.out");
	}
	
	@Test
	public void testCaso08() {
		Tren tren = new Tren("LoteDePrueba/08_FatigaEnCantidadDeAnimalesATransportar/entrada/vagones.in");
		tren.separarAnimalesEnVagones("LoteDePrueba/08_FatigaEnCantidadDeAnimalesATransportar/salida producida/vagones.out");
	}
	
	@Test
	public void testCaso09() {
		Tren tren = new Tren("LoteDePrueba/09_FatigaEnCantidadM�ximaDeEspecies/entrada/vagones.in");
		tren.separarAnimalesEnVagones("LoteDePrueba/09_FatigaEnCantidadM�ximaDeEspecies/salida producida/vagones.out");
	}
	
	
}
