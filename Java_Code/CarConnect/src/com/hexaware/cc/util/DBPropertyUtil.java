package com.hexaware.cc.util;


public class DBPropertyUtil {

    private static final String HOSTNAME = "localhost";
    private static final String PORT = "3306";
    private static final String DBNAME = "carconnectcasestudy";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Venkatesh#12";

    public static String getConnectionString() {
        return "jdbc:mysql://" + HOSTNAME + ":" + PORT + "/" + DBNAME;
               
    }
    
    public static String getUsername() {
    	return USERNAME;
    }
    
    public static String getPassword() {
    	return PASSWORD;
    }
    
}