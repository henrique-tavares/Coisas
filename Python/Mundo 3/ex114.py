import urllib.request

try:
    site = urllib.request.urlopen('http://pudim.com.br/')

except:
    print("O site Pudim não está acessível no momento.")

else:
    print("Consegui acessar o site Pudim com suceeso.")

