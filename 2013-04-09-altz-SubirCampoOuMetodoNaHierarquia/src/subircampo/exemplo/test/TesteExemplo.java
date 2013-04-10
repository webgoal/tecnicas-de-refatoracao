package subircampo.exemplo.test;

import static org.junit.Assert.*;

import org.junit.Test;

import subircampo.exemplo.src.Engenheiro;
import subircampo.exemplo.src.Vendedor;

public class TesteExemplo {

	@Test
	public void testArmazenaValor() {
		String nome = "Gutgut";
		
		Vendedor vendedor = new Vendedor();
		vendedor.setNome(nome);
		assertEquals(nome, vendedor.getNome());
		
		Engenheiro engenheiro = new Engenheiro();
		engenheiro.setNome(nome);
		assertEquals(nome, engenheiro.getNome());
	}

}
