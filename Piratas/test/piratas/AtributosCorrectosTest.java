package piratas;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AtributosCorrectosTest {

	Pirata pirata;

	@Before
	public void estadoPirataAlEmpezar() {
		this.pirata = new Pirata();
	}

	@Test
	public void queAtributosCorrectosSiSaludable() {
		Assert.assertEquals(5, this.pirata.getAtaque());
		Assert.assertEquals(2, this.pirata.getDefensa());
	}

	@Test
	public void queAtributosCorrectosSiHiperSaludable() {
		this.pirata.beberJugo();
		Assert.assertEquals(10, this.pirata.getAtaque());
		Assert.assertEquals(-2, this.pirata.getDefensa());
	}

	@Test
	public void queAtributosCorrectosSiEscorbuto() {
		this.pirata.beberGrog();
		this.pirata.beberGrog();
		this.pirata.beberGrog();
		Assert.assertEquals(2, this.pirata.getAtaque());
		Assert.assertEquals(0, this.pirata.getDefensa());
	}
}
