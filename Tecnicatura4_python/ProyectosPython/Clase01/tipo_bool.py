
# Bool contiene los valores de Tru y Flase
# los tipos numéricos es false apra el 0(cero), true para losd emas valores

valor = 0
resultado=bool(valor)
print(f'valor: {valor}, Resultado: {resultado}')

valor = 0.1
resultado=bool(valor)
print(f'valor: {valor}, Resultado: {resultado}')

# Tipo String --> False '',  True para losd demas valores
valor = ''
resultado=bool(valor)
print(f'valor: {valor}, Resultado: {resultado}')

valor = 'Hola'
resultado=bool(valor)
print(f'valor: {valor}, Resultado: {resultado}')


#Tipo colecciones --> False apra conecciones vacias
#True para todas las demas
#Lista

valor = []
resultado=bool(valor)
print(f'valor de una lista vacia: {valor}, Resultado: {resultado}')

valor = [2,3,4]
resultado=bool(valor)
print(f'valor de una lista con elementos: {valor}, Resultado: {resultado}')

# Tupla
valor = ()
resultado=bool(valor)
print(f'valor de una tupla vacia: {valor}, Resultado: {resultado}')

valor = (5,)
resultado=bool(valor)
print(f'valor de una tupla con elementos: {valor}, Resultado: {resultado}')

#Diccionario
valor = {}
resultado=bool(valor)
print(f'valor de un diccionario vacio: {valor}, Resultado: {resultado}')

valor = {'nombre':'juan', 'Apellido':'Perez'}
resultado=bool(valor)
print(f'valor de un diccionario con elementos: {valor}, Resultado: {resultado}')

#Sentencias de control con bool

if(1,):
    print('Regresa verdadero')
else:
    print('Regresa falso')
    
#ciclos
variable =17
while variable:
    print('Regresa verdadero')
else:
    print('Regresa falso')