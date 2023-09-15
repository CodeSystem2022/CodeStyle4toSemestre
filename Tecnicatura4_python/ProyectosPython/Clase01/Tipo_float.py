# profundizando en el tipo float

a=3.0
print(f'a: {a}')

#constructor de tipo float
a= float(10)
print(f'a: {a}')

#tambien combierte de string a float
a= float('10')
print(f'a : {a}')

#notacion exponecial (valores positivo o negativos)

a= 3e50
print(f'a:{a:}')#muestra numero reducido
print(f'a:{a:5f}')#muestra nuemro completo

a= 3e-5
print(f'a:{a:.5f}')

#cualquioer calculo que incluyr un float,todo cambia a float

a= 4.5+5
print(f'a: {a}')

#