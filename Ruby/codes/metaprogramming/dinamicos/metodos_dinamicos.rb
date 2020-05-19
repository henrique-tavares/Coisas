class Teste
  def self.definir(nome)
    define_method(nome) do |param1|
      puts "---#{param1}---"
    end
  end
end

[:m1, :m2, :m3].each do |atr|
  Teste.definir(atr)
end

Teste.definir("opa")

teste = Teste.new

teste.m1("metodo 1")
teste.m2("metodo 2")
teste.m3("metodo 3")
teste.opa("alo")
