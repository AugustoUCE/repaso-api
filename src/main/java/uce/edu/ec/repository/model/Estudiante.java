package uce.edu.ec.repository.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "estudiante")
public class Estudiante {
    @Id
    @GeneratedValue(generator = "estudiante_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "estudiante_seq", sequenceName = "estudiante_seq", allocationSize = 1)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "fecha_nacimiento")
    private LocalDateTime fechaNacimiento;

    public Estudiante() {
    }

    public Estudiante(Integer id, String nombre, String apellido, LocalDateTime fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
