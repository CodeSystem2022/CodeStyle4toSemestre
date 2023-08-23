from Usuario import Usuario
from usuario_dao import UsuarioDAO
from logger_base import log

opcion = None
while opcion !=5:
    print('opciones: ')
    print('1. Listar usuario ')
    print('2. Agregar usuario ')
    print('3. modificar usuario ')
    print('4. Eliminar usuario ')
    print('5. Salir')
    opcion = int(input('Digite la opcion (1-5): '))
    
