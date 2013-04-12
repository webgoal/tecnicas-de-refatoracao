package exemplo

import org.junit.Test
import static org.junit.Assert.assertEquals

// Substituir registro por classe de dados - 187

/*
struct bobo {
	int valor;
}
*/

class ExemploTeste {

    @Test
    void additionIsWorking() {
			assert 4 == 2+2
    }

		@Test
		void objetoBoboExiste() {
			def valor = 3
			def objetoBobo = new ObjetoBobo()
			objetoBobo.valor = valor
			assertEquals valor, objetoBobo.valor
		}

}

/*
	-- Property and field rules --
	When Groovy is compiled to bytecode, the following rules are used:
	* If the name is declared with an access modifier (public, private or protected) then a field is generated.
	* A name declared with no access modifier generates a private field with public getter and setter (i.e. a property).
	* If a property is declared final the private field is created final and no setter is generated.
	* You can declare a property and also declare your own getter or setter.
	* You can declare a property and a field of the same name, the property will use that field then.
	* If you want a private or protected property you have to provide your own getter and setter which must be declared private or protected.
	* If you access a property from within the class the property is defined in at compile time with implicit or explicit this (for example this.foo, or simply foo), Groovy will access the field directly instead of going though the getter and setter.
	* If you access a property that does not exist using the explicit or implicit foo, then Groovy will access the property through the meta class, which may fail at runtime.
*/