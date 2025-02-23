package uce.edu.ec.service;

import java.util.List;
import java.util.function.Function;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import uce.edu.ec.repository.EstudianteRepo;
import uce.edu.ec.repository.model.Estudiante;
import uce.edu.ec.service.to.EstudianteTO;

@ApplicationScoped
public class EstudianteServImpl implements EstudianteServ {

    @Inject
    private EstudianteRepo estudianteRepo;

    //funcion
    //recibo un to y debo enviar un estudiante en db
    private  Function<EstudianteTO,Estudiante> mapEst= e->{
        Estudiante estudiante=new Estudiante(e.getId(),e.getNombre(),e.getApellido(),e.getFechaNacimiento());
        return estudiante;
    };
    private Function<Estudiante,EstudianteTO> mapto=e->{
        EstudianteTO estudianteTO=new EstudianteTO(e.getId(),e.getNombre(),e.getApellido(),e.getFechaNacimiento());
        return estudianteTO;
    };
    private Function<List<Estudiante>,List<EstudianteTO>> mapListEst=e->{
        List<EstudianteTO> listEst=e.stream().map(mapto).toList();
        return listEst;
    };


    @Override
    public void ingresarEstudiante(EstudianteTO estudianteto) {
        Estudiante estudiante=this.mapEst.apply(estudianteto);
        this.estudianteRepo.ingresarEstudiante(estudiante);

    }

    @Override
    public void actualizarEstudiante(EstudianteTO estudianteto) {
        Estudiante  estudiante=this.mapEst.apply(estudianteto);
        this.estudianteRepo.actualizarEstudiante(estudiante);


    }

    @Override
    public void eliminarEstudiante(Integer id) {

        this.estudianteRepo.eliminarEstudiante(id);
    }

    @Override
    public EstudianteTO obtenerEstudiante(Integer id) {
        Estudiante estudiante = this.estudianteRepo.obtenerEstudiante(id);

            return this.mapto.apply(estudiante);

    }

    public List<EstudianteTO> obtenerEstudiantes(){

        return this.mapListEst.apply(this.estudianteRepo.obtenerEstudiantes());
    }



}
