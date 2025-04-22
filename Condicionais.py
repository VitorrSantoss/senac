# DESAFIO 1
nome = input("Digite seu nome: ")
if nome == "alice" or nome =="bob":
    print("Olá {}, Que bom te ver!".format(nome))
else:
    print("Olá {}!".format(nome))


# DESAFIO 2
num = int(input("Digite um número: "))

if num % 2 ==0:
    print("O número {} é PAR".format(num))
else:
    print("O número {} é ÍMPAR".format(num))


# DESAFIO 3
print("Digite os três lados do triângulo")
lado1 = int(input("Lado 1: "))
lado2 = int(input("Lado 2: "))
lado3 = int(input("Lado 3: "))

if lado1 == lado2 == lado3:
    print("Trinângulo Equilátero")
elif lado1 == lado2 or lado1 == lado3 or lado2 == lado3:
    print("Trinângulo Isósceles")
else:
    print("Triângulo Escaleno")


# DESAFIO 4
pontuacao = int(input("Digite sua pontuação: "))
if pontuacao >= 5:
    print("Receberá um bonus de 10% do seu salário")
    sal = (1000 * 0.1) + 1000
    print(sal)
else:
    print("Não receberá bonús")








