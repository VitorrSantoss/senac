# Aulas - Python Senac 2025

## Tipos primitivos:
String | Int | Float | Boolean 
## Operadores aritimétricos: 
+ | - | / | * | %
```py
sb = float(input('Digite seu salário bruto: R$'))
h_extras = int(input('Quantas horas extras você possui?'))
v_H_extra = h_extras * 9.5
print('O valor da sua hora extra é de R${}'.format(v_H_extra))
comissao = 500
print('O valor de sua comissão fixa é de R${}'.format(comissao))
sal_bru = sb + v_H_extra + comissao
print('O seu salário bruto é de R${}'.format(sal_bru))
ir = 0.05
inss = 0.11
sal_liq = sal_bru * ir
print('Desconto do IR: R${:.2f}'.format(sal_liq))
sal_liq2 = sal_bru * inss
print(('Desconto do INSS: R${:.2f}'.format(sal_liq2)))
calculo_final = sal_bru - sal_liq - sal_liq2
print('Seu salário líquido é de R$ {:.2f}'.format(calculo_final))
```
## Estruturas Condicionais: 
(If/elif/else)
```py
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
```
## Estrutura de repetição: 
(For | While | While True)
