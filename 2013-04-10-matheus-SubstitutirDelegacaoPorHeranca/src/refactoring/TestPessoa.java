package refactoring;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPessoa {

	@Test
	public void test() {
		Empregado empregado = new Empregado();
		empregado.setNome("GutGut");
		assertEquals("GutGut", empregado.getNome());		
	}

}
