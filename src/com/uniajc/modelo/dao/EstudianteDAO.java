package com.uniajc.modelo.dao;

import com.uniajc.modelo.conexion.ConexionDatabase;
import com.uniajc.modelo.entidad.Estudiante;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EstudianteDAO {

    public void insertar(Estudiante estudiante) {

        String sql = "INSERT INTO estudiante(nombre, programa) VALUES (?, ?)";

        try (Connection conn = ConexionDatabase.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getPrograma());

            ps.executeUpdate();

            System.out.println("Estudiante guardado correctamente");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}