################################################################################

class Teste
  def initialize
    @variavel = "nome"
  end

  def variavel=(value)
    @variavel = value
  end

  private

  def variavel_metodo
    @variavel
  end
end

teste = Teste.new

puts teste.instance_eval { @variavel }
teste.variavel = "emon"
puts teste.instance_eval { variavel_metodo }
puts

################################################################################

teste.instance_eval do
  puts self
end

Teste.instance_eval do
  puts self
end
puts

teste.instance_eval do
  def metodo
    "metodo"
  end

  def metodo2
    "metodo2"
  end
end

puts teste.metodo, teste.metodo2, ""

################################################################################

class Teste2
end

Teste2.instance_eval do
  def metodo_de_classe
    puts "metodo de classe"
  end

  def metodo_de_classe2
    puts "metodo de classe 2"
  end
end

Teste2.metodo_de_classe
Teste2.metodo_de_classe2
puts

################################################################################

class Teste3; end

Teste3.class_eval do
  def metodo_de_instancia
    puts "metodo de class_eval"
  end
  
  def metodo_de_instancia2
    puts "metodo de class_eval 2"
  end
end

Teste3.new.metodo_de_instancia
Teste3.new.metodo_de_instancia2
puts

################################################################################

String.class_eval do
  def teste
    "473829hrewio"
  end
end

str = "909"
def str.teste2
  "372iru3"
end

puts "aaaaaaaa".teste
puts "3".teste
puts str.teste2

String.instance_eval do
  def de_classe
    "--- de classe ---"
  end
end

def String.de_classe2
  "--- de classe 2 ---"
end

class << String
  def de_classe3
    "--- de classe 3 ---"
  end
end

puts String.de_classe
puts String.de_classe2
puts String.de_classe3
