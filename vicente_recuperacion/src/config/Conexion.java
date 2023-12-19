package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    private Connection con;

    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jhoan", "root", "");
        } catch (Exception e) {
        }
    }

    public Connection getConnection() {
        return con;
    }
}


