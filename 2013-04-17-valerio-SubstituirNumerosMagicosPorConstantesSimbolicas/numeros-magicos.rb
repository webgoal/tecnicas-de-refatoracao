class Formula

	CONSTANTE_GRAVITACIONAL = 9.81
	CONSTANTE_PLANCK = 6.6

	def energia_potencial(massa, altura)
		massa * CONSTANTE_GRAVITACIONAL * altura
	end	

	def energia_foton(frequencia)
		CONSTANTE_PLANCK * frequencia
	end	

end

require "test/unit"
class TestFormula < Test::Unit::TestCase

	def test_energia_potencial
		formula = Formula.new
		assert_equal(9.81, formula.energia_potencial(1, 1))
		assert_equal(19.62, formula.energia_potencial(1, 2))
	end

	def test_energia_foton
		formula = Formula.new
		assert_equal(13.2, formula.energia_foton(2))
	end

end