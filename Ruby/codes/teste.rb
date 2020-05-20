def many_yields
  yield(:peanut)
  yield(:butter)
  yield(:and)
  yield(:jelly)
end

def test_methods_can_call_yield_many_times
  result = []
  many_yields { |item| result << item }
  result
end

puts test_methods_can_call_yield_many_times