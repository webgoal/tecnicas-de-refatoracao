require_relative 'color'

class LeapObject
  def self.criar(type)
    Object::const_get(type.capitalize).new()
  end
end

class ObjectType
  def dot_color
    @color.to_s
  end
end

class Finger < ObjectType
  def initialize
    @color = Color.blue
  end
end 

class Pointer < ObjectType
  def initialize
    @color = Color.red
  end
end

require "test/unit"
class TestLeapObjectColor < Test::Unit::TestCase
  def test_finger
    finger = LeapObject.criar(:finger)
    assert_equal('0000FF', finger.dot_color)
  end

  def test_pointer
    pointer = LeapObject.criar(:pointer)
    assert_equal('FF0000', pointer.dot_color)
  end
end