package com.doctor.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DoctorDB {
	static Connection connection;
    public static Connection openConnection() {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String userName = "root";
        String password = "root";
        try {
            connection = DriverManager.getConnection(url,userName,password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
