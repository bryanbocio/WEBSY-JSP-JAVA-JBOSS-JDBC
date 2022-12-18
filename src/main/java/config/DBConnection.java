/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author xander
 */
public class DBConnection {

    Connection connection;

    public DBConnection() {
        try {
        	Class.forName("com.mysql.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","qqqquuuueeee");
            
        } catch (Exception e) {
               System.err.print(e);
        }
    }
    
    public Connection getConnection() {
    	return connection;
    }
}
