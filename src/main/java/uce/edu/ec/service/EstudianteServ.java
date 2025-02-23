package uce.edu.ec.service;


import uce.edu.ec.service.to.EstudianteTO;
import java.util.List;

public interface EstudianteServ {

    public void ingresarEstudiante(EstudianteTO estudianteto);

    public void actualizarEstudiante(EstudianteTO estudianteto);

    public void eliminarEstudiante(Integer id);

    public EstudianteTO obtenerEstudiante(Integer id);



}
