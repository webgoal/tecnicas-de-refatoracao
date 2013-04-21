package webgoal.athlete;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class ExemploTest {

	@Test
	public void testShouldCalculateValorPorIncapacitacao() {
		assertEquals(30, new ExemploOR(3, 10, false).valorPorIncapacidade());
		assertEquals(0, new ExemploOR(1, 10, false).valorPorIncapacidade());
		assertEquals(0, new ExemploOR(3, 13, false).valorPorIncapacidade());
		assertEquals(0, new ExemploOR(3, 10, true).valorPorIncapacidade());
	}
	
	@Test
	public void testShouldCalculateDescontos() {
		assertEquals(1, new ExemploAND(false, 11).percentualDesconto());
		assertEquals(1, new ExemploAND(true, 9).percentualDesconto());
		assertEquals(2, new ExemploAND(true, 11).percentualDesconto());
	}

}
