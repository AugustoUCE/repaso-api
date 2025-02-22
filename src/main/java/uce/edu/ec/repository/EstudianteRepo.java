package uce.edu.ec.repository;

import uce.edu.ec.repository.model.Estudiante;

import java.util.List;

public interface EstudianteRepo {

    public void ingresarEstudiante(Estudiante estudiante);
    public void actualizarEstudiante(Estudiante estudiante);
    public void eliminarEstudiante(Integer id);
    public Estudiante obtenerEstudiante(Integer id);
    public List<Estudiante> obtenerEstudiantes();

}
