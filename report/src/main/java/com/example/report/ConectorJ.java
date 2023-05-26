
package com.example.report;
import java.sql.Connection;
import java.sql.DriverManager;



public class ConectorJ {
    public static final String URL = "jdbc:mysql://localhost:3306/test?autoReconnect=true&useSSL=false";
    public static final String user = "root";
    public static final String password = "desarrollo";
    private Connection connection;

    public ConectorJ() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = (Connection)(DriverManager.getConnection(URL, user, password));
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.err.println(e.getMessage()  + "error" + e.getClass()    );
        }
    }

    public Connection gConnection() {
        return this.connection;
    }
}
