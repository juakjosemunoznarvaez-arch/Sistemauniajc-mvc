package com.uniajc.controlador;

import com.uniajc.modelo.dao.DocenteDAO;
import com.uniajc.modelo.entidad.Docente;

public class DocenteController {

    private DocenteDAO dao = new DocenteDAO();

    public void crearDocente(Docente docente) {
        dao.insertar(docente);
    }
}