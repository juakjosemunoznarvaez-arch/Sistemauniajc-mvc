package com.uniajc.modelo.entidad;

public class Docente {

    private int idDocente;
    private String nombre;
    private String especialidad;

    public Docente(int idDocente, String nombre, String especialidad) {
        this.idDocente = idDocente;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }
}