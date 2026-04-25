package com.uniajc.modelo.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.io.FileInputStream;

public class ConexionDatabase {

    public static Connection getConnection() {
        try {
            Properties props = new Properties();
            props.load(new FileInputStream("config.properties"));

            String url = props.getProperty("db.url");
            String user = props.getProperty("db.user");
            String password = props.getProperty("db.password");
            String driver = props.getProperty("db.driver");

            Class.forName(driver);

            return DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}