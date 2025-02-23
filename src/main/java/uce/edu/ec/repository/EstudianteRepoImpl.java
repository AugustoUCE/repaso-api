package uce.edu.ec.repository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import uce.edu.ec.repository.model.Estudiante;

import java.util.List;

@Transactional
@ApplicationScoped
public class EstudianteRepoImpl implements EstudianteRepo {
    @PersistenceContext
    private EntityManager entityManager;


    public void ingresarEstudiante(Estudiante estudiante) {
        // TODO implement here
        this.entityManager.persist(estudiante);
    }

    public void actualizarEstudiante(Estudiante estudiante) {
        // TODO implement here
        this.entityManager.merge(estudiante);
    }

    public void eliminarEstudiante(Integer id) {


        this.entityManager.remove(this.obtenerEstudiante(id));
    }

    public Estudiante obtenerEstudiante(Integer id) {
        // TODO implement here

        return this.entityManager.find(Estudiante.class, id);
    }

    public List<Estudiante> obtenerEstudiantes() {
        // TODO implement here
        return null;
    }
}
