class Carro
  def initialize(marca = "Marca genérica", modelo = "Modelo genérico")
    @marca = marca
    @modelo = modelo
  end

  def modelo
    @modelo
  end

  def modelo=(value)
    @modelo = value
  end

  def marca
    @marca
  end

  def marca=(value)
    @marca = value
  end

  def cor
    @cor
  end

  def cor=(value)
    @cor = value
  end

  def mostrar
    puts "Marca: #{marca} - Modelo: #{modelo}"
  end
end

c1 = Carro.new
c1.mostrar

c2 = Carro.new("Fiat", "Palio")
c2.mostrar

c3 = Carro.new
c3.marca = "Ford"
c3.modelo = "Fiesta"
c3.mostrar
