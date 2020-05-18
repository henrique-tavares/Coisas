###################################################################################

module Utilidades
  class Cpf
    def validar
      "cpf válido"
    end
  end
  
  class Cnpj
    def validar
      "cnpj válido"
    end
  end
end

puts Utilidades::Cpf, Utilidades::Cnpj, ""
puts Utilidades::Cpf.new.validar, Utilidades::Cnpj.new.validar
puts "=" * 30

###################################################################################

module Validacoes
  def validar_cpf
    "cpf válido"
  end
  
  def validar_cnpj
    "cnpj válido"
  end
end

class TesteValidacoes1
  include Validacoes
end

class TesteValidacoes2
  extend Validacoes
end

class TesteValidacoes3
  class << self
    include Validacoes
  end
end

teste_validacoes4 = "teste 4"
teste_validacoes4.extend Validacoes

puts TesteValidacoes1, TesteValidacoes1.new.validar_cpf, TesteValidacoes1.new.validar_cnpj, ""
puts TesteValidacoes2, TesteValidacoes2.validar_cpf, TesteValidacoes2.validar_cnpj, ""
puts TesteValidacoes3, TesteValidacoes3.validar_cpf, TesteValidacoes3.validar_cnpj, ""
puts teste_validacoes4, teste_validacoes4.validar_cpf, teste_validacoes4.validar_cnpj
puts "=" * 30

###################################################################################

module Teste1
  def oi
    "ola"
  end
end

module Teste2
  def ola
    "oi"
  end
end

String.include Teste1
String.extend Teste2

puts "Srting: instancias" ,String.new.oi, "aaaaaa".oi, ""
puts String, String.ola
puts "=" * 30

###################################################################################

module InstanciaClasse1
  module Instancia
    def de_instancia1
      "Instancia 1"
    end
  end
  
  module Classe
    def de_classe1
      "Classe 1"
    end
  end
end

module InstanciaClasse2
  def de_instancia2
    "Instancia 2"
  end
  
  def self.included(cls)
    # puts "=" * 20, self, cls, "=" * 20
    cls.extend Classe
  end
  
  module Classe
    def de_classe2
      "Classe 2"
    end
  end
end

class TesteInstanciaClasse1
  include InstanciaClasse1::Instancia
  extend InstanciaClasse1::Classe
end

class TesteInstanciaClasse2
  include InstanciaClasse2
end

puts TesteInstanciaClasse1, TesteInstanciaClasse1.new.de_instancia1, TesteInstanciaClasse1.de_classe1, ""
puts TesteInstanciaClasse2, TesteInstanciaClasse2.new.de_instancia2, TesteInstanciaClasse2.de_classe2
puts "=" * 30

###################################################################################