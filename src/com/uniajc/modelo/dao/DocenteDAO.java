package com.uniajc.modelo.dao;

import com.uniajc.modelo.conexion.ConexionDatabase;
import com.uniajc.modelo.entidad.Docente;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DocenteDAO {

    public void insertar(Docente docente) {
        String sql = "INSERT INTO docente(nombre, especialidad) VALUES (?, ?)";

        try (Connection conn = ConexionDatabase.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, docente.getNombre());
            ps.setString(2, docente.getEspecialidad());
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}