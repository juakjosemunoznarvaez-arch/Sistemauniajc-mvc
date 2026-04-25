package com.uniajc.controlador;

import com.uniajc.modelo.dao.MateriaDAO;
import com.uniajc.modelo.entidad.Materia;

public class MateriaController {

    private MateriaDAO dao = new MateriaDAO();

    public void crearMateria(Materia materia) {
        dao.insertar(materia);
    }
}