class Color 
  def initialize(red, green, blue)
    @red = red
    @green = green
    @blue = blue
  end

  def self.blue
    new(0, 0, 255)
  end

  def self.red
    new(255, 0, 0)
  end

  def to_s
    red = @red.to_s(16).ljust(2,'0')
      green = @green.to_s(16).ljust(2,'0')
      blue = @blue.to_s(16).ljust(2,'0')
      (red+green+blue).upcase
  end
end