import static org.junit.Assert.*;

import org.junit.Test;


public class PersonagemTest {

	@Test
	public void testVerificaInterfaceEscondida() {
		Personagem personagem = new Personagem();
		
		boolean expected = false;
		boolean results = personagem.isInterface_visivel();
		
		assertEquals(expected, results);
	}
	
	@Test
	public void testVerificaInterfaceVisivel() {
		Personagem personagem = new Personagem();
		personagem.verificaStatus();
		
		boolean expected = true;
		boolean results = personagem.isInterface_visivel();
		
		assertEquals(expected, results);
	}

}
