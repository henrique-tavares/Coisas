l1 = lambda { |param| param * 5 }

l2 = lambda do |p1, p2|
  p1 + p2
end

puts l1.call(7)
puts l2.call(4, 6)
