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
        

    
}
