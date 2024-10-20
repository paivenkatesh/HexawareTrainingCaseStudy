package com.hexaware.cc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnUtil {
    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String connectionString = DBPropertyUtil.getConnectionString();
                connection = DriverManager.getConnection(connectionString, DBPropertyUtil.getUsername(), DBPropertyUtil.getPassword());
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}