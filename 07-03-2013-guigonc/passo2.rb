class Carro 
	def initialize(tipo)
		self.tipo= tipo
  end  

	def tipo
		@tipo
	end

	def tipo= (tipo)
		case tipo
  		when AbstractTipoCarro::ECONOMICO
  			@tipo = Economico.new
  	 	when AbstractTipoCarro::SPORT
  			@tipo = Sport.new
  		when AbstractTipoCarro::CORRIDA
  			@tipo = Corrida.new
  		else
  			raise NotImplementedError
  	end	
	end

  def velocidade_maxima
  	@tipo.velocidade_maxima
  end 
end

class AbstractTipoCarro
	ECONOMICO = 1
	SPORT = 2
	CORRIDA = 3

	def velocidade_maxima
  	raise NotImplementedError		
  end 

	def tipo
		raise NotImplementedError
	end
end

class Economico < AbstractTipoCarro
	def velocidade_maxima
		150
	end

	def tipo
		AbstractTipoCarro::ECONOMICO
	end
end	

class Sport < AbstractTipoCarro
	def velocidade_maxima
		250
	end

	def tipo
		AbstractTipoCarro::SPORT
	end
end	

class Corrida < AbstractTipoCarro
	def velocidade_maxima
		350
	end

	def tipo
		AbstractTipoCarro::CORRIDA
	end
end	

carro = Carro.new(1)
p carro.velocidade_maxima

carro = Carro.new(2)
p carro.velocidade_maxima

carro = Carro.new(3)
p carro.velocidade_maxima