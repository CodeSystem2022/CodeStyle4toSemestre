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
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        switch(opcion){
            case 1 -> {
                System.out.println("Listado de Estudiantes...");
                // no muestra la informacion, solo recupera la info y regresa una lista
                var estudiantes = estudianteDAO.listarEstudiantes();// recibe el listado
                //vamos a iterar cada objeto de tipo estudiante
                estudiantes.forEach(System.out::println);//para imprimir la lista
            }// Fin caso 1
            case 2 -> { // Buscar estudiante por id
                System.out.println("Introduce el id_estudiante a buscar: ");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                var estudiante = new Estudiante(idEstudiante);
                var encontrado = estudianteDAO.buscarEstudiantePorId(estudiante);
                if(encontrado)
                System.out.println("Estudiante encontrado: "+estudiante);
                else
                System.out.println("Estudiante NO encontrado:"+estudiante);                
            }//Fin caso 2
            case 3 -> {//Agregar estudiante
                System.out.println("Agregar estudiante: ");
                System.out.println("Nombre: ");
                var nombre = console.nextLine();
                System.out.println("Apellido: ");
                var apellido = console.nextLine();
                System.out.println("Telefono: ");
                var Telefono = console.nextLine();
                System.out.println("Email: ");
                var Email = console.nextLine();
                // crear objeto estudiante (sin id)
                var estudiante = new Estudiante(nombre, apellido, telefono, email);
                var agregado = estudianteDAO.agregarEstudiante(estudiante);
                if(agregado)
                System.out.println("Estudiante agregado"+estudiante);
                else
                System.out.println("Estudiandte NO agregado"+estudiante);     

            }// Fin caso 3
            case 4 -> {//Modificar Estudiante
                System.out.println("Modificar estudiante: ");
                // Aqui lo primero es especificar cual es el id del objeto a modificar
                System.out.println("Id Estudiante: ");
                var idEstudiante = Integer.parseInt(console.nextLine());
                System.out.println("Apellido: ");
                var apellido = console.nextLine();
                System.out.println("Telefono: ");
                var Telefono = console.nextLine();
                System.out.println("Email: ");
                var Email = console.nextLine();
                // crea el objeto estudiante a modificar
                var estudiante =
                new Estudiante(idEstudiante, nombre, apellido, telefono, email);
                var modificado = estudianteDAO.modificarEstudiante(estudiante);
                if(modificado)
                    System.out.println("Estudiante modificado: "+estudiante);
                else 
                    System.out.println("Estudiante NO modificado");
            }// Fin caso 4
            case 5 -> {//Eliminar estudiante
                System.out.println("Eliminar estudainte: ");
                System.out.println("Id estudiante; ");
                var idEstudiante = Integer.parseInt(console.nextLine());
                var estudainte = new Estudiante(idEstudiante);
                var eliminado = estudianteDAO.eliminarEstudiante(estudainte);
                if(eliminado)
                    System.out.println("Estudiante eliminado: "+estudainte);
                else 
                    System.out.println("Estudiante NO eliminado");                
            }// Fin caso 5
            case 6 -> {//salir
                System.out.println("Hasta pronto!!!");
                salir = true;            
            } // Fin case 6
            default -> System.out.println("Opción no renconocida, por favor ingrese otra opción");            
        }// Fin switch
        return salir;
        }
    }//Fin main
//Fin clase