import static org.junit.Assert.*;

import org.junit.Test;


public class NegocioTest {

	@Test
	public void testVerificaNegocio() {
		Negocio negocio = new Negocio();
		
		int expected = 0;
		int results = negocio.verificaNegocio(100, true);
		
		assertEquals(expected, results);
	}

}
