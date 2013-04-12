package exercicio

import org.junit.Test
import static org.junit.Assert.assertEquals

/*
struct dmy {
	int dia;
	int mes;
	int ano;
}
*/

class ExercicioTeste {

		@Test
		void objetoBoboExiste() {
			def (dia, mes, ano) = [12, 4, 2013]
			def objetoBobo = new ObjetoBobo()
			objetoBobo.dia = dia
			objetoBobo.mes = mes
			objetoBobo.setAno(ano)
			assertEquals dia, objetoBobo.dia
			assertEquals mes, objetoBobo.mes
			assertEquals ano, objetoBobo.getAno()
		}
		
		@Test
		void objetoBoboInicializaValoresNoConstrutor() {
			def (dia, mes, ano) = [12, 4, 2013]
			def objetoBobo = new ObjetoBobo(ano:ano, dia:dia, mes:mes)
			assertEquals dia, objetoBobo.dia
			assertEquals mes, objetoBobo.mes
			assertEquals ano, objetoBobo.ano			
		}

}
