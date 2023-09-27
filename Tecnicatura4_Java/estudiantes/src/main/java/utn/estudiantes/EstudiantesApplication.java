package utn.estudiantes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotaation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import utn.estudiantes.servicio.EstudianteServicio;

@SpringBootApplication
public class EstudiantesApplication implements CommandLineRunner {

	@Autowired
	private EstudianteServicio estudianteServicio;
	private static final.Logger logger = LoggerFactory.getLogger(EstudiantesApplication.class);

	String nl = System.lineSeparator();
	public static void main(String[] args) {
		logger.info("Iniciando la aplicación...");
		//Levantar la fábrica de Spring
		SpringApplication.run(EstudiantesApplication.class, args)
		logger.info("Aplicación Finalizada!");

	}

	public static void main(String[] args) {

		SpringApplication.run(EstudiantesApplication.class, args);

	}

	@Override
	public void run(String[] args) throws Exception{
		logger.info(nl+"Ejecutando el método run de Spring..."+nl);

	}
}
