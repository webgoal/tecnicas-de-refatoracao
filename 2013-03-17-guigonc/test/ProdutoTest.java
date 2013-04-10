import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ProdutoTest {

	private Double precoDeCusto;
	private Double margemDeLucro;
	private Produto produto;

	@Before
	public void  setUp() {
		precoDeCusto = new Double(2.0);
		margemDeLucro = new Double(0.5);
		produto = new Produto(precoDeCusto, margemDeLucro);
	}
	
	@Test
	public void shouldGetPreco() {
		assertEquals(new Double(3.0), produto.getPrecoVenda());
	}
	
	@Test
	public void shouldGetPrecoComDesconto() {
		assertEquals(new Double(2.7), produto.getPrecoVendaComDesconto());
	}
	
	@Test
	public void shouldGetPrecoComAcrescimo() {		
		assertEquals(new Double(3.15), produto.getPrecoVendaComAcrescimo());
	}

}
