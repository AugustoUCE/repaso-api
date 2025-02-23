package uce.edu.ec.service;


import java.util.List;

import uce.edu.ec.service.to.EstudianteTO;

public interface EstudianteServ {

    public void ingresarEstudiante(EstudianteTO estudianteto);

    public void actualizarEstudiante(EstudianteTO estudianteto);

    public void eliminarEstudiante(Integer id);

    public EstudianteTO obtenerEstudiante(Integer id);
    
     public List<EstudianteTO> obtenerEstudiantes();



}
