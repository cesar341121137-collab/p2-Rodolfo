# idade = int(input("Digite sua idade: ")) 
# print(f"Sua idade é: {idade}. ")

try:
    idade = int(input("Digite sua idade: ")) 
    print(f"Sua idade é: {idade}. ")

except ValueError:
    print("Erro de operação: o valor inserido precisa ser apenas númerico")
    