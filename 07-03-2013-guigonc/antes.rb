class Carro 

	@@economico = 1
	@@sport = 2
	@@corrida = 3
	
	def initialize(tipo)
		@tipo = tipo
  end  
  
  def velocidade_maxima
  	case @tipo 
  		when @@economico
  			350
  	 	when @@sport
  			250
  		when @@corrida
  			150
  		else
  			0
  		end	
  end  

end

carro = Carro.new(2)
p carro.velocidade_maxima