package uce.edu.ec.repository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import uce.edu.ec.repository.model.Estudiante;

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
    }

    public void eliminarEstudiante(Integer id) {
        this.entityManager.remove();
    }

    public Estudiante obtenerEstudiante(Integer id) {
        // TODO implement here
        return null;
    }

    public List<Estudiante> obtenerEstudiantes() {
        // TODO implement here
        return null;
    }
}
