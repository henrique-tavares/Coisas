module AtributosDinamicos
  def atributos(*atrs)
    atrs.each do |atr|
      define_method("#{atr}=") do |value|
        instance_variable_set("@#{atr}", value)
      end

      define_method("#{atr}") do
        instance_variable_get("@#{atr}")
      end
    end
  end
end

class Teste
  extend AtributosDinamicos
  atributos :nome, :idade, :tel
end

teste = Teste.new

teste.nome = "Nome"
teste.idade = 9
puts teste.nome, teste.idade, teste.tel
