from math import hypot

cateto_op = float(input("Comprimento do cateto oposto: "))
cateto_ad = float(input("Comprimento do cateto adjascente: "))

print("\nA hipotenusa vai medir {:.2f}".format(hypot(cateto_op, cateto_ad)))