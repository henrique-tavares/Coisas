################################ included e extended (módulo) ################################
module TesteModulo
  def self.included(klass)
    klass.class_eval do
      def de_instancia
        "método de instância"
      end
    end
    
    puts "Módulo #{self} incluído em #{klass}"
  end
  
  def self.extended(klass)
    klass.instance_eval do
      def de_classe
        "método de classe"
      end
    end
    
    puts "Módulo #{self} extendido em #{klass}"
  end

  def self.de_modulo
    "método de modulo"
  end
  
  def de_instancia_ou_classe
    "método de instância ou classe"
  end
end

class TesteIncluded
  include TesteModulo
end

class TesteExtended
  extend TesteModulo
end

puts "-------------------------"
puts TesteIncluded.new.de_instancia, TesteIncluded.new.de_instancia_ou_classe, TesteModulo.de_modulo
puts
puts TesteExtended.de_classe, TesteExtended.de_instancia_ou_classe, TesteModulo.de_modulo
puts "-------------------------"

################################ inherited (herança) ################################
class Pai
  def self.inherited(klass)
    puts "#{klass} herda de #{self}"
    @classes ||= []
    @classes << klass
  end
  
  def self.lista_de_classes
    @classes
  end
end

class Filho1 < Pai
end

class Filho2 < Pai
end

class Filho3 < Pai
end

class Filho4 < Pai
end

puts "-------------------------"
puts Pai.lista_de_classes
puts "-------------------------"
