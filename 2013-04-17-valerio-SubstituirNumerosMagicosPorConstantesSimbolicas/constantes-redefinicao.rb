class Circulo

	PI = 3.14
	DOIS_PI = 2 * PI

	def calculaCircunferencia(raio)
		DOIS_PI * raio
	end	

end

require "test/unit"	

class TestCirculo < Test::Unit::TestCase
	def testCircunferencia
		circulo = Circulo.new
		assert_in_delta(31.4, circulo.calculaCircunferencia(5), 0.00000000000001)
	end	
end
