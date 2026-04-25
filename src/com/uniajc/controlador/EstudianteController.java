package com.uniajc.controlador;

import com.uniajc.modelo.dao.EstudianteDAO;
import com.uniajc.modelo.entidad.Estudiante;

public class EstudianteController {

    private EstudianteDAO dao = new EstudianteDAO();

    public void crearEstudiante(Estudiante estudiante) {
        dao.insertar(estudiante);
    }
}