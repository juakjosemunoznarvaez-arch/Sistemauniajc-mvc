package com.uniajc.modelo.dao;

import com.uniajc.modelo.conexion.ConexionDatabase;
import com.uniajc.modelo.entidad.Materia;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class MateriaDAO {

    public void insertar(Materia materia) {
        String sql = "INSERT INTO materia(nombre_materia, creditos) VALUES (?, ?)";

        try (Connection conn = ConexionDatabase.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, materia.getNombreMateria());
            ps.setInt(2, materia.getCreditos());
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}