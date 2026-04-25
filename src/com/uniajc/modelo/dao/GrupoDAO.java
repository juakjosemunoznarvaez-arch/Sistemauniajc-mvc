package com.uniajc.modelo.dao;

import com.uniajc.modelo.conexion.ConexionDatabase;
import com.uniajc.modelo.entidad.Grupo;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class GrupoDAO {

    public void insertar(Grupo grupo) {

        String sql = "INSERT INTO grupo(id_materia, id_docente, aula, horario) VALUES (?, ?, ?, ?)";

        try (Connection conn = ConexionDatabase.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, grupo.getIdMateria());
            ps.setInt(2, grupo.getIdDocente());
            ps.setString(3, grupo.getAula());
            ps.setString(4, grupo.getHorario());

            ps.executeUpdate();

            System.out.println("Grupo guardado correctamente");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}