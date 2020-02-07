dist = float(input("\nQual a distancia da viagem em km? "))

if (dist > 200):
    print("\nO preço da sua passagem será de R${:.2f}".format(dist*0.45), end="\n\n")
    
else:
    print("\nO preço da sua passagem será de R${:.2f}".format(dist*0.5), end="\n\n")
