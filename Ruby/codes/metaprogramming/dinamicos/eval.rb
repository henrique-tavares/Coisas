teste = 9

eval("puts 'sssasss ' + teste.to_s")

atr = "opa"

eval("
  def #{atr}(value)
    @#{atr} = value
  end
")

eval("
  def mostra
    @#{atr}
  end
")

puts mostra
puts opa("alo")
puts mostra
