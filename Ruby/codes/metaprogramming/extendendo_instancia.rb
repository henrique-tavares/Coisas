teste = "teste"

def teste.olha0
  "olha 0"
end

class << teste
  puts self

  def olha1
    "olha 1"
  end

  def olha2
    "olha 2"
  end

  def olha3
    "olha 3"
  end
end

puts "", teste, teste.olha0, teste.olha1, teste.olha2, teste.olha3

class Klass
  def self.olha0
    "olha 0"
  end

  class << self
    attr_accessor :nome

    def olha1
      "olha 1"
    end

    def olha2
      "olha 2"
    end

    def olha3
      "olha 3"
    end
  end
end

Klass.nome = "sssss"

puts "", Klass, Klass.nome, Klass.olha0, Klass.olha1, Klass.olha2, Klass.olha3
