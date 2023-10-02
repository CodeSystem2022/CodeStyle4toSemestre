#5.4 Método Join
#help(str.join)

tupla_str= ('Hola', 'alumnos', 'Tecnicatura', 'Universitaria')
mensaje = ''.join(tupla_str)
print(f'Mensaje: {mensaje}')

lista_cursos = ['Java', 'Python', 'Angular', 'Spring']
mensaje = ','.join(lista_cursos)
print(f'Mensaje: {mensaje}')

cadena = 'HolaMundo'
mensaje = ','.join(cadena)

diccionario = {'nombre': 'Juan', 'Apellido': 'Perez', 'edad': '18'}
llaves = ','.join(diccionario.keys())
valores = ','.join(diccionario.values())
print(f'Llaves: {llaves}, Type: {type(llaves)}')