package com.uniajc.modelo.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionDatabase {

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/uniajc",
                "root",
                "3223051164"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}