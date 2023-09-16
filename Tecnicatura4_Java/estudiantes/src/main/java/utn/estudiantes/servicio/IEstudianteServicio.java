
package utn.estudiantes.servicio;

import java.util.List;
import utn.estudiantes.modelo.Estudiante;

public interface IEstudianteServicio {
    public List<Estudiante> listarEstudiantes();
    public Estudiante buscarEstudiantePorId(Integer idEstudiante);
    public void guardarEstudiante(Estudiante estudiante);
    public void eliminarEstudiante(Estudiante estudiante);
}
