package com.hexaware.cc.util;


public class DBPropertyUtil {

    private static final String HOSTNAME = "localhost";
    private static final String PORT = "3310";
    private static final String DBNAME = "car_connect";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "22647";

    public static String getConnectionString() {
        return "jdbc:mysql://" + HOSTNAME + ":" + PORT + "/" + DBNAME 
               + "?user=" + USERNAME + "&password=" + PASSWORD;
    }
}