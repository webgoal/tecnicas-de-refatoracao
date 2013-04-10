class Animal 
	def initialize(tipo)
		self.tipo= tipo
  end  

	def tipo
		@tipo
	end

	def tipo= (tipo)
		case tipo
  		when AbstractTipoAnimal::CACHORRO
  			@tipo = Cachorro.new
  	 	when AbstractTipoAnimal::GATO
  			@tipo = Gato.new
  		when AbstractTipoAnimal::CAVALO
  			@tipo = Cavalo.new
  		else
  			raise NotImplementedError
  		end	
	end

	def falar
		@tipo.falar
	end
 
end

class AbstractTipoAnimal
	CACHORRO = 1
	GATO = 2
	CAVALO = 3

end

class Cachorro < AbstractTipoAnimal
	def tipo
		CACHORRO
	end

	def falar
		'late'
	end
end	

class Gato < AbstractTipoAnimal
	def tipo
		GATO
	end

	def falar
		'mia'
	end
end	

class Cavalo < AbstractTipoAnimal
	def tipo
		CAVALO
	end

	def falar
		'relincha'
	end
end	

animal = Animal.new(1)
p animal.falar

animal = Animal.new(2)
p animal.falar

animal = Animal.new(3)
p animal.falar