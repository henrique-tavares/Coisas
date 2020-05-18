a = "teste"

def a.olha
  "olha"
end

puts "a:", a, a.olha

b = a.clone

puts "b:", b, b.olha

c = a.dup

puts "c:", c # , c.olha
