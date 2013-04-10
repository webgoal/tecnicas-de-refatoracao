class Animal 
  def initialize(tipo)
    self.tipo = tipo
  end  

  def tipo
    @tipo
  end

  def tipo= (tipo)
    case tipo
      when TipoAnimal::CACHORRO
        @tipo = Cachorro.new
      when TipoAnimal::GATO
        @tipo = Gato.new
      when TipoAnimal::CAVALO
        @tipo = Cavalo.new
      else
        raise NotImplementedError
      end 
  end

  def falar
    @tipo.falar
  end
 
end

module TipoAnimal
  CACHORRO = 1
  GATO = 2
  CAVALO = 3
end

class Cachorro
  def tipo
    CACHORRO
  end

  def falar
    'late'
  end
end 

class Gato
  def tipo
    GATO
  end

  def falar
    'mia'
  end
end 

class Cavalo
  def tipo
    CAVALO
  end

  def falar
    'relincha'
  end
end 


require "test/unit"
class TestAnimal < Test::Unit::TestCase
  def test_cachorro
    animal = Animal.new(TipoAnimal::CACHORRO)
    assert_equal('late', animal.falar)
  end

  def test_gato
    animal = Animal.new(TipoAnimal::GATO)
    assert_equal('mia', animal.falar)
  end

  def test_cavalo
    animal = Animal.new(TipoAnimal::CAVALO)
    assert_equal('relincha', animal.falar)
  end
end