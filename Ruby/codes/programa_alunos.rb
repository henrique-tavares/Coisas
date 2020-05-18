def captura_aluno
  aluno = Hash.new

  puts

  print "Digite o nome do aluno: "
  aluno[:nome] = gets.chomp

  print "Digite o telefone do aluno: "
  aluno[:tel] = gets.to_i

  puts

  aluno
end

def mostra_aluno(aluno)
  puts "=" * 30
  puts "Aluno: #{aluno[:nome]}, Telefone: #{aluno[:tel]}"
  puts
end

alunos = Array.new

loop do
  alunos.push(captura_aluno)

  print "Deseja continuar (y/n): "
  res = gets.chomp

  break unless res.eql?("y") or res.eql?("Y")
end

alunos.each do |aluno|
  mostra_aluno(aluno)
end
