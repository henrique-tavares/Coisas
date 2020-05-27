#########################################################################
# Definir classe em runtime

classe = "abc"
classe.capitalize!

eval("class #{classe}; end")

classe = Object.const_get(classe)
puts classe, classe.new, ""

#########################################################################
# Definir métodos em runtime

class Teste
  def self.definir(name)
    define_method(name) do
      puts "método em runtime"
    end
  end
end

Teste.definir("teste")
Teste.new.teste
puts

#########################################################################
# Definir varias classes em runtime

def definir_classe(classe)
  eval("class #{classe.capitalize}; end")
end

["Classe1", "classe2", "cLASse3"].each do |classe|
  definir_classe(classe)
end

puts Classe1, Classe1.new
puts Classe2, Classe2.new
puts Classe3, Classe3.new
puts

#########################################################################
# Definir varios métodos em runtime

class Teste2
  def self.definir(*metodos)
    metodos.each do |metodo|
      define_method(metodo) do
        puts "#{metodo} - método em runtime"
      end
    end
  end
end

Teste2.definir("metodo1", "metodo2", "metodo3")
teste2 = Teste2.new
print teste2.methods - Class.methods, "\n"
teste2.metodo1
teste2.metodo2
teste2.metodo3
puts

#########################################################################
# Definir classes e métodos em runtime

def definir_classe2(classe, nome_metodo)
  if classe.is_a?(String)
    classe.capitalize!
    eval("class #{classe}; end") unless Object.const_defined?(classe)
    classe = Object.const_get(classe)
  end
  
  classe.class_eval do
    define_method(nome_metodo) do |*params|
      puts "#{nome_metodo} - O valor dos parâmetros é #{params.join(", ")}"
    end
  end
end

["mostrar", "exibir", "visualizar"].each do |metodo|
  definir_classe2("teste3", metodo)
end

["mostrar", "exibir", "visualizar"].each do |metodo|
  Teste3.new.send(metodo, 1, 2, 3)
end
puts

["klass1", "klass2", "klass3"].each do |classe|
  puts classe.capitalize
  
  ["mostrar", "exibir", "visualizar"].each do |metodo|
    definir_classe2(classe, metodo)
    Object.const_get(classe).new.send(metodo, 1, 2, 3)
  end

  puts
end

#########################################################################
# Definir classes e métodos com hash em runtime

{
  "klass10": ["show1", "show2", "show3"],
  "klass20": ["print1", "print2", "print3"],
  "klass30": ["puts1", "puts2", "puts3"]
}.each do |classe, metodos|
  puts classe.capitalize

  metodos.each do |metodo|
    definir_classe2(classe.to_s, metodo)
    Object.const_get(classe.to_s.capitalize).new.send(metodo, 10, 20, 30)
  end

  puts
end

print Klass10.new.methods - Class.methods, "\n"
print Klass20.new.methods - Class.methods, "\n"
print Klass30.new.methods - Class.methods, "\n"
