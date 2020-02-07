num = float(input("\nDigite um número para ver sua tabuada: "))

if (num.is_integer()): num = int(num)

print("")

for i in range(1,11):
    print("{} x {:2} = {}".format(num, i, num * i))

print("")