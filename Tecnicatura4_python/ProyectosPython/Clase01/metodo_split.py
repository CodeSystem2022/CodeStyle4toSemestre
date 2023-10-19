# help(str.split)

cursos = 'Java Javascript Node Python Diseño'
lista_cursos = cursos.split()
print(f'lista de cursos: {lista_cursos}')
print(type(lista_cursos))

cursos_separados_coma = 'Java,Python,Node,Javascript,Spring'
lista_cursos = cursos_separados_coma.split(',', 2) # busca 2 elementos y resto es el tercero
print(f'Lista de cursos: {lista_cursos}')
print(len(lista_cursos))