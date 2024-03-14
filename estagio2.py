def verificar_fibonacci(numero):
    a, b = 0, 1
    while b < numero:
        a, b = b, a + b
    return b == numero

n = input('Digite um número qualquer ')
numero = int(n)

if (numero == 0):
    print('O número 0 pertence à sequência de Fibonacci')
elif verificar_fibonacci(numero):
    print('O número ', numero, ' pertence à sequencia de Fibonacci')
else:
    print('O número ', numero, ' não pertence à sequência de Fibonacci')