p1 = Proc.new { |param| param * 7 }

p2 = Proc.new do |param|
  param = 0 if param.nil?
  param ** 2
end

p3 = proc do
  puts "ssssssssssss"
end

puts p1.call(10)
puts p1.call(8, 10, 9)
puts p2.call(5)
puts p2.call
p3.call
p3.call(7, 989)