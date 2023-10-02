package utn.estudiantes;

import java.util.List;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import utn.estudiantes.modelo.Estudiantes2022;
import utn.estudiantes.servicio.EstudianteServicio;

@SpringBootApplication
public class EstudiantesApplication implements CommandLineRunner {

	@Autowired
	private EstudianteServicio estudianteServicio;
	private static final Logger logger = LoggerFactory.getLogger(EstudiantesApplication.class);

	String nl = System.lineSeparator();
	public static void main(String[] args) {
		logger.info("Iniciando la aplicación...");
		//Levantar la fábrica de Spring
		SpringApplication.run(EstudiantesApplication.class, args);
		logger.info("Aplicación Finalizada!");

	}

    @Override
    public void run(String... args) throws Exception {
        logger.info(nl+"Ejecutando el método run de Spring..."+nl);
        var salir = false;
        var consola = new Scanner(System.in);
        while(!salir){
            mostrarMenu();
            salir = ejecutarOpciones(consola);
            logger.info(nl);
        } //Fin ciclo while
    }
    
    private void mostrarMenu(){
    //logger.info(nl);
    logger.info("******* Sistema de Estudiantes *******\n" + 
            "1. Listar Estudiantes\n" + 
            "2. Buscar Estudiante\n" + 
            "3. Agregar Estudiante\n" + 
            "4. Modificar Estudiante\n" + 
            "5. Eliminar Estudiante\n" + 
            "6. Salir\n" + "Elija una opcion: \n");
    } //fin del metodo mostrarMenu
    
    
    private boolean ejecutarOpciones(Scanner consola){
    var opcion = Integer.parseInt(consola.nextLine());
    var salir = false;
    switch (opcion){
        case 1 -> { //Listar estudiantes
            logger.info(nl+"Listado de estudiantes: "+nl);
            List<Estudiantes2022> estudiantes = estudianteServicio.listarEstudiantes();
            estudiantes.forEach((estudiante -> logger.info(estudiante.toString()+nl)));
        } // fin caso 1
        case 2 -> { //Buscar estudiante por id
            logger.info("Digite el id del estudiante a buscar: \n");
            var idEstudiante = Integer.parseInt(consola.nextLine());
            Estudiantes2022 estudiante =
                    estudianteServicio.buscarEstudiantePorId(idEstudiante);
            if(estudiante != null)
                logger.info("Estudiante encontrado: "+ estudiante + nl);
            else
                logger.info("Estudiante no encontrado: "+ estudiante +nl);
        } // fin caso 2
        case 3 -> { // Agregar estudiante
            logger.info("Agregar estudiante: "+nl);
            logger.info("Nombre: \n");
            var nombre = consola.nextLine();
            logger.info("Apellido: \n");
            var apellido = consola.nextLine();
            logger.info("Telefono: \n");
            var telefono = consola.nextLine();
            logger.info("Email: \n");
            var email = consola.nextLine();
            // Crear el objeto estudiante sin el id
            var estudiante = new Estudiantes2022();
            estudiante.setNombre(nombre);
            estudiante.setApellido(apellido);
            estudiante.setTelefono(telefono);
            estudiante.setEmail(email);
            estudianteServicio.guardarEstudiante(estudiante);
            logger.info("Estudiante agregado: "+estudiante+nl);
        } // fin caso 3
        case 4 -> { //Modificar estudiante
            logger.info("Modificar estudiante: "+nl);
            logger.info("Ingrese el id del estudiante: \n");
            var idEstudiante = Integer.parseInt(consola.nextLine());
            // buscamos el estudiante a modificar
            Estudiantes2022 estudiante =
                    estudianteServicio.buscarEstudiantePorId(idEstudiante);
            if(estudiante != null){
                logger.info("Nombre: \n");
                var nombre = consola.nextLine();
                logger.info("Apellido: \n");
                var apellido = consola.nextLine();
                logger.info("Telefono: \n");
                var telefono = consola.nextLine();
                logger.info("Email: \n");
                var email = consola.nextLine();
                estudiante.setNombre(nombre);
                estudiante.setApellido(apellido);
                estudiante.setTelefono(telefono);
                estudiante.setEmail(email);
                estudianteServicio.guardarEstudiante(estudiante);
                logger.info("Estudiante modificado: "+estudiante+nl);
            } //fin if
            else
                logger.info("Estudiante NO encontrado con el id: "+idEstudiante+nl);
        } // fin caso 4
        case 5 -> { //Eliminar estudiante
            logger.info("Eliminar estudiante: "+nl);
            logger.info("Digite el id del estudiante: \n");
            var idEstudiante = Integer.parseInt(consola.nextLine());
            //Buscamos el estudiante a eliminar
            var estudiante = estudianteServicio.buscarEstudiantePorId(idEstudiante);
            if(estudiante != null){
                estudianteServicio.eliminarEstudiante(estudiante);
                logger.info("Estudiante eliminado: "+estudiante+nl);
            } // fin if
            else
                logger.info("Estudiante NO encontrado con el id: "+idEstudiante+nl);
        } // fin caso 5
        case 6 -> { //salir
            logger.info("Hasta pronto!"+nl+nl);
            salir = true;
        } // fin caso 6
        default -> logger.info("Opcion no reconocida: "+opcion+nl);
        } //Fin del switch
        return salir;
    } // Fin del método ejecutarOpciones
    
}
