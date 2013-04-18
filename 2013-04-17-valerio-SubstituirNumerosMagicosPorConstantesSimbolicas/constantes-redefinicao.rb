class Circulo

	def calculaCircunferencia(raio)
		2 * 3.14 * raio
	end	

end

require "test/unit"

class TestCirculo < Test::Unit::TestCase
	def testCircunferencia
		circulo = Circulo.new
		assert_equal(31.4, circulo.calculaCircunferencia(5))
	end	
end
