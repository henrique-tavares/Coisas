num = float(input("Uma distância em metros: "))

print("A medida de {}m corresponde a".format(num))
print("{}km\n{}hm\n{}dam\n{}dm\n{}cm\n{}mm".format(num/1000, num/100, num/10, num*10, num*100, num*1000))