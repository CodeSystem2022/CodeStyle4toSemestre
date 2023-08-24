package UTN.presentacion;


import UTN.datos.EstudianteDAO;

import java.util.Scanner;

public class SistemaEstudiantesApp {
    public static void main(String[] args) {
        var salir = false;
        var consola = new Scanner(System.in);  //Para leer información de la consola
        // Se crea una instancia de la clase servicio, esto lo hacemos fuera del ciclo
        var estudianteDAO = new EstudianteDAO();  // Esta instancia debe hacerse una vez
        while(!salir){
            try {
                mostrarMenu(); // Mostramos el menú
                // El método ejecutarOpciones será el que devolverá un booleano
                salir = ejecutarOpciones(consola, estudianteDAO); //Este arroja una exception
            } catch (Exception e){
                System.out.println("Ocurrió un error al ejecutar la operación: "+e.getMessage());
            }
        } // Fin while
    }//Fin main

    private static void mostrarMenu(){
        System.out.print("""
                ***** Sistema de Estudiantes *****
                1. Listar estudiantes
                2. Buscar estudiante
                3. Agregar estudiante
                4. Modificar estudiante
                5. Eliminar estudiante
                6. Salir
                Elige una opción:
                """);
    } //fin mostrarMenu
    //Método para ejecutar las opciones, va a regresar un valor booleano, ya que es el que
    //puede modificar el valor de la variable salir, si es verdadero termina el coclo while

    private static boolean ejecutarOpciones(Scanner consola, EstudianteDAO estudianteDAO){

        }
    }//Fin main
}//Fin clase