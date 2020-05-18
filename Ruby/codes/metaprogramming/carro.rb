class Carro
  attr_accessor :nome, :painel, :roda
  attr_reader :pneu

  def initialize(nome = "Modelo padrão")
    @nome = nome
  end

  def mostrar(marca = "Marca padrão")
    "Marca: #{marca} - Modelo: #{nome}"
  end

  def self.metodo_de_clase
    "de classe"
  end
end

def Carro.metodo_de_clase2
  "de classe 2"
end

fiesta = Carro.new
golf = Carro.new

def fiesta.mostrar
  "Mostrar do fiesta"
end

def golf.mostrar
  "Mosrtar do golf"
end

puts Carro.new.mostrar
puts fiesta.mostrar
puts golf.mostrar
puts "=" * 30
puts Carro.metodo_de_clase
puts Carro.metodo_de_clase2
