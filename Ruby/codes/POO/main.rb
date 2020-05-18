require_relative "./carro_2.rb"
require_relative "./fiesta.rb"

c1 = Carro.new("Fiat", "Palio")
c1.cor = "Cinza"
puts c1.marca, c1.modelo, c1.cor
puts

c2 = Carro.new("Ford", "Fiesta")
c2.cor = 43265
c2.mostrar

puts c1.inspect, c2.inspect
puts

fiesta = Fiesta.new
fiesta.cor = "Branco"
fiesta.mostrar
puts fiesta.inspect
puts
