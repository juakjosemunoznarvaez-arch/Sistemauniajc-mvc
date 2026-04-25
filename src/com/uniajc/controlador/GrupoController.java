package com.uniajc.controlador;

import com.uniajc.modelo.dao.GrupoDAO;
import com.uniajc.modelo.entidad.Grupo;

public class GrupoController {

    private GrupoDAO dao = new GrupoDAO();

    public void crearGrupo(Grupo grupo) {
        dao.insertar(grupo);
    }
}