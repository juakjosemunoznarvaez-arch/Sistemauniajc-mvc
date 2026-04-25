package com.uniajc.modelo.entidad;

public class Estudiante {

    private int idEstudiante;
    private String nombre;
    private String programa;

    public Estudiante(int idEstudiante, String nombre, String programa) {
        this.idEstudiante = idEstudiante;
        this.nombre = nombre;
        this.programa = programa;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrograma() {
        return programa;
    }
}