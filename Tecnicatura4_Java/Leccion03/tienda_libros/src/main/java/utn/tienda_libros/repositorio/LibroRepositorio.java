package utn.tienda_libros.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import utn.tienda_libros.Modelo.Libro;

public class LibroRepositorio extends JpaRepository<Libro, Integer>{
    
}
