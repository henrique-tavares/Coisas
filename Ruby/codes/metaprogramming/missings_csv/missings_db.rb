class Module
  def const_missing(const)
    unless File.exist?("database/#{const}.csv")
      puts "Classe #{const} não encontrada!"
      return
    end

    const_set(const, Class.new)
    klass = const_get(const)

    File.open("database/#{const}.csv") do |arquivo|
      campos = arquivo.gets.chomp.split(";")

      campos.each do |campo|
        klass.class_eval do
          attr_accessor campo.to_sym
        end
      end
    end

    klass
  end
end

pe = Pessoa.new
pe.nome = "Jorge"
puts pe.nome
puts pe.methods - Class.methods
