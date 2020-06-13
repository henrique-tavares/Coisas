class Klass
  def ola
    "ola original"
  end
end

################################ Soberescrevendo e perdendo super ################################
class Klass2 < Klass
  def ola
    "ola sobrescrito - " + super
  end
end

puts "-------------------------"
klass2 = Klass2.new
puts klass2.ola
puts "-------------------------"

################################ Com alias ################################
class Klass3 < Klass
  alias_method :orig_ola, :ola

  def ola
    "ola sobrescrito"
  end

  def both_ola
    # orig_ola + " - " + ola
    send(:orig_ola) + " - " + ola
  end
end

puts "-------------------------"
klass3 = Klass3.new
puts klass3.ola, klass3.orig_ola, klass3.both_ola
puts "-------------------------"

################################ Com módulo ################################
module ModuloOverwrite
  def metodo(nome)
    nome_original = "orig_#{nome.to_s}"
    
    alias_method nome_original, nome
    
    define_method(nome) do
      "#{nome} sobrescrito modulo"
    end

    define_method("both_#{nome}") do
      send(nome_original) + " - " + send(nome)
    end
  end
end

class Klass4 < Klass
  extend ModuloOverwrite
  metodo :ola
end

puts "-------------------------"
klass4 = Klass4.new
puts klass4.ola, klass4.orig_ola, klass4.both_ola
puts "-------------------------"

################################ Com módulo passando bloco ################################
module ModuloOverwrite2
  def metodo(nome, &bloco)
    nome_original = "orig_#{nome.to_s}"
    
    alias_method nome_original, nome
    
    define_method(nome, &bloco)
    
    define_method("both_#{nome}") do
      send(nome_original) + " - " + send(nome)
    end
  end
end

class Klass5 < Klass
  extend ModuloOverwrite2
  metodo :ola do
    "ola sobrescrito modulo passando bloco"
  end
end

puts "-------------------------"
klass5 = Klass5.new
puts klass5.ola, klass5.orig_ola, klass5.both_ola
puts "-------------------------"
