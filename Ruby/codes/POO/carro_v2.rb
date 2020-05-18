class Carro
  attr_accessor :marca, :modelo, :cor

  def initialize(marca, modelo)
    @marca = marca
    @modelo = modelo
  end

  def mostrar
    puts "Marca: #{marca} - Modelo: #{modelo} - Cor: #{cor}"
  end

  private

  def algo_mais_privado
    "este é um método privado"
  end

  protected

  def algo_mais_protegido
    "este é um método protegido"
  end

  public

  def algo_mais_publico
    "este é um método público"
  end
end
