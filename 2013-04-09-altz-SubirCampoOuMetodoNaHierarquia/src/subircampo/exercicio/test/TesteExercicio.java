package subircampo.exercicio.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import subircampo.exercicio.src.Cliente;
import subircampo.exercicio.src.ClientePreferencial;

public class TesteExercicio {

	@Test
	public void testCalculo() {
		Cliente cliente = new Cliente();
		cliente.setSaldo(100.00);
		assertEquals(10.00, cliente.calculaTaxaMensal(), 0);
		
		Cliente cliente2 = new Cliente();
		cliente2.setSaldo(1000.00);
		assertEquals(0.00, cliente2.calculaTaxaMensal(), 0);
		
		ClientePreferencial clientePreferencial = new ClientePreferencial();
		clientePreferencial.setSaldo(100.00);
		assertEquals(15.00, clientePreferencial.calculaTaxaMensal(), 0);

		ClientePreferencial clientePreferencial2 = new ClientePreferencial();
		clientePreferencial2.setSaldo(1000.00);
		assertEquals(15.00, clientePreferencial2.calculaTaxaMensal(), 0);
		
		ClientePreferencial clientePreferencial3 = new ClientePreferencial();
		clientePreferencial3.setSaldo(10000.00);
		assertEquals(0.00, clientePreferencial3.calculaTaxaMensal(), 0);
	}

}
