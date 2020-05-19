def metodo_bloco(&bloco)
  bloco
end

m = metodo_bloco do |p1, p2|
  puts "#{p1.inspect} - #{p2.inspect}"
end

m.call(7.9)

metodo_bloco do
  puts "............."
end.call

class Array
  def cada_um(&bloco)
    for i in (0...self.size)
      bloco.call(self[i])
    end
  end
end

[3, 4, 9, 0, 9, 45].cada_um do |num|
  puts "...#{num}..."
end

class Hash
  def cada_um(&bloco)
    for i in self.keys
      bloco.call(i, self[i])
    end
  end
end

{ nome: "asasasasas", nome2: "jdidlse", nome3: "dkslasf"}.cada_um do |key, value|
  puts "hash[#{key}] => #{value}"
end
