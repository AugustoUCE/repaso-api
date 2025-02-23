package uce.edu.ec.controller;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import uce.edu.ec.service.EstudianteServ;
import uce.edu.ec.service.to.EstudianteTO;

@Path(value = "/estudiantes")
@ApplicationScoped
public class EstudianteController implements EstudianteServ {

    @Inject
    private EstudianteServ estudianteServ;

    @POST
    @Path("")
    @Consumes(MediaType.APPLICATION_JSON)

    public void ingresarEstudiante(EstudianteTO estudianteto) {
        this.estudianteServ.ingresarEstudiante(estudianteto);
    }

    @Override
    public void actualizarEstudiante(EstudianteTO estudianteto) {
        // Implementation here
    }

    @PUT
    @Path("/{id}")
    public void actualizarEstudiante(EstudianteTO estudianteto, @PathParam("id") Integer id) {
        estudianteto.setId(id);
        this.estudianteServ.actualizarEstudiante(estudianteto);
    }

    @DELETE
    @Path("/{id}")
    public void eliminarEstudiante(@PathParam("id") Integer id) {
        this.estudianteServ.eliminarEstudiante(id);
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public EstudianteTO obtenerEstudiante(@PathParam("id") Integer id) {
        return this.estudianteServ.obtenerEstudiante(id);
    }

}
