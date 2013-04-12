package exercicio;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTeamMember {

	@Test
	public void test() {
		Developer dev = new Developer();
		assertEquals("public class DicaDoGutGut{ void sayTruth() { System.out.println(\"Java is better than Ruby\"); } }",dev.writeCode());
	}

}
