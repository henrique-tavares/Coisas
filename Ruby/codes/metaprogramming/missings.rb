################################## const_missing (Module) ##################################
class Module
  def const_missing(const)
    puts "Constante #{const} não encontrada!"
  end
end

puts Klass

################################## const_missing (Classe) ##################################
class Klass1
  # Teste = '212121'
  
  def self.const_missing(const)
    puts "Constante #{const} não existe em #{self}"
  end
end

puts Klass1::Teste

################################## method_missing (Classe) ##################################
class Klass2
  def method_missing(method_name)
    puts "Método #{method_name} não encontrado em #{self.class}"
  end

  def self.method_missing(class_method_name)
    puts "Método de classe #{class_method_name} não encontrado em #{self}"
  end
end

puts Klass2.teste, Klass2.new.teste