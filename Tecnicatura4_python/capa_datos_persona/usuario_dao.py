from cursor_del_pool import CursorDelPool
from logger_base import log
from Usuario import Usuario

class UsuarioDAO:
    
    _SELECT='SELECT * FROM  usuario ORDER BY id_usuario'
    _INSERTAR='INSERT INTO usuario(username, password) VALUES (%s, %s)'
    _ACTUALZAR= 'UPDATE usuario SET username=%s, password=%s WHERE id_usuario=%s'
    _ELIMINAR = 'DELETE FROM usuario WHERE id_usuario=%s'
    
    @classmethod
    def seleccionar(cls):
        with CursorDelPool() as cursor:
            log.debug("mensaje de depuracion")
            cursor.execute(cls._SELECT)
            registros = cursor.fetchall()
            usuarios = []
            for registro in registros:
                usuario = Usuario(registro[0],registro[1],registro[2])
                usuarios.append(usuario)
            return usuarios
    
    @classmethod
    def insertar(cls, usuario):
        with CursorDelPool() as cursor:
            log.debug(f'Usuario a insertar: {usuario}')
            valores = (usuario.username, usuario.password)
            cursor.execute()
            
    @classmethod 
    def actualizar(cls, usuario):
        with CursorDelPool() as cursor:
            log.debug(f'Usuario a actualizar: {usuario}')
            valores = (usuario.username, usuario.password, usuario.id_usuario)
            cursor.execute(cls._ACTUALZAR, valores)
            return cursor.rowcount
        
    @classmethod
    def eliminar(cls, usuario):
        with CursorDelPool() as cursor:
            log.debug(f'usuario a eliminar: {usuario}')
            valores =(usuario.id_usuario,)
            cursor.execute(cls._ELIMINAR, valores)
            return cursor.rowcount
        
if __name__ == '__main__':
    # Eliminar usuario
    usuario= Usuario(id_usuario=3)
    usuario_eliminado = UsuarioDAO.eliminar(usuario)
    log.debug(f'Usuario eliminado: {usuario_eliminado}')
    
    #Actualizar usuario
    usuario= Usuario(id_usuario=1, username='',password='369')
    usuario_modificado = UsuarioDAO.actualzar(usuario)
    log.debug(f'Usuario modificado: {usuario_modificado}')
    
    #Insertar usuario
    usuario= Usuario(username='kely',password='321')
    usuario_insertado = UsuarioDAO.insertar(usuario)
    log.debug(f'Usuario insertado: {usuario_insertado}')
    
    #Listar o seleccionar
    usuarios = UsuarioDAO.seleccionar()
    for usuario in usuarios:
        log.debug(usuario)
    