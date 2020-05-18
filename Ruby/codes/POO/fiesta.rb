require_relative "carro_v2"

class Fiesta < Carro
  def initialize()
    @marca, @modelo = "Ford", "Fiesta"
  end

  def mostrar
    puts "este carro é um fiesta"
  end
end
