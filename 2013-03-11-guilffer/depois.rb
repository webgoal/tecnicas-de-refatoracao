class Animal 
  def self.criar(tipo)
    Object::const_get(tipo.capitalize).new()
  end
end

class Cachorro
  def falar
    'late'
  end
end 

class Gato
  def falar
    'mia'
  end
end 

class Cavalo
  def falar
    'relincha'
  end
end 

class Popotamo
  def falar
    'esgrunha'
  end
end 

require "test/unit"
class TestAnimal < Test::Unit::TestCase
  def test_cachorro
    animal = Animal.criar(:cachorro)
    assert_equal('late', animal.falar)
  end

  def test_gato
    animal = Animal.criar(:gato)
    assert_equal('mia', animal.falar)
  end

  def test_cavalo
    animal = Animal.criar(:cavalo)
    assert_equal('relincha', animal.falar)
  end

  def test_popotamo
    animal = Animal.criar(:popotamo)
    assert_equal('esgrunha', animal.falar)
  end
end